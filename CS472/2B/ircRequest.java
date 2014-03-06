import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.Writer;
import java.net.Socket;

final class ircRequest implements Runnable{

	Socket socket;
	String filename;

	public ircRequest(Socket socket, String filename) throws Exception 
	{
		this.socket = socket;
		this.filename = filename;
	}

	public void run()
	{
		try {
			processRequest();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	private void processRequest() throws Exception
	{
		String serverUpstream = "quack.cs.drexel.edu";
		int uPort = 9997;
		
		//Create Log File
		File file = new File(this.filename);
		Writer output = new BufferedWriter(new FileWriter(file));
		
		//Create Readers and Connection
		Socket clientSocket = new Socket(serverUpstream, uPort); 
		DataOutputStream outToParentServer = new DataOutputStream(clientSocket.getOutputStream()); 
		BufferedReader inFromParentServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 
		
		String readParent;
		
		String clientSentence; 
		
		BufferedReader inFromClient = new BufferedReader(new InputStreamReader(this.socket.getInputStream())); 

		DataOutputStream  outToClient = new DataOutputStream(this.socket.getOutputStream()); 
		
		outToClient.writeBytes("Welcome to an IRC Server");
		
		while(true){
			outToClient.writeBytes("Accepting Command Input: ");
			
			clientSentence = inFromClient.readLine(); 

			String[] clientCommand = clientSentence.split(" ");
			
			if(clientCommand[0].equals("NICK")){
				outToClient.writeBytes(ircServerResponses.NICK());
				outToParentServer.writeBytes("NICK" + " " + clientCommand[1] + '\n');
			}
			else if(clientCommand[0].equals("USER")){
				outToClient.writeBytes(ircServerResponses.USER());
				outToParentServer.writeBytes("USER" + " " + clientCommand[1] + " " + clientCommand[2] + " " + clientCommand[3] + " : " + clientCommand[5] + '\n');
			}
			else if(clientCommand[0].equals("JOIN")){
				outToClient.writeBytes(ircServerResponses.JOIN());
				outToParentServer.writeBytes("JOIN" + " " + clientCommand[1] + " " + clientCommand[2] + '\n');
			}
			else if(clientCommand[0].equals("PRIVMSG")){
				outToClient.writeBytes(ircServerResponses.PRIVMSG());
				outToParentServer.writeBytes("PRIVMSG" + " " + clientCommand[1] + " " + clientCommand[2] + '\n');
			}
			else if(clientCommand[0].equals("MODE")){
				outToClient.writeBytes(ircServerResponses.MODE());
				outToParentServer.writeBytes("MODE" + " " + clientCommand[1] + " " + clientCommand[2] + '\n');
			}
			else if(clientCommand[0].equals("PART")){
				outToClient.writeBytes(ircServerResponses.PART());
				outToParentServer.writeBytes("PART" + " " +  '\n');
			}
			else if(clientCommand[0].equals("LUSERS")){
				outToClient.writeBytes(ircServerResponses.LUSERS());
				outToParentServer.writeBytes("LUSERS" + " "  + '\n');
			}
			else if(clientCommand[0].equals("NAMES")){
				outToClient.writeBytes(ircServerResponses.NAMES());
				outToParentServer.writeBytes("NAMES" + " "  + '\n');	
			}
			else if(clientCommand[0].equals("LIST")){
				outToClient.writeBytes(ircServerResponses.LIST());
				outToParentServer.writeBytes("LIST" + " "  + '\n');
			}			
			else if(clientCommand[0].equals("QUIT")){
				outToClient.writeBytes(ircServerResponses.QUIT());
				outToParentServer.writeBytes("QUIT" + '\n');
				while(inFromParentServer.readLine() != null){
					readParent = inFromParentServer.readLine();
					output.write(readParent + '\n');
				}
				// Close streams and socket.
				output.close();
				outToClient.close();
				inFromClient.close();
				socket.close();
			}
			else{
				outToClient.writeBytes("INVALID COMMAND");
			}
			
		}
		

	}

	public Socket getSocket() {
		return socket;
	}

	public void setSocket(Socket socket) {
		this.socket = socket;
	}



}
