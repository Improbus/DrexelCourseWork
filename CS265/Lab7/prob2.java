import java.io.*;
import java.util.*;

public class prob2
{
	public static void main( String[] args) throws IOException
	{
		int num = Integer.parseInt(args[0]);
		if(num %2 == 0)
			System.out.println("This Number is Even");
		else
			System.out.println("This Number is Odd");
	}
}
