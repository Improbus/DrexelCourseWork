package prototype.datamodel;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class ChessBoard {

    private static InetAddress hostAddress;

    private int destinationPort;
	private String destinationHost;
	private Socket socket;
	private ObjectOutputStream out;
	private ObjectInputStream in;

	/**
	 * Create a new ChessBoard.
	 *
	 * @param port - SocketServer
	 * @param host - SocketServer
	 */
    public ChessBoard(int port, String host) {
		this.destinationHost = host;
		this.destinationPort = port;

		// get the address of the host computer
		try {
		    this.hostAddress = InetAddress.getLocalHost();
		} catch (UnknownHostException uhe) {
		    uhe.printStackTrace();
		}

		return;
    }

	/**
	 * Connects to the SocketServer running on
	 * destinationHost at destinationPort.
	 */
	public void connectClient() {
		try {
			this.socket = new Socket(this.destinationHost, this.destinationPort);
			// must create ObjectInputStream before
			// creating the ObjectOutputStream
			this.in     = new ObjectInputStream(
				this.socket.getInputStream());
			this.out    = new ObjectOutputStream(
				this.socket.getOutputStream());
		} catch (IOException ioe) {
			System.out.printf("ChessBoard.connectSubscriber():  %s\n",
				ioe.getMessage());
			ioe.printStackTrace();
		}

		return;
	}

	/**
	 * Disconnects from the SocketServer running on
	 * destinationHost at destinationPort.
	 */
	public void closeClientStreams() {
		// close ObjectStreams in reverse order of opening them
		if (this.out != null) {
			try { this.out.close(); }
			catch (IOException ioe) { System.out.println(ioe.getMessage()); }
			System.out.printf(
				"ChessBoard.closeClientStreams(%s):  CLOSED out.\n",
				ChessBoard.hostAddress.toString());
		}
		if (this.in != null) {
			try { this.in.close(); }
			catch (IOException ioe) { System.out.println(ioe.getMessage()); }
			System.out.printf("ChessBoard.closeClientStreams():  CLOSED in.\n");
		}
	}

	/**
	 * Receives messages from the ChessSoscketServer.
	 */
	public void receive() {
		try {
			System.out.printf("ChessBoard.receive():  %s\n",
				this.in.readObject());
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (SocketException se) {
			System.out.printf("ChessBoard.receive():  Caught - %s\n",
				se.getMessage());
			this.closeClientStreams();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return;
	}

}
