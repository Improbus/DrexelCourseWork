#!/usr/bin/python

n = [0,1,9,2,8,3,7,4,6,5]

def make_heap( n ):
	heap = []
	i = 0
	for i in range(0,int(len(n))):
		heap.append(n[i])
	heap.sort()
	priority_quene = heap

def pop_quene(priority_quene):
	print priority_quene
	choice = int(raw_input("Please Select the index of the number you wish to be removed"))
	priority_quene = priority_quene.pop([choice])
	print priority_quene

def append_quene(priority_quene):
	print priority_quene
	choice = int(raw_input("Please Enter the Number to be added to the Quene"))
	priority_quene.append(choice)
	print priority_quene

make_heap(n)

