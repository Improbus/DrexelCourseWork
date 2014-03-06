/**
 * The Class ircCommands.
 */
public class ircCommands {
	
	/** The name. */
	public static String name;

	/**
	 * NICK.
	 * 
	 * @param nickname the nickname
	 * 
	 * @return the string
	 */
	public static String NICK(String nickname){
		setName(nickname);
		return "NICK" + " " + nickname;
	}

	/**
	 * USER.
	 * 
	 * @param HostName the host name
	 * @param ServerName the server name
	 * @param RealName the real name
	 * 
	 * @return the string
	 */
	public static String USER(String HostName, String ServerName, String RealName ){
		return "USER" + " " + getName() + " " + HostName + " " + ServerName + " : " + RealName ;
	}

	/**
	 * JOIN.
	 * 
	 * @param channelName the channel name
	 * 
	 * @return the string
	 */
	public static String JOIN(String channelName){
		return "JOIN" + " #" + channelName; 
	}

	/**
	 * PRIVMSG.
	 * 
	 * @param Target the target
	 * @param Message the message
	 * 
	 * @return the string
	 */
	public static String PRIVMSG(String Target, String Message){
		return "PRIVMSG" + " " + Target + " : " + Message; 
	}

	/**
	 * QUIT.
	 * 
	 * @param Reason the reason
	 * 
	 * @return the string
	 */
	public static String QUIT(String Reason){
		return "QUIT" + " : " + Reason ; 
	}

	/**
	 * MODE.
	 * 
	 * @param USER the uSER
	 * @param plusminus the plusminus
	 * @param Operator the operator
	 * 
	 * @return the string
	 */
	public static String MODE(String USER, String plusminus, String Operator){
		return "MODE" + " " + USER + " " + plusminus + Operator; 
	}

	/**
	 * PART.
	 * 
	 * @param Channel the channel
	 * 
	 * @return the string
	 */
	public static String PART(String Channel){
		if(Channel.equals(null)){
			return "PART";
		}
		else{
			return "PART" + " #" + Channel;
		}
	}

	/**
	 * LUSERS.
	 * 
	 * @param Channel the channel
	 * 
	 * @return the string
	 */
	public static String LUSERS(String Channel){
		if(Channel.equals(null)){
			return "LUSERS";	
		}
		else{
			return "LUSERS"+ " #" + Channel;
		}
	}
	
	/**
	 * NAMES.
	 * 
	 * @param Channel the channel
	 * 
	 * @return the string
	 */
	public static String NAMES(String Channel){
		if(Channel.equals(null)){
			return "NAMES";	
		}
		else{
			return "NAMES"+ " #" + Channel;
		}
	}
	
	/**
	 * LIST.
	 * 
	 * @param Channel the channel
	 * 
	 * @return the string
	 */
	public static String LIST(String Channel){
		if(Channel.equals(null)){
			return "LIST";	
		}
		else{
			return "LIST"+ " #" + Channel;
		}
	}

	/**
	 * Gets the name.
	 * 
	 * @return the name
	 */
	public static String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 * 
	 * @param nickname the new name
	 */
	public static void setName(String nickname) {
		name = nickname;
	}


}
