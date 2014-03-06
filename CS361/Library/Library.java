import java.rmi.Remote;
import java.rmi.RemoteException;

//Interface for the client to interact with the server
public interface Library extends Remote{
	void checkOut(int choice, int id) throws RemoteException, InterruptedException;
	void checkIn(int bookTaken, int id) throws RemoteException;
}
