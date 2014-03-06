// Operator.java - operator token (+ - * / ( ) %)
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
// 		operators (just +, -, *, /, %, parenthesis)
// 
//	This is so you can have a single container (Vector, ArrayList, whatever)
//	that holds an entire expression (Token).
//


public class Operator extends Token {

	protected opType val;

	public boolean isOperator() { return true; }
	public boolean isOperand() { return false; }

  protected int prec;

	public static int getPrec()
	
	{
		 return 0; 

	}

	// handy for comparing 2 operators
	public static int compare( Operator a, Operator b )
	{
		if( a.getPrec() == b.getPrec() )
			return 0;
		else if( a.getPrec() < b.getPrec() )
			return -1;
		else
			return 1;
	}

	public opType getVal() { return val; }

	public Operator( opType v ) { val = v; }

}	// class Operator
