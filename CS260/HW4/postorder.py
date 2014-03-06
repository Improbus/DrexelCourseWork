#!/usr/bin/env python

from lexer import *

def print_pre():
	print "The Prefix Order is " 
	print Operators + Operands
	
def print_in():
	print "The Infix Order is " 
	print Infix

def print_post():
	print "The Postfix Order is "
	print Operands + Operators

while get_expression():
	t = get_next_token()
	Operators = []
	Operands = []
	Infix = []
	while t:
		Infix.append(t)
		if str.isdigit( t[0] ) : # we have a (non-negative) number
			Operands.append(t)
		else:
			Operators.append(t)
		t = get_next_token()
	print ''
	print_pre()
	print_in()
	print_post()



