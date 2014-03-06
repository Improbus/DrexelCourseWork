#!/usr/bin/python

import timeit
import random

import prob1

myFile = file('times.txt','w')

j=0

while j <= 10:
	mytime = timeit.Timer('make_heap(n)', 'from prob1 import make_heap, n')
	delta = mytime.timeit(j)
	myFile.write( str(j) + ' ' + str(delta) )
	myFile.write('\n')
	j = j + 1

