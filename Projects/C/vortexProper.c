/*
   ** client.c -- a stream socket client demo
   */

#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <errno.h>
#include <string.h>
#include <netdb.h>
#include <sys/types.h>
#include <netinet/in.h>
#include <sys/socket.h>

#include <arpa/inet.h>

#define PORT "5842" // the port client will be connecting to 

#define MAXDATASIZE 10 // max number of bytes we can get at once 

// get sockaddr, IPv4 or IPv6
void *get_in_addr(struct sockaddr *sa){
   if(sa->sa_family == AF_INET){
      return &(((struct sockaddr_in*)sa)->sin_addr);
   }

   return &(((struct sockaddr_in6*)sa)->sin6_addr);
}

int main(int argc, char *argv[]){
   int sockfd, numbytes;
   int buf[MAXDATASIZE];
   int add[MAXDATASIZE];
   struct addrinfo hints, * servinfo, *p;
   int rv;
   char s[INET6_ADDRSTRLEN];

   if(argc != 2){
      fprintf(stderr,"No address\n");
      exit(1);
   }

   memset(&hints, 0, sizeof hints);
   hints.ai_family = AF_UNSPEC;
   hints.ai_socktype = SOCK_STREAM;

   if((rv = getaddrinfo(argv[1], PORT, &hints, &servinfo)) != 0){
      fprintf(stderr, "getaddrinfo: %s\n", gai_strerror(rv));
      return 1;
   }
   printf("%s found\n",argv[1]);

   //loop thorugh all the results and connect to the first possible one
   for(p = servinfo; p != NULL; p = p->ai_next){
      if((sockfd = socket(p->ai_family, p->ai_socktype,
                  p->ai_protocol)) == -1){
         perror("client socket");
         continue;
      }
      printf("Socket assigned\n");
      
      if(connect(sockfd, p->ai_addr, p->ai_addrlen) == -1){
         close(sockfd);
         perror("client: connect");
         continue;
      }
      printf("connect returned successful\n");
      break;
   }

   if(p == NULL){
      fprintf(stderr, "client failed to connect\n");
      return 2;
   }

   inet_ntop(p->ai_family, get_in_addr((struct sockaddr *)p->ai_addr),
         s, sizeof s);
   printf("Client: connecting to %s\n", s);

   freeaddrinfo(servinfo);

   memset(&buf, 0, MAXDATASIZE);
   printf("Just to show buf was cleared: %d\n", buf[1]);
   if((numbytes = recv(sockfd, buf, MAXDATASIZE-1, 0)) == -1){
      perror("recv");
      exit(1);
   }

   //buf[numbytes] = '\0';
   //printf("Add %d\n", add[0]);

   printf("Client: received '%d'\n", buf[0]);
   printf("'%d'\n", buf[1]);
   printf("'%d'\n", buf[2]);
   printf("'%d'\n", buf[3]);




   close(sockfd);

   return 0;





}

