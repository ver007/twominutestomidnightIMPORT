#!/usr/bin/python

import SocketServer
import hashlib
from crypto import *
import json
from misc import *
from ss import *

key = ""
dir_map = ""

#Should really move these into misc

class TCPServer(SocketServer.TCPServer):
	allow_reuse_address = True


class DirectoryServer(SocketServer.BaseRequestHandler, ServicesServer):


	def handle(self):
		temp = self.request.recv(msg_size)
		data = temp
		while len(temp) == msg_size:
			temp = self.request.recv(msg_size)
			data += temp
		
		data = json.loads(data, strict=False)
		#Two types of unencrypted packets, login request and requests (the contents of which is encrypted)
		if(data['type'] == "auth"):
			self.handle_auth(data, key)
		#Else, check if user is already authenticated
		elif(data['type'] == "request"):
			#If user authenticated
			if(self.users.has_key(data['user'])):
				message = decrypt(data['message'], self.users[data['user']])
				message = json.loads(message, strict=False)

				filename = message['file']
				args = message['args']

				#Server only has one function for the moment
				response = self.map_request(args)
				print response
				self.respond(response, data['user'])

	
	def map_request(self, filename):
		result = "not found"
		for i in dir_map:
			#Virtual drive
			temp = dir_map[i][0]
			if (filename.find(temp) != -1):
				filename = filename.split(temp)
				result = dir_map[i][1] + filename[1]
				result = json.dumps({"server" : i, "file" : result});
				break

		return result






	

if __name__ == "__main__":

	key = (read_config("./config/ds.json"))['key']
	dir_map = (read_config("./config/ds.json"))['directories']

	config = (read_config("./config/servers.json"))['servers']['ds']
	server = TCPServer((config[0], int(config[1])), DirectoryServer)

	try:
		print "Directory Server Running"
		server.serve_forever()
	except KeyboardInterrupt:
		server.shutdown()