#include <stdio.h>
#include <stdlib.h>
#include "bitset.h"
#define MAX 100

/*Parse a string, writting the elements to a bitset
  Return the bitset */
struct bitset * parse_string(char *input){
  struct bitset * result;
  result = bitset_new(256);

  int i;
  for(i =0;input[i] != '\0'; i++){
    bitset_add(result,input[i]);
  }
  return result;
}

int main(){

   struct bitset *mybitset,* myotherbitset;
   mybitset = bitset_new(8); //Make pointer from int without cast. What?
   bitset_add(mybitset,2);
   bitset_add(mybitset,4);
   printf("%d\n",isEven(mybitset));
   print_set(mybitset);
   //End checking*/
  
   int reverse_x = 0,length,bit_index;
   char input[100]; //Assumtion about user input....
   printf("Please enter in string of bits to process: ");
   scanf("%s",&input);
   printf("\n%s\n",input);
   length = strlen(input);
   reverse_x = length;
   while(reverse_x-- > 0){
      if(input[reverse_x] == '1'){
         printf("Hello\n");
      }
   }

   struct bitset * sets[(length / 8) + 1];



   /*This block creates two sets and reads in two strings
     It the puts the strings in the set */
  
   return 0;
    
}


