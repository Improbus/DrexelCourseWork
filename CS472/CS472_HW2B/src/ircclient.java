/*
 * 
 */
import java.io.*; 
import java.net.*;

/**
 * The Class ircclient.
 */
public class ircclient {

	/** The nickname. */
	public static String nickname;

	/** The modified sentence. */
	public static String modifiedSentence; 

	/** The Host name. */
	public static String HostName;

	/** The Server name. */
	public static String ServerName;

	/** The Real name. */
	public static String RealName;

	/** The Channel name. */
	public static String ChannelName;

	/** The Target. */
	public static String Target;

	/** The Message. */
	public static String Message;

	/** The Reason. */
	public static String Reason;

	/** The USER. */
	public static String USER;

	/** The plusminus. */
	public static String plusminus;

	/** The operator. */
	public static String operator;

	/** The Responses. */
	public static String[] Responses;

	/** The Line. */
	public static String Line;


	/**
	 * The main method.
	 * 
	 * @param argv the arguments
	 * 
	 * @throws Exception the exception
	 */
	public static void main(String argv[]) throws Exception{

		//Process Arguments from Command Line
		String host = argv[0];
		String fileName = argv[1];
		String port = argv[2];
		int portNum = Integer.parseInt(port);

		//Create Log File
		File file = new File(fileName);
		Writer output = new BufferedWriter(new FileWriter(file));

		//Create Readers and Connection
		BufferedReader inFromUser = new BufferedReader(new InputStreamReader(System.in)); 
		Socket clientSocket = new Socket(host, portNum); 
		DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream()); 
		BufferedReader inFromServer = new BufferedReader(new InputStreamReader(clientSocket.getInputStream())); 

		//User Input Loop
		while(true){
			System.out.println("Enter A Command (NICK, USER, JOIN, MODE, PRIVMSG, PART, LUSERS, NAMES, LIST, QUIT)");
			String UserInput;
			UserInput = inFromUser.readLine();

			//Process NICK Command
			if(UserInput.equals("NICK")){
				System.out.println("ENTER A NICK");
				nickname = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.NICK(nickname) + '\n'); 
			}
			//Process USER Command
			else if(UserInput.equals("USER")){
				System.out.println("ENTER HOSTNAME");
				HostName = inFromUser.readLine();
				System.out.println("ENTER SERVERNAME");
				ServerName = inFromUser.readLine();
				System.out.println("ENTER REALNAME");
				RealName = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.USER(HostName, ServerName, RealName) +  '\n'); 
			}
			//Process JOIN Command
			else if(UserInput.equals("JOIN")){
				System.out.println("ENTER CHANNEL NAME");
				ChannelName = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.JOIN(ChannelName +  '\n')); 

			}
			//Process PRIVMSG Command
			else if(UserInput.equals("PRIVMSG")){
				System.out.println("SEND PRIVATE MESSAGE");
				System.out.println("ENTER TARGET USER");
				Target = inFromUser.readLine();
				System.out.println("ENTER MESSAGE");
				Message = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.PRIVMSG(Target, Message) +  '\n'); 
			}
			//Process MODE Command
			else if(UserInput.equals("MODE")){
				System.out.println("SETTING MODE");
				System.out.println("TARGET USER");
				USER = inFromUser.readLine();
				System.out.println("ADD (Enter +)  |  Remove (Enter -)");
				plusminus = inFromUser.readLine();
				System.out.println("Enter Operator |o|p|s|i|t|n|b|v");
				operator = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.MODE(USER, plusminus, operator) +  '\n');
			}
			//Process PART Command
			else if(UserInput.equals("PART")){
				System.out.println("ENTER CHANNEL THAT YOU WANT TO LEAVE | IF NO NAME IS GIVEN WILL LEAVE CURRENT CHANNEL");
				ChannelName = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.PART(ChannelName) + '\n');
			}
			//Process LUSERS Command
			else if(UserInput.equals("LUSERS")){
				System.out.println("LISTING USER STATS FOR SPECIFIED CHANNEL");
				System.out.println("ENTER CHANNEL THAT YOU WANT TO LIST | IF NO NAME IS GIVEN WILL LIST ALL CHANNELS");
				ChannelName = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.LUSERS(ChannelName) + '\n');
			}
			//Process NAMES Command
			else if(UserInput.equals("NAMES")){
				System.out.println("LISTING NAMES FOR SPECIFIED CHANNEL");
				System.out.println("ENTER CHANNEL THAT YOU WANT TO LIST | IF NO NAME IS GIVEN WILL LIST ALL NAMES");
				ChannelName = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.NAMES(ChannelName) + '\n');
			}
			//Process LIST Command
			else if(UserInput.equals("LIST")){
				System.out.println("LISTING CHANNELS");
				System.out.println("ENTER CHANNEL THAT YOU WANT TO LIST TOPICS | IF NO NAME IS GIVEN WILL LIST ALL CHANNELS");
				ChannelName = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.LIST(ChannelName) + '\n');
			}
			//Process QUIT Command
			else if(UserInput.equals("QUIT")){
				System.out.println("QUITTING IRC");
				System.out.println("REASON FOR QUITTING");
				Reason = inFromUser.readLine();
				outToServer.writeBytes(ircCommands.QUIT(Reason) +  '\n');

				//Create Log File and Process any Notices or Name Responses Received
				while(inFromServer.readLine() != null){
					modifiedSentence = inFromServer.readLine();
					output.write(modifiedSentence + '\n');
					try {
						Responses = modifiedSentence.split(" ");
					} catch (Exception e) {

					}
					if(Responses[1].equals("NOTICE")){
						System.out.println("NOTICE RESPONSE" + " " + modifiedSentence);
					}
					else if(Responses[1].equals("353")){
						System.out.println("NAME RESPONSE" + " " + modifiedSentence);
					}
				}
				output.close();
				clientSocket.close();
				System.exit(1);
			}
			else{
				System.out.println("INVALID COMMAND!!!!!!!!!!!!!!!");
			}
		}

	} 




}
