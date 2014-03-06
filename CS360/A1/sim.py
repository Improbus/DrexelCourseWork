#!/usr/bin/python

#Dan DeCamillo
#7-10-08
#Version 1.8
#Python DFA Parser and input checker

#import headers needed 
import sys

#Error check for valid argument input
if int(len(sys.argv)) < 2:
		print "No Input Argument Given. Exiting."
		sys.exit()

#Opens input and output files
file = open( sys.argv[1], "r" )

#reads file into a large list with each line being an index
allLines = file.readlines()

#Fetches Transitions and States
readamount = int( allLines[1] )


states = int( allLines[1] )


StateList = []

#Creates state circles
for i in range(states):
	StateList.append(i)



#creates initial Dictionaries
if states == 10:
	StateLib={}
	S0 = {}
	S1 = {}
	S2 = {}
	S3 = {}
	S4 = {}
	S5 = {}
	S6 = {}
	S7 = {}
	S8 = {}
	S9 = {}
elif states == 9:
	StateLib={}
	S0 = {}
	S1 = {}
	S2 = {}
	S3 = {}
	S4 = {}
	S5 = {}
	S6 = {}
	S7 = {}
	S8 = {}
elif states == 8:
	StateLib={}
	S0 = {}
	S1 = {}
	S2 = {}
	S3 = {}
	S4 = {}
	S5 = {}
	S6 = {}
	S7 = {}
elif states == 7:
	StateLib={}
	S0 = {}
	S1 = {}
	S2 = {}
	S3 = {}
	S4 = {}
	S5 = {}
	S6 = {}
elif states == 6:
	StateLib={}
	S0 = {}
	S1 = {}
	S2 = {}
	S3 = {}
	S4 = {}
	S5 = {}
elif states == 5:
	StateLib={}
	S0 = {}
	S1 = {}
	S2 = {}
	S3 = {}
	S4 = {}
elif states == 4:
	StateLib={}
	S0 = {}
	S1 = {}
	S2 = {}
	S3 = {}
												 
#Creates remainding transitions
for i in range (2, readamount+2):
	line = allLines[i]
	line = line.replace(")", "")
	line = line.replace("(", "")
	line = line.replace(" \n", "")
	line = line.replace("\n", "")
	#print line
	line = line.split(",")
	#print line
	#print len(line)
	tLet = str(line[1])
	#print tLet
	if int(line[0]) == 0 and str(line[1]) == 'a' :
		StateLib[0] = S0
		S0['a'] = line[2]
	elif int(line[0]) == 0 and str(line[1]) == 'b' :
		StateLib[0] = S0
		S0['b'] = line[2]
	elif int(line[0]) == 0 and str(line[1]) == 'EPSILON' :
		StateLib[0] = S0
		S0['EPSILON'] = line[2]

	elif int(line[0]) == 1 and str(line[1]) == 'a' :
		StateLib[1] = S1
		S1['a'] = line[2]
	elif int(line[0]) == 1 and str(line[1]) == 'b' :
		StateLib[1] = S1
		S1['b'] = line[2]
	elif int(line[0]) == 1 and str(line[1]) == 'EPSILON' :
		StateLib[1] = S1
		S1['s'] = line[2]

	elif int(line[0]) == 2 and str(line[1]) == 'a' :
		StateLib[2] = S2
		S2['a'] = line[2]
	elif int(line[0]) == 2 and str(line[1]) == 'b' :
		StateLib[2] = S2
		S2['b'] = line[2]
	elif int(line[0]) == 2 and str(line[1]) == 'EPSILON' :
		StateLib[2] = S2
		S2['s'] = line[2]

	elif int(line[0]) == 3 and str(line[1]) == 'a' :
		StateLib[3] = S3
		S3['a'] = line[2]
	elif int(line[0]) == 3 and str(line[1]) == 'b' :
		StateLib[3] = S3
		S3['b'] = line[2]
	elif int(line[0]) == 3 and str(line[1]) == 'EPSILON' :
		StateLib[3] = S3
		S3['s'] = line[2]

	elif int(line[0]) == 4 and str(line[1]) == 'a' :
		StateLib[4] = S4
		S4['a'] = line[2]
	elif int(line[0]) == 4 and str(line[1]) == 'b' :
		StateLib[4] = S4
		S4['b'] = line[2]
	elif int(line[0]) == 4 and str(line[1]) == 'EPSILON' :
		StateLib[4] = S4
		S4['s'] = line[2]

	elif int(line[0]) == 5 and str(line[1]) == 'a' :
		StateLib[5] = S5
		S5['a'] = line[2]
	elif int(line[0]) == 5 and str(line[1]) == 'b' :
		StateLib[5] = S5
		S5['b'] = line[2]
	elif int(line[0]) == 5 and str(line[1]) == 'EPSILON' :
		StateLib[5] = S5
		S5['s'] = line[2]

	elif int(line[0]) == 6 and str(line[1]) == 'a' :
		StateLib[6] = S6
		S6['a'] = line[2]
	elif int(line[0]) == 6 and str(line[1]) == 'b' :
		StateLib[6] = S6
		S6['b'] = line[2]
	elif int(line[0]) == 6 and str(line[1]) == 'EPSILON' :
		StateLib[6] = S6
		S6['s'] = line[2]

	elif int(line[0]) == 7 and str(line[1]) == 'a' :
		StateLib[7] = S7
		S7['a'] = line[2]
	elif int(line[0]) == 7 and str(line[1]) == 'b' :
		StateLib[7] = S7
		S7['b'] = line[2]
	elif int(line[0]) == 7 and str(line[1]) == 'EPSILON' :
		StateLib[7] = S7
		S7['s'] = line[2]

	elif int(line[0]) == 8 and str(line[1]) == 'a' :
		StateLib[8] = S8
		S8['a'] = line[2]
	elif int(line[0]) == 8 and str(line[1]) == 'b' :
		StateLib[8] = S8
		S8['b'] = line[2]
	elif int(line[0]) == 8 and str(line[1]) == 'EPSILON' :
		StateLib[8] = S8
		S8['s'] = line[2]

	elif int(line[0]) == 9 and str(line[1]) == 'a' :
		StateLib[9] = S9
		S9['a'] = line[2]
	elif int(line[0]) == 9 and str(line[1]) == 'b' :
		StateLib[9] = S9
		S9['b'] = line[2]
	elif int(line[0]) == 9 and str(line[1]) == 'EPSILON' :
		StateLib[9] = S9
		S9['s'] = line[2]

for i in range (readamount+2, int(len(allLines))-1):
	line = allLines[i]
	line = line.replace(" \n", "")
	line = line.replace("\n", "")
	line = list(line)
	
	print line

	for i in range (int(len(line))):
		if i == 0:
			State = 0
			if line[i] == 's':
				NextState = 1
			else:
				NextState = StateLib[State][line[i]]
		else :
			State = int(NextState)
			if State == 0:
				cLib = S0
			elif State == 1:
				cLib = S1
			elif State == 2:
				cLib = S2
			elif State == 3:
				cLib = S3
			elif State == 4:
				cLib = S4
			elif State == 5:
				cLib = S5
			elif State == 6:
				cLib = S6
			elif State == 7:
				cLib = S7
			elif State == 8:
				cLib = S8
			elif State == 9:
				cLib = S9
			if cLib.has_key(line[i]):
				NextState = StateLib[State][line[i]]
			else :
				if State == int(states -1) :
					print "This input String is Accepted"
				else:
					print "This input string is not Accepted"
				
file.close()

