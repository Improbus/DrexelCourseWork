public class prob3
{
	public static void main(String[] args)
	{
		int num = Integer.parseInt(args[0]);
		if(num % 4 == 0)
			if(num % 100 ==0||(num %100 == 0 && num % 400 ==0))
				System.out.println("This is a Leap Year");
			else
				System.out.println("This Year is Not a leap Year");
		else
		System.out.println("This Year is Not a leap Year");
	}
}

