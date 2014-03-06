package dragonchess.network;

import java.net.InetAddress;

import dragonchess.ChessException;

/**
 * This interface specifies the behavior of a NetworkConnection.
 *
 * @author Group 4
 */
public interface NetworkConnection {

	/**
	 * Return the port this Client/Server is listening on/connecting to.
	 */
	public int getPort();

	/**
	 * Set the port this Client/Server is listening on/connecting to.
	 *
	 * @param port
	 */
	public void setPort(int port);

	/**
	 * Return the host this Client/Server is listening on/connecting to.
	 */
	public InetAddress getHost();

	/**
	 * Set the host this Client/Server is listening on/connecting to.
	 *
	 * @param host
	 */
	public void setHost(InetAddress host);

	/**
	 * Return true is this NetworkConnection is a server.
	 */
	public boolean isServer();

	/**
	 * Start this NetworkConnection.
	 *
	 * @throws ChessException if client/server has been disconnected,
	 * or connection to client/server cannot be established.
	 */
	public void connect() throws ChessException;

	/**
	 * Stop this NetworkConnection.
	 */
	public void disconnect();

	/**
	 * Receive a messages.
	 *
	 * @throws ChessException if client/server has been disconnected,
	 * or connection to client/server cannot be established.
	 */
	public void receive() throws ChessException;

	/**
	 * Send a message.
	 *
	 * @param obj - the Object to send
	 */
	public void send(Object obj);

	/**
	 * Show an information/error prompt to the user.
	 *
	 * @param message
	 */
	public void promptUser(String message);

}
