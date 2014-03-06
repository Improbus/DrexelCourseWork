/**Usage Information

1.  start the rmi registry in the same directory as the java class files.
	rmiregistry &
	
2. start the java server.
	java Server &
	
3. start running the client
	java Driver &
**/

import java.rmi.registry.*;
import java.rmi.server.*;

//The server is the class that runs server side and provides the remote functions that will be called
public class Server implements Library {
    
	static int numBooks = 5;
	Book A = new Book("The Fellowship of the Ring", true);
	Book B = new Book("The Two Towers", true);
	Book C = new Book("The Return of the King", true);
	Book D = new Book("The Hobbit", true);
	Book E = new Book("The Simirillion", true);
	
	//Server Constructor 
    public Server() {}

    //Function to check out a Book.  
    public synchronized void checkOut(int choice, int id) throws InterruptedException{
    	
    	//If else clause to check out the appropriate book
    	//if the book is available it is checked out if it is not available the thread waits
    	if(choice == 0){
    		if(A.isAvailable()){
    			
    			A.setAvailable(false);
    		}
    		else{
    			System.out.println("Client " + Integer.toString(id) + " is waiting for Book 0." );
    			wait();
    		}
    	}
    	else if(choice == 1){
    		if(B.isAvailable()){
    			
    			B.setAvailable(false);
    		}
    		else{
    			System.out.println("Client " + Integer.toString(id) + " is waiting for Book 1." );
    			wait();
    		}
    	}
    	else if(choice == 2){
    		if(C.isAvailable()){
    			
    			C.setAvailable(false);
    		}
    		else{
    			System.out.println("Client " + Integer.toString(id) + " is waiting for Book 2." );
    			wait();
    		}
    	}
    	else if(choice == 3){
    		if(D.isAvailable()){
    		
    			D.setAvailable(false);
    		}
    		else{
    			System.out.println("Client " + Integer.toString(id) + " is waiting for Book 3." );
    			wait();
    		}
    	}
    	else if(choice == 4){
    		if(E.isAvailable()){
    			
    			E.setAvailable(false);
    		}
    		else{
    			System.out.println("Client " + Integer.toString(id) + " is waiting for Book 4." );
    			wait();
    		}
    	}
    	
    	
    }
    
    //Function to check in books
    public synchronized void checkIn(int bookTaken, int id){
    	int returnBook = bookTaken;
    	
    	//if else clause to return the correct book
    	if(returnBook == 0){
    		A.setAvailable(true);
    	}
    	else if(returnBook == 1){
    		B.setAvailable(true);
       	}
    	else if(returnBook == 2){
    		C.setAvailable(true);
    	}
    	else if(returnBook == 3){
    		D.setAvailable(true);
    	}
    	else if(returnBook == 4){
    		E.setAvailable(true);
    	}
    	
    	
    	//notify the waiting clients that a book as been returned
    	notifyAll();
    }
    
    public static void main(String args[]) {

        try {
            Server obj = new Server();
            Library stub = (Library) UnicastRemoteObject.exportObject(obj, 0);
            // Automatically generate remote stub from remote object
            // Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Library", stub);
            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
