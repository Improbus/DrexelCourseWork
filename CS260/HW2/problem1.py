#!/usr/bin/python
import cell

a = cell.Cell(5)
b = cell.Cell(6)

def list_concat(a,b):
	a.next = b
	return a
	
list_concat(a,b)

