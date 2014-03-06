import java.net.*; 



public class ircserver {

	public static void main(String argv[]) throws Exception 
	{ 
		String log = argv[0];
		String port = argv[1];
		int portNum = Integer.parseInt(port);
		
		ServerSocket listeningSocket = new ServerSocket(portNum); 
		
		while(true) { 

			Socket connectionSocket = listeningSocket.accept(); 

			ircRequest request = new ircRequest(connectionSocket, log);
			
			Thread thread = new Thread(request);

			thread.start();

			
		} 
	}
} 





