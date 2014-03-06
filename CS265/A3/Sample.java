// Sample - Example of using the Operand and Operator types in a generic
// 	container.
//
// 	Kurt Schmidt
// 	3/07
//
// 	javac 1.6.0, on Linux version 2.6.18.6 (root@tux64-08) (gcc version
// 		3.4.6 (Gentoo 3.4.6-r1, ssp-3.4.5-1.0, pie-8.7.9)) #1 SMP PREEMPT Thu
// 		Dec 28 10:24:03 EST 2006
//

import java.util.*;
import java.io.*;

public class Sample
{
	static public void main( String[] argv )
	{
		// Let's create a couple Operands and an Operator:
		Operand a = new Operand( 24 );
		Operand b = new Operand( 13 );
		Operator o = new Operator( opType.ADD );

		List<Token> list = new LinkedList<Token>();
		list.add( a );
		list.add( o );
		list.add( b );

		Token t = null;

		while( ! list.isEmpty() )
		{
			t = list.remove( 0 );
			if( t.isOperator() )
			{
				Operator op = (Operator)t;
				System.out.println( "We have an operator: "
						+ op.getVal().getName() );
			}
			else
				System.out.println( "We have an operand: "
						+ String.valueOf( ((Operand)t).getVal() ));
		}	// while
	}
}
