package dragonchess.network;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

import org.apache.log4j.Logger;

import dragonchess.ChessException;
import dragonchess.Main;
import dragonchess.Utils;
import dragonchess.game.Command;
import dragonchess.game.Data;
import dragonchess.game.GamePieceColor;
import dragonchess.game.Player;
import dragonchess.game.commands.SetMaxTimeCommand;
import dragonchess.game.commands.SetTurnCommand;

public class DragonChessServer implements NetworkConnection {

	private static final Logger log = Logger.getLogger(DragonChessServer.class);

	private DataRecipient dataRecipient;
	private CommandRecipient cmdRecipient;
	private int port;
	private InetAddress host;
	private ServerSocket serverSocket;
	private Socket clientSocket;
	private ObjectInputStream serverInput;
	private ObjectOutputStream serverOutput;
	private ServerRunnable serverRunnable;

	/**
	 * Create a default DragonChessServer.
	 *
	 * @param dataRecipient
	 */
	public DragonChessServer(DataRecipient dataRecipient) {
		this(dataRecipient, Utils.DEFAULT_HOST_NAME, Utils.DEFAULT_PORT_NUMBER);

		return;
	}

	/**
	 * Create a new DragonChessServer on specified host and port.
	 *
	 * @param dataRecipient
	 * @param host
	 * @param port
	 */
	public DragonChessServer(DataRecipient dataRecipient, String host, int port) {
		this.dataRecipient = dataRecipient;
		// for now, DataRecipient and CommandRecipient are the same
		this.cmdRecipient  = (CommandRecipient)dataRecipient;
		this.port          = port;

		try {
			this.host = InetAddress.getByName(host);
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
		return this.host;
	}

	/**
	 * {@inheritDoc}
	 */
	public void setHost(InetAddress host) {
		this.host = host;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean isServer() {
		return true;
	}

	/**
	 * {@inheritDoc}
	 */
	public void connect() throws ChessException {
		log.debug("DragonChessServer.connect():  Connecting....");
		this.startServer();
		Thread sThread = new Thread(new Runnable() {
			public void run() {
				try {
					while (true) {
						DragonChessServer.this.receive();
						Thread.sleep(Utils.RECEIVE_PAUSE);
					}
				} catch(InterruptedException ie) {
					ie.printStackTrace();
				} catch(ChessException ce) {
					DragonChessServer.this.promptUser(ce.getMessage());
				}
			}
		});
		sThread.start();
		log.debug("SocketServer is ready....");

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void disconnect() {
		log.debug("DragonChessServer.disconnect():  Disconnecting....");
		this.stopServer();

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void receive() throws ChessException {
		Object obj = null;

		if (this.serverInput != null) {
			try {
				obj = this.serverInput.readObject();
				if (obj instanceof Data) {
					Data data = (Data)obj;
					log.debug(String.format("Server received:  %s", data));
					this.dataRecipient.handleData(data);
				} else if (obj instanceof Command) {
					Command cmd = (Command)obj;
					log.debug(String.format("Server received:  %s", cmd));
					this.cmdRecipient.handleCommand(cmd);
				} else {
					log.debug(String.format("Don't know how to handle:  %s",
						obj));
				}
			} catch (ClassNotFoundException cnf) {
				cnf.printStackTrace();
			} catch (SocketException se) {
				this.stopServer();
				throw new ChessException("Cannot establish client connection.");
			} catch (IOException ioe) {
				this.stopServer();
				throw new ChessException("Lost contact with client.");
			}
		} else {
//			log.error("receive():  server input is NULL.");
		}

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void send(Object obj) {
		if (obj == null || this.serverOutput == null) {
			return;
		}
		try {
			this.serverOutput.writeObject(obj);
			this.serverOutput.flush();
			this.serverOutput.reset();
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

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.format("[Site \"%s, %d\"]",
			this.host.toString(), this.port);
	}

	private void startServer() {
		if (this.serverRunnable == null) {
			this.serverRunnable =
				new ServerRunnable(((Main)this.dataRecipient));
		}

		return;
	}

	private void stopServer() {
		if (this.serverRunnable != null) {
			this.serverRunnable.stopRunnable();
			this.serverRunnable = null;
		}
		// close ObjectStreams in reverse order of opening them
		if (this.serverOutput != null) {
			log.debug("Closing Client output...");
			try { this.serverOutput.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		if (this.serverInput != null) {
			log.debug("Closing Client input...");
			try { this.serverInput.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		// close client socket
		if (this.clientSocket != null && !this.clientSocket.isClosed()) {
			log.debug("Closing Client Socket...");
			try { this.clientSocket.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		// close server socket
		if (!(this.serverSocket == null || this.serverSocket.isClosed())) {
			log.debug("Closing Server Socket...");
			try { this.serverSocket.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		log.debug("DragonChessServer Stopped.");

		return;
	}

	/**
	 * This class is the SocketServer's monitor Thread.
	 * It listens for and accepts a socket connection.
	 */
	private class ServerRunnable implements Runnable {
		private Main parent;
		private boolean running;
		private Thread socketMonitorThread;

		/**
		 * Create a new ServerRunnable.
		 *
		 * @param parent
		 */
		public ServerRunnable(Main parent) {
			this.parent              = parent;
			this.running             = true;
			this.socketMonitorThread = new Thread(this);

			this.socketMonitorThread.setDaemon(true);
			this.socketMonitorThread.start();

			return;
		}

		/**
		 * Stop this SocketServer.
		 */
		public synchronized void stopRunnable() {
			if (this.running) {
				DragonChessServer.log.debug(
					"DragonChessServer Thread Shutting Down...");
				this.running = false;
				try { this.socketMonitorThread.join(); }
				catch (InterruptedException e) { /* do nothing? */ }
				this.socketMonitorThread = null;
				DragonChessServer.log.debug(
					"DragonChessServer Thread Shut Down...");
			}

			return;
		}

		/**
		 * Start this Thread.
		 */
		public void run() {
			try {
				DragonChessServer.this.serverSocket = new ServerSocket(port);
				DragonChessServer.this.serverSocket.setSoTimeout(
					Utils.SERVER_TIME_OUT);
			} catch (Exception e) {
				DragonChessServer.log.debug(
					"Exception setting timeout (Shutting Down DragonChessServer).");
				this.running = false;
				return;
			}
			try {
				while (this.running) {
					DragonChessServer.this.clientSocket = null;
					try {
						DragonChessServer.this.clientSocket =
							DragonChessServer.this.serverSocket.accept();
					} catch (InterruptedIOException e) {
						// timed out
					} catch (SocketException e) {
						DragonChessServer.log.debug(
							"SocketException... (Shutting Down DragonChessServer).");
						this.running = false;
					} catch (IOException e) {
						DragonChessServer.log.debug("IOException accepting socket.");
					}
					if (DragonChessServer.this.clientSocket != null) {
						try {
							InetAddress remoteAddress =
								DragonChessServer.this.clientSocket.getInetAddress();
							DragonChessServer.log.debug(String.format(
								"accepting connection from %s (%s)...",
								remoteAddress.getHostAddress(),
								remoteAddress.getHostName()));
							// must create ObjectOutputStream before
							// creating the ObjectInputStream
							DragonChessServer.this.serverOutput = new ObjectOutputStream(
								DragonChessServer.this.clientSocket.getOutputStream());
							DragonChessServer.this.serverInput  = new ObjectInputStream(
								DragonChessServer.this.clientSocket.getInputStream());
							this.running = false;
							// send the White Player to the client
							Player player = this.parent.getPlayer(
								GamePieceColor.White);
							player.setLocal(false);
							DragonChessServer.this.send((Data)player);
							// set the max time per player
							Command cmd = new SetMaxTimeCommand(this.parent.getMaxTime());
							DragonChessServer.this.send(cmd);
							// notify client it his turn
							cmd = new SetTurnCommand(this.parent.getTurn());
							DragonChessServer.this.send(cmd);
						} catch (IOException e) {
							DragonChessServer.log.debug(
								"IOException creating output stream on socket.");
						}
					}
				} // while 
				DragonChessServer.log.debug("Client connected!!!");
			}
			finally {
				try { DragonChessServer.this.serverSocket.close(); }
				catch (IOException e) { /* do nothing with it */ }
			}

			return;
		}
	} // DragonChessServer$ServerRunnable

}
