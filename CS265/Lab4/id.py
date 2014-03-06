#!/usr/bin/python

import sys

filename=sys.argv[1]

f = open( filename, "r" )  # open file for reading (default)

IDS = {}
# get rid of leading/trailing whitespace (spaces, tabs, newlines)
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

