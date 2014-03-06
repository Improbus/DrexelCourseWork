#!/usr/bin/python
import random
import timeit

import problem1
import problem2

myFile = file('problem3part1.txt','w')
myFile2 = file('problem3part2.txt','w')

j=0

while j <= 30:
	mytime = timeit.Timer('fib(n)', 'from problem1 import fib, n')
	mytime2 = timeit.Timer('fib_memo(n)','from problem2 import fib_memo, n, fibarray')
	delta = mytime.timeit(j)
	alpha = mytime2.timeit(j)
	myFile.write( str(j) + ' ' + str(delta) + ' ' + str(alpha) )
	myFile.write('\n')
	j = j + 1

i=0

while i <= 100:
	mytime2 = timeit.Timer('fib_memo(n)','from problem2 import fib_memo,n, fibarray')
	alpha = mytime2.timeit(i)
	myFile2.write( str(i) + ' ' + str(alpha) )
	myFile2.write('\n')
	i = i + 1

myFile.close()
myFile2.close()
																		
