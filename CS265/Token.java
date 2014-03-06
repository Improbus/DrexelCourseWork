// Token.java - base class for aa couple containers for tokens in an
//	 arithmetic expression
//
// Kurt Schmidt
// 3/07
//
// javac 1.6.0, on Linux version 2.6.18.6 (gcc version 3.4.6 (Gentoo
//		 3.4.6-r1, ssp-3.4.5-1.0, pie-8.7.9))
//
// EDITOR:  tabstop=2, cols=80
//
// NOTES:
// 	Tokens come in 2 flavors:
// 		operands (only integers here)
// 		operators (just +, -, *, /, exponentiation, parenthesis)
// 
//	This is so you can have a single container (Vector, ArrayList, whatever)
//	that holds an entire expression (Token).
//


abstract class Token {

	abstract boolean isOperator();
	abstract boolean isOperand();

}

