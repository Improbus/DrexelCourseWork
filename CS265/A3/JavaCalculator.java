/**
 * This program takes a file of expressions and transforms them into a state
 * in which this program can evaulate them
 * It converts infix to postfix and then evaluates the postfix expression
 *
 * Dan DeCamillo
 * 11-25-07
 * Assignment 3
 */
import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Stack;

/**
 * Public Class That Holds all of the Methods for the Calculator
 */
public class JavaCalculator
{

	/**
	 * This function takes in an ArrayList holding an infix expression
	 * and changes it into a postfix one for later evaluation
	 * @param infix ArrayList holding infix expressions
	 * @return postfix arraylist with postfix expression
	 */
	public static ArrayList<Token> infix2postfix(ArrayList<Token> infix)
	{
		
		ArrayList<Token> postfix = new ArrayList<Token>();
		infix.add(new Operator(opType.RPAR));

		Stack<Token> operators = new Stack<Token>();
		operators.push(new Operator(opType.LPAR));

		for(int i = 0; i<infix.size(); i++)
		{
			Token value = infix.get(i);
			if(value.isOperand())
			{
				postfix.add(value);
			}
			else
			{
				if(((Operator)value).getVal().getName().equals(")"))
				{
					while(!((Operator)operators.peek()).getVal().getName().equals("("))
				  {
						postfix.add(operators.pop());
					}
			      operators.pop();
				}
				else if(((Operator)value).getVal().getName().equals("("))
				{
					operators.push(value);
				}
				else
				{
					while(Operator.compare((Operator)value,(Operator)operators.peek()) <= 0)
					{
							postfix.add(operators.pop());
					}
					operators.push(value);
				}
			}
		}
		
		return postfix;
	}

	/**
	 * This method evaluates the postfix expression
	 * @param pf arraylist containing the postfix expression
	 * @return the integer value of the evaluated expression
	 */
	public static int evalPostfix(ArrayList<Token> pf)
	{
		
		Stack<Token> operators = new Stack<Token>();

		for(int i=0; i<pf.size(); i++)
		{
			Token value = pf.get(i);
			if(value.isOperand())
			{
				operators.push(value);
			}
			else
			{
				Operand a = (Operand)operators.pop();
				Operand b = (Operand)operators.pop();
				operators.push(new Operand(doTrans(a, b, (Operator)value)));
			}
		}
		return ((Operand)operators.pop()).getVal();
	}

	/**
	 * This method helps define the order of the evaluations in relation to
	 * the stack and returns the correct operation
	 * @param Operand a first operator
	 * @param Operand b second operator
	 * @param Operator Value of the operator
	 */ 
	public static int doTrans(Operand a, Operand b, Operator value)
	{
		int x = a.getVal();
		
		int y = b.getVal();
		
		String opTag = value.getVal().getName();

		if(opTag.equals("-"))
		{
			return x - y;
		}
		else if(opTag.equals("*"))
		{
			return x * y;
		}
		else if(opTag.equals("/"))
		{
			return x / y;				     
		}
		else if(opTag.equals("%"))
		{
			return x % y;				     
		}
		else if(opTag.equals("-"))
		{
			return x - y;				     
		}
		else
			return 0;
	}
	
	/**
	 *This method creates infix expressions to be passed into infix2postfix
	 *@param String read are the lines from the file
	 *@return ArrayList containing the postfix expression
	 */
	public static ArrayList<Token> createInfix(String read)
	{
		ArrayList<Token> l = new ArrayList<Token>();
		try
		{
			Scanner search = new Scanner(read);
			while(search.hasNext())
			{
				String in = search.next();

				if(in.equals("-"))
				{
					l.add(new Operator(opType.SUB));
				}
				else if(in.equals("+"))
				{
					l.add(new Operator(opType.ADD));
				}
				else if(in.equals("%"))
				{
					l.add(new Operator(opType.MOD));
				}
				else if(in.equals("*"))
				{
					l.add(new Operator(opType.MULT));
				}
				if(in.equals("/"))
				{
					l.add(new Operator(opType.DIV));
				}
				else if(in.equals(")"))
				{
					l.add(new Operator(opType.RPAR));
				}
				else if(in.equals("("))
				{
					l.add(new Operator(opType.LPAR));
				}
				else
				{
					l.add(new Operand(Integer.parseInt(in)));
				}
			}
		}
		catch(Exception e){}
		
		return l;
	}

	/**
	 * This is the main of the program that allows file reading and the
	 * execution of all the methods
	 * @param String args[] command line arguments
	 */
	public static void main(String[] args)
	{
		try
		{
			Scanner search = new Scanner(new File(args[0]));
			while(search.hasNextLine())
			{
				String in = search.nextLine();
				System.out.println(evalPostfix(infix2postfix(createInfix(in))));
			}
		}
		catch(Exception e){}
	}
}
