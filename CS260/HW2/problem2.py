#!/usr/bin/python
import cell

a = cell.Cell(5)
b = cell.Cell(6)

def list_concat_copy(a,b):
	data1 = a.data
	data2 = b.data
	return cell.Cell(data1, data2)

list_concat_copy(a,b)

