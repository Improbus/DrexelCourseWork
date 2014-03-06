import java.util.Date;

public class prob4
{
	public static void main(String[] args)
	{
		int selection = Integer.parseInt(args[0]);
		Date date = new Date();
		long time = date.getTime();

		switch(selection)
		{
			case 0:
				{
					System.out.println( time );
					break;
				}

			case 1:	
				{
					System.out.println((time/1000) ) ;
					break;
				}
			case 2:
				{
					System.out.println( time /(1000*60*60*24));
					break;
				}
			case 3:
				{
					System.out.println("The Current Time is: " +  date.toString()); 
					break;
				}
		}


	}
}
