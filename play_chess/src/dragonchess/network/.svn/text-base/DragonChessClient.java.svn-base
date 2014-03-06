package dragonchess.network;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import dragonchess.ChessException;
import dragonchess.Main;
import dragonchess.MatchState;
import dragonchess.Utils;
import dragonchess.game.Command;
import dragonchess.game.Data;
import dragonchess.game.GamePieceColor;
import dragonchess.game.Player;
import dragonchess.game.commands.SetTurnCommand;

public class DragonChessClient implements NetworkConnection {

	private static final Logger log = Logger.getLogger(DragonChessClient.class);

	private DataRecipient dataRecipient;
	private CommandRecipient cmdRecipient;
	private int port;
	private InetAddress server;
	private Socket socket;
	private ObjectInputStream clientInput;
	private ObjectOutputStream clientOutput;

	/**
	 * Create a DragonChessClient.
	 *
	 * @param dataRecipient
	 */
	public DragonChessClient(DataRecipient dataRecipient) {
		this(dataRecipient, Utils.DEFAULT_HOST_NAME, Utils.DEFAULT_PORT_NUMBER);

		return;
	}

	/**
	 * Create a new DragonChessClient on specified host and port.
	 *
	 * @param dataRecipient
	 * @param host
	 * @param port
	 */
	public DragonChessClient(DataRecipient dataRecipient, String host, int port) {
		this.dataRecipient = dataRecipient;
		// for now, DataRecipient and CommandRecipient are the same
		this.cmdRecipient  = (CommandRecipient)dataRecipient;
		this.port          = port;

		try {
			this.server = InetAddress.getByName(host);
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
			System.exit(1);
		}

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public int getPort() {
		return this.port;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setPort(int port) {
		this.port = port;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public InetAddress getHost() {
		return this.server;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setHost(InetAddress host) {
		this.server = host;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isServer() {
		return false;
	}

	/**
	 * {@inheritDoc}
	 */
	public void connect() throws ChessException {
		log.debug("DragonChessClient.connect():  Connecting....");
		this.startClient();
		Thread cThread = new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						DragonChessClient.this.receive();
						Thread.sleep(Utils.RECEIVE_PAUSE);
					}
				} catch(InterruptedException ie) {
					ie.printStackTrace();
				} catch(ChessException ce) {
					DragonChessClient.this.promptUser(ce.getMessage());
				}
			}
		});
		cThread.start();
		log.debug("Client is ready....");

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void disconnect() {
		log.debug("DragonChessClient.disconnect():  Disconnecting....");
		this.stopClient();

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void receive() throws ChessException {
		Object obj = null;

		if (this.clientInput != null) {
			try {
				obj = this.clientInput.readObject();
				if (obj instanceof Data) {
					Data data = (Data)obj;
					log.debug(String.format("Client received:  %s", data));
					this.dataRecipient.handleData(data);
				} else if (obj instanceof Command) {
					Command cmd = (Command)obj;
					log.debug(String.format("Client received:  %s", cmd));
					this.cmdRecipient.handleCommand(cmd);
				} else {
					log.debug(String.format("Don't know how to handle:  %s\n",
						obj));
				}
			} catch (ClassNotFoundException cnf) {
				cnf.printStackTrace();
			} catch (SocketException se) {
				this.stopClient();
				throw new ChessException("Unable to contact to server.");
			} catch (IOException ioe) {
				this.stopClient();
				throw new ChessException("Lost contact with server.");
			}
		}

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void send(Object obj) {
		if (obj == null || this.clientOutput == null) {
			return;
		}
		try {
			log.debug(String.format("Client sent:  %s\n", obj));
			this.clientOutput.writeObject(obj);
			this.clientOutput.flush();
			this.clientOutput.reset();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void promptUser(String message) {
		this.dataRecipient.promptUser(message);
		return;
	}

	@Override
	public String toString() {
		return String.format("[Site \"%s, %d\"]",
			this.server.toString(), this.port);
	}

	private void startClient() {
		try {
			this.socket = new Socket(this.server, this.port);
			// must create ObjectOutputStream before
			// creating the ObjectInputStream
			this.clientOutput = new ObjectOutputStream(
				this.socket.getOutputStream());
			this.clientInput  = new ObjectInputStream(
				this.socket.getInputStream());
			// send the Black Player to the server
			Player player = ((Main)this.dataRecipient).getPlayer(
				GamePieceColor.Black);
			player.setLocal(false);
			this.send((Data)player);
			Command cmd = new SetTurnCommand(MatchState.BlackConnected);
			this.send(cmd);
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return;
	}

	private void stopClient() {
		// close ObjectStreams in reverse order of opening them
		if (this.clientOutput != null) {
			log.debug("Closing Client output...");
			try { this.clientOutput.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		if (this.clientInput != null) {
			log.debug("Closing Client input...");
			try { this.clientInput.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		// close socket
		if (this.socket != null && !this.socket.isClosed()) {
			log.debug("Closing Client Socket...");
			try { this.socket.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		log.debug("Client Stopped.");

		return;
	}

}
