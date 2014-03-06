package prototype.network;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Connection {

	public static final int DEFAULT_PORT    = 7766;
	public static final String DEFAULT_HOST = "localhost";
	public static final int SERVER_TIME_OUT = 10000;

	private int port;
	private InetAddress host;
	private boolean server;
	private Socket client;
	private ObjectInputStream clientInput;
	private ObjectOutputStream clientOutput;
	private ObjectInputStream serverInput;
	private ObjectOutputStream serverOutput;
	private ServerRunnable serverRunnable;

	public Connection() {
		this(Connection.DEFAULT_HOST, Connection.DEFAULT_PORT, true);

		return;
	}

	public Connection(String host, int port, boolean server) {
		this.server = server;
		this.port   = port;

		try {
			this.host = InetAddress.getByName(host);
		} catch (UnknownHostException uhe) {
			uhe.printStackTrace();
			System.exit(1);
		}

		return;
	}

	public int getPort() {
		return this.port;
	}

	public void setPort(int port) {
		this.port = port;

		return;
	}

	public InetAddress getHost() {
		return this.host;
	}

	public void setHost(InetAddress host) {
		this.host = host;

		return;
	}

	public boolean isServer() {
		return this.server;
	}

	public void setServer(boolean server) {
		this.server = server;

		return;
	}

	public void connect() {
		System.out.printf("Connection.connect():  Connecting....\n");
		if (this.isServer()) {
			this.startServer();
			Thread sThread = new Thread(new Runnable() {
				public void run() {
					while (true) {
						Connection.this.serverReceive();
					}
				}
			});
			sThread.start();
			System.out.printf("SocketServer is ready....\n");
		} else {
			this.startClient();
			Thread cThread = new Thread(new Runnable() {
				public void run() {
					while (true) {
						Connection.this.clientReceive();
					}
				}
			});
			cThread.start();
			System.out.printf("Client is ready....\n");
		}

		return;
	}

	public void disconnect() {
		System.out.printf("Connection.disconnect():  Disconnecting....\n");
		if (this.isServer()) {
			this.stopServer();
		} else {
			this.stopClient();
		}

		return;
	}

	/**
	 * Receives a messages from the SocketServer.
	 */
	public void clientReceive() {
		Object obj = null;

		if (this.clientInput != null) {
			try {
				obj = this.clientInput.readObject();
				System.out.printf("Client received:  %s\n", obj);
			} catch (ClassNotFoundException cnf) {
				cnf.printStackTrace();
			} catch (SocketException se) {
				se.printStackTrace();
				this.stopClient();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		return;
	}

	/**
	 * Send a message.
	 *
	 * @param obj - the Object to send
	 */
	public void clientSend(Object obj) {
		if (obj == null || this.clientOutput == null) {
			return;
		}
		try {
			System.out.printf("Client sent:  %s\n", obj);
			this.clientOutput.writeObject(obj);
			this.clientOutput.flush();
			this.clientOutput.reset();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return;
	}

	/**
	 * Receives a messages from the Socket (client).
	 */
	public void serverReceive() {
		Object obj = null;

		if (this.serverInput != null) {
			try {
				obj = this.serverInput.readObject();
				System.out.printf("Server received:  %s\n", obj);
			} catch (ClassNotFoundException cnf) {
				cnf.printStackTrace();
			} catch (SocketException se) {
				se.printStackTrace();
				this.stopClient();
			} catch (IOException ioe) {
				ioe.printStackTrace();
			}
		}

		return;
	}

	/**
	 * Send a message.
	 *
	 * @param obj - the Object to send
	 */
	public void serverSend(Object obj) {
		System.out.printf("Server sent[1]:  %s\n", obj);
		if (obj == null || this.serverOutput == null) {
			return;
		}
		try {
			System.out.printf("Server sent[2]:  %s\n", obj);
			this.serverOutput.writeObject(obj);
			this.serverOutput.flush();
			this.serverOutput.reset();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[Site \"");
		sb.append(this.host).append(", ");
		sb.append(this.port).append("\"]");

		return sb.toString();
	}

	private void startClient() {
		try {
			this.client = new Socket(this.host, this.port);
			// must create ObjectInputStream before
			// creating the ObjectOutputStream
			this.clientInput  = new ObjectInputStream(
				this.client.getInputStream());
			this.clientOutput = new ObjectOutputStream(
				this.client.getOutputStream());
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}

		return;
	}

	private void stopClient() {
		// close ObjectStreams in reverse order of opening them
		if (this.clientOutput != null) {
			System.out.printf("Closing Server Connection...\n");
			try { this.clientOutput.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
			System.out.printf("Server Connection Closed.\n");
		}
		if (this.clientInput != null) {
			try { this.clientInput.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		System.out.printf("Client Stopped.\n");

		return;
	}

	private void startServer() {
		if (this.serverRunnable == null) {
			this.serverRunnable =
				new ServerRunnable(this.port, this.serverInput,
					this.serverOutput);
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
			System.out.printf("Closing Client Connection...\n");
			try { this.serverOutput.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
			System.out.printf("Client Connection Closed.\n");
		}
		if (this.serverInput != null) {
			try { this.serverInput.close(); }
			catch (IOException ioe) { ioe.printStackTrace(); }
		}
		System.out.printf("ServerSocket Stopped.\n");

		return;
	}

	/**
	 * This class is the SocketServer's monitor Thread.
	 * It listens for and accepts a socket connection.
	 */
	private class ServerRunnable implements Runnable {
		private int port;
		private ObjectInputStream sIn;
		private ObjectOutputStream sOut;
		private boolean running;
		private Thread socketMonitorThread;

		/**
		 * Create a new ServerRunnable.
		 *
		 * @param port - the port to listen on
		 * @param serverOutput - the new connection
		 */
		public ServerRunnable(int port, ObjectInputStream serverInput,
			ObjectOutputStream serverOutput) {
			this.port                = port;
			this.sIn                 = serverInput;
			this.sOut                = serverOutput;
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
				System.out.printf("ChessSocketServer Thread Shutting Down...\n");
				this.running = false;
				try { this.socketMonitorThread.join(); }
				catch (InterruptedException e) { /* do nothing? */ }
				this.socketMonitorThread = null;
				System.out.printf("ChessSocketServer Thread Shut Down...\n");
			}

			return;
		}

		/**
		 * Start this Thread.
		 */
		public void run() {
			ServerSocket serverSocket = null;
			try {
				serverSocket = new ServerSocket(port);
				serverSocket.setSoTimeout(ChessSocketServer.SERVER_TIME_OUT);
			} catch (Exception e) {
				System.out.printf(
					"Exception setting timeout (Shutting Down ChessSocketServer).\n");
				this.running = false;
				return;
			}
			try {
				while (this.running) {
					Socket socket = null;
					try {
						socket = serverSocket.accept();
					} catch (InterruptedIOException e) {
						// timed out
					} catch (SocketException e) {
						System.out.printf(
							"SocketException... (Shutting Down ChessSocketServer).\n");
						this.running = false;
					} catch (IOException e) {
						System.out.printf("IOException accepting socket.\n");
					}
					if (socket != null) {
						try {
							InetAddress remoteAddress = socket.getInetAddress();
							System.out.printf(
								"accepting connection from %s (%s)...\n",
								remoteAddress.getHostAddress(),
								remoteAddress.getHostName());
							// must create ObjectInputStream before
							// creating the ObjectOutputStream
							this.sIn  = new ObjectInputStream(
								socket.getInputStream());
							this.sOut = new ObjectOutputStream(
								socket.getOutputStream());
							this.running = false;
						} catch (IOException e) {
							System.out.printf(
								"IOException creating output stream on socket.\n");
						}
					}
				} // while 
			}
			finally {
				try { serverSocket.close(); }
				catch (IOException e) { /* do nothing with it */ }
			}

			return;
		}
	} // Connection$ServerRunnable

}
