/**Usage Information

1.  start the rmi registry in the same directory as the java class files.
	rmiregistry &
	
2. start the java server.
	java Server &
	
3. start running the client
	java Driver &
**/

import java.rmi.registry.*;
import java.util.Random;

//Client class 
//is a thread checks books in and out
public class Client implements Runnable{

	//variable declarations
	protected String host;
	protected  int bookTaken;
	protected  int clientID;
	private  Random generator = new Random();
	private  int rand = 4;
	
	//constructor for clients
	public Client(int clientID, String host) {
		this.clientID = clientID;
    	this.host = host;
    	new Thread(this).start();
    }
	
	//Getters and Setters
    public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getBookTaken() {
		return bookTaken;
	}

	public void setBookTaken(int bookNum) {
		bookTaken = bookNum;
	}

	//Run Method for CLients to get the RMI registry and check out the books and then finally return them
	public void run() {
       while(true){
		try {
        	String host = this.getHost();
        	Registry registry = LocateRegistry.getRegistry(host);
            Library stub = (Library) registry.lookup("Library");
            int bookNum = generator.nextInt(rand); 
            stub.checkOut(bookNum, clientID);
            setBookTaken(bookNum);
            System.out.println("Client " + Integer.toString(clientID) + " checked out and is reading Book " + Integer.toString(bookNum));
            Thread.sleep((rand + 1) * 1000);
            stub.checkIn(bookNum, clientID);
            System.out.println("Client " + Integer.toString(clientID) + " is returning " + Integer.toString(bookNum));
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
	}
}
