#!/usr/bin/python
import random
import timeit

import cell
import problem1
import problem2

myFile = file('mydata.txt','w')

n=0

while n <= 15000:
	mytime = timeit.Timer('list_concat(a,b)', 'from problem1 import list_concat, a, b')
	delta = mytime.timeit(n)
	print 'Run Time for list_concat(a,b) ' + str(n) + ' elements is ' + str(delta)
	n = n + 1000

i = 0 

while i <= 15000:
	mytime = timeit.Timer('list_concat_copy(a,b)', 'from problem2 import list_concat_copy, a, b')
	delta = mytime.timeit(i)
	print 'Run Time for list_concat_copy(a,b) ' + str(i) + ' elements is ' + str(delta)
	i = i + 1000

j = 0

while j <= 15000:
	mytime = timeit.Timer('list_concat(a,b)', 'from problem1 import list_concat, a, b')
	mytime2 = timeit.Timer('list_concat_copy(a,b)', 'from problem2 import list_concat_copy, a, b')
	delta = mytime.timeit(j)
	alpha = mytime2.timeit(j)
	myFile.write( str(j) + ' ' + str(delta) + ' ' + str(alpha) )
	myFile.write('\n')
	j = j + 1000

myFile.close()

