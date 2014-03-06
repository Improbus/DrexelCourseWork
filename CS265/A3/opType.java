// opType - just a pre-1.5 pattern for doing enumerations
//
// Kurt Schmidt
// 3/07
//
// EDITOR: tabstop=2, cols=80
//
// javac 1.6.0, on Linux version 2.6.18.6 (gcc version 3.4.6 (Gentoo
//		 3.4.6-r1, ssp-3.4.5-1.0, pie-8.7.9))
//

import java.io.*;

public final class opType {

	public static opType ADD = new opType( "+" , 1 );
	public static opType SUB = new opType( "-" , 1 );
	public static opType MULT = new opType( "*" , 2 );
	public static opType DIV = new opType( "/" , 2 );
	public static opType MOD = new opType( "%" , 2 );
	public static opType LPAR = new opType( "(" , 0 );
	public static opType RPAR = new opType( ")" , 0 );

	protected String name;
	protected int prec;

	public opType( String n, int p )
	{
		name = n;
		prec = p;
	}

	public int getPrec()
	{
		return prec;
	}
	
	public String getName()	// for debugging, maybe
	{
		return name;
	}

	

	public static int compare( Operator a, Operator b )
	{
		if( a.getPrec() == b.getPrec() )
			return 0;
		else if( a.getPrec() < b.getPrec() )
			return -1;
		else
			return 1;
	}

	public static void main( String argv[] )	// testing
	{
		opType a = opType.ADD;
		opType b = opType.ADD;
		opType c = opType.MULT;

		if( a != b )
			System.out.println( "a and b should be the same (ADD)" );

		if( a == c )
			System.out.println( "a and c should not be the same (ADD vs. MULT)" );

		if( b == c )
			System.out.println( "b and c should not be the same (ADD vs. MULT)" );

		System.out.println( "Done!" );
	}
}

