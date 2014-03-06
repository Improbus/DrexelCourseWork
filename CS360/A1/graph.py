#!/usr/bin/python

#Dan DeCamillo
#7-10-08
#Version 1.8
#Python DFA Parser and .dot file creator

#import headers needed 
import sys

#Error check for valid argument input
if int(len(sys.argv)) < 2:
		print "No Input Argument Given. Exiting."
		sys.exit()

#Opens input and output files
file = open( sys.argv[1], "r" )
out = open("out.dot", "w")

#reads file into a large list with each line being an index
allLines = file.readlines()

#Fetches Transitions and States
readamount = int( allLines[1] )
#print str(readamount)


#Prepares formatting for the .dot file
out.write('digraph fsm {\n')
out.write('rankdir="LR"\n')
out.write('start [shape="plaintext",label="start"]\n')
out.write('0 [shape="circle",label="S0"]\n')

#Creates state circles
for i in range(1,readamount):
	scount = str(i)
	lcount = str( 'S' + str(i))
	if int(i) == readamount-1 :
		out.write(scount)
		out.write(' [shape="doublecircle",label="')
		out.write(lcount)
		out.write('"]\n')
	else :
		out.write(scount)
		out.write(' [shape="circle",label="')
		out.write(lcount)
		out.write('"]\n')

#creates initial transition
out.write('start->0\n')

#Creates remainding transitions
for i in range (2, readamount+2):
	line = allLines[i]
	line = line.replace(")", "")
	line = line.replace("(", "")
	line = line.replace(" \n", "")
	#print line
	line = line.split(",")
	#print line
	#print len(line)
	tLet = str(line[1])
	#print tLet
	if int(len(line)) == 5:
		out.write(line[0])
		out.write('->')
		out.write(line[2])
		out.write(' [label="')
		out.write(tLet)
		out.write('"]\n')
		out.write(line[0])
		out.write('->')
		out.write(line[3])
		out.write(' [label="')
		out.write(tLet)
		out.write('"]\n')
		out.write(line[0])
		out.write('->')
		out.write(line[4])
		out.write(' [label="')
		out.write(tLet)
		out.write('"]\n')
	elif int(len(line)) == 4:
		out.write(line[0])
		out.write('->')
		out.write(line[2])
		out.write(' [label="')
		out.write(tLet)
		out.write('"]\n')
		out.write(line[0])
		out.write('->')
		out.write(line[3])
		out.write(' [label="')
		out.write(tLet)
		out.write('"]\n')
	else :
		out.write(line[0])
		out.write('->')
		out.write(line[2])
		out.write(' [label="')
		out.write(tLet)
		out.write('"]\n')

out.write('}')

file.close()
out.close()

