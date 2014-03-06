/**Usage Information

1.  start the rmi registry in the same directory as the java class files.
	rmiregistry &
	
2. start the java server.
	java Server &
	
3. start running the client
	java Driver &
**/

//Simple Driver to create multiple Clients to test the monitor functionality.
public class Driver {
	
	public static void main(String args[]) throws InterruptedException{
		
		int numClients = 5;
		String host = (args.length < 1) ? null : args[0];
		
		for(int i = 0; i < numClients; i++){
			new Client(i, host);
			System.out.println("Client : " + Integer.toString(i) + " Created.");
		}
		System.out.println("All Clients Created");
		
		  Thread.sleep(30000);
	      System.out.println("Time to Close the Library");
	      System.exit(0);
		
	}
	
	

}
