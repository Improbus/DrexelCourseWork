import java.io.*;

class athletetime {
    public static void main(String[] args) {

        System.out.print("Enter the Athlete's Name: ");

				BufferedReader namereader = new BufferedReader(new InputStreamReader(System.in));

				String name = null;

				try{
					name = namereader.readLine();
				} catch (IOException ioe) {

					System.out.println("Error Reading Name Now Exiting");

					System.exit(1);}
 
    		
	
        System.out.print("Enter the Athlete's Time: ");

        BufferedReader timereader = new BufferedReader(new InputStreamReader(System.in));

        double time = 0 ;
 
				time= timereader.readLine();
        

				double yard = 0.9144 ;

				double mtime = time / yard ;

				System.out.print( name + "Time for 100 Meter = " + mtime) ;



}}
