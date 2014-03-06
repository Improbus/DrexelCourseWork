#!/usr/bin/python

f = open( "students", "r" )  # open file for reading (default)

# get rid of leading/trailing whitespace (spaces, tabs, newlines)
l = f.readline()
while l :
	l = l.strip( ' \t\n' )
	noname = l.strip('abcdefghijklmnopqrstuvwxyz ')
	numberlist = noname.split()
	fsum = 0
	for i in numberlist :
		fsum += float(i)
		numberofterms = float(len(numberlist))
		average = (fsum / numberofterms)
				
	print l
	print noname
	print numberlist
	print fsum
	print "The Average is "
	print average
	l = f.readline()


