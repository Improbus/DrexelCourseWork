#!/usr/bin/python

n = [0,1,2,3,4,5,6,7,8,9]

def Initialize(n):
	n[0] = [n[0]]
	n[1] = [n[1]]
	n[2] = [n[2]]
	n[3] = [n[3]]
	n[4] = [n[4]]
	n[5] = [n[5]]
	n[6] = [n[6]]
	n[7] = [n[7]]
	n[8] = [n[8]]
	n[9] = [n[9]]
	print n[0]

def Find(n):
	if n in n:
		if n == n:
			return n
	else:
		return Find(n)

def Merge(n , m):
	nRoot = Find(n)
	mRoot = Find(m)
	newSet = n + m

Initialize(n)


