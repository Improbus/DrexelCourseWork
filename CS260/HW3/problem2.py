#!/usr/bin/python

n=1

fibarray = {0:0, 1:1}

def fib_memo(n):
	if not n in fibarray:
		fibarray[n] = fib_memo(n-1) + fib_memo(n-2)
	return fibarray[n]
