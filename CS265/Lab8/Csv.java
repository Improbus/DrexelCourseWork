import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Csv
{

	File file;
	Scanner scan;
	String delimit;
	ArrayList<String> list;


	public Csv()
	{
		 delimit = ",";
		 list = new ArrayList<String>();
		 scan.useDelimiter(delimit);
	}

	public Csv(File in, String delimiter)
	{
		file = in;
		delimit = delimiter;
		list = new ArrayList<String>();
		try
		{
			scan = new Scanner(file);
		}
		catch(Exception e)
		{
		}
		scan.useDelimiter(delimit);

	}

	public String getline()
	{
		String temp;
		
		if(scan.hasNext())
		{
			temp = scan.nextLine();
			Scanner tempScan = new Scanner(temp);
			tempScan.useDelimiter(",");
			while(tempScan.hasNext())
				list.add(tempScan.next());
			return temp;
		}
		
		else
			return null;
				
	}

	public String getfield(int n)
	{
		for(int i = 0; scan.hasNext(); i++)
		{
			list.add(scan.next());
			if(i == n)
			{
				list.add(scan.next());
				return (String)list.get(list.size());
			}
		}

		return null;

	}

	public int getnfields()
	{
		int n = 0;
		while(scan.hasNext())
		{
			list.add(scan.next());
			n++;
		}

		return n;

	}

	public void print()
	{
		for(int i = 0; i < list.size(); i++)
			System.out.println("list[" + i + "] = " + list.get(i));
	}

	public static void main(String[] args)
	{
		Csv[] csv = new Csv[args.length];
		for(int i = 0; i < args.length; i++)
		{
			try
			{
				csv[i] = new Csv(new File(args[i]), ",");
				while(csv[i].getline() != null);
				csv[i].print();
			}
			catch(Exception e)
			{
				System.err.println(e.toString());
			}
		}		
	}

}
