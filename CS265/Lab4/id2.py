#!/usr/bin/python

import sys

if(len(sys.argv)==1) :

	l = raw_input("Enter the Information to be Processed: " )

	IDS = {}

	while l :
		l = l.strip( ' \t\n' )
		splitlist = l.split(" ", 1)
		IDS[int(splitlist[0])]=splitlist[1]
		dictlist = IDS.keys()
		dictlist.sort()
		l = raw_input("Enter the Information to be Processed: " )
	for i in dictlist :
		print str(i) + " " + IDS[i]

else :

	import sys

	filename=sys.argv[1]

	f = open( filename, "r" )  # open file for reading (default)

	IDS = {}
	l = f.readline()
	while l :
		l = l.strip( ' \t\n' )
		splitlist = l.split(" ", 1)
		IDS[int(splitlist[0])]=splitlist[1]
		dictlist = IDS.keys()
		dictlist.sort()
		l = f.readline()
	for i in dictlist :
		print str(i) + " " + IDS[i]

