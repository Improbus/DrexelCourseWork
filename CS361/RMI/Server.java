import java.rmi.registry.*;
import java.rmi.server.*;

public class Server implements Hello {
    
    public Server() {}

    public String sayHello() {
        return "You are connected to Computer WS-78";
    }
    
    public static void main(String args[]) {

        try {
            Server obj = new Server();
            Hello stub = (Hello) UnicastRemoteObject.exportObject(obj, 0);
	// Automatically generate remote stub from remote object
// Bind the remote object's stub in the registry
            Registry registry = LocateRegistry.getRegistry();
            registry.bind("Hello", stub);

            System.err.println("Server ready");
        } catch (Exception e) {
            System.err.println("Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
