#!/usr/bin/python

def RadixSort(j,k,maxLen):
	
	for x in range(maxLen):
		bins = [[] for i in range(k)]
	
		for y in j:
			bins[(y/10**x)%k].append(y)
		
		j=[]
		
		for section in bins:
			j.extend(section)
	
	print j
	return j

j=[0,1,9,2,3,8,7,4,5,6,11,90,87,34,56,76,14,23,56,78,88,97,65,99,44]

RadixSort(j,10,6)
