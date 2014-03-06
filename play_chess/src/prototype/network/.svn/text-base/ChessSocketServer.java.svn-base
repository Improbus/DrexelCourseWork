package prototype.network;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Vector;

/**
 * An example SocketServer.
 */
public class ChessSocketServer {

	public static final int DEFAULT_PORT    = 7766;
	public static final int SERVER_TIME_OUT = 10000;

	private int port;
	private InetAddress host;
	private Vector<ObjectOutputStream> outputStreams;
	private ServerRunnable serverRunnable;

	/**
	 * Create a new ChessSocketServer listening on port 7766.
	 */
	public ChessSocketServer() {
		this(ChessSocketServer.DEFAULT_PORT);

		return;
	}

	/**
	 * Create a new ChessSocketServer listening on port port.
	 *
	 * @param port
	 */
	public ChessSocketServer(int port) {
		this.port = port;

		try {
			this.host = InetAddress.getLocalHost();
		} catch (UnknownHostException uhe) {
			System.out.printf(
				"ChessSocketServer.ChessSocketServer():  Exiting...\n");
			uhe.printStackTrace();
			System.exit(1);
		}

		this.outputStreams = new Vector<ObjectOutputStream>();
		this.startServer();

		return;
	}

	/**
	 * Return the port this SocketServer is listening on.
	 *
	 * @return port
	 */
	public int getPort() {
		return this.port;
	}

	/**
	 * Set the port this SocketServer is to listen on.
	 *
	 * @param port
	 */
	public void setPort(int port) {
		this.port = port;

		return;
	}

	/**
	 * Return the InetAddress of this SockectServer.
	 *
	 * @return host
	 */
	public InetAddress getHost() {
		return this.host;
	}

	/**
	 * Start the SocketServer.
	 */
	public void startServer() {
		if (this.serverRunnable == null) {
			this.serverRunnable =
				new ServerRunnable(this.port, this.outputStreams);
		}

		return;
	}

	/**
	 * Stop the SocketServer.
	 */
	public void stopServer() {
		System.out.printf("Stopping ChessSocketServer...\n");
		if (this.serverRunnable != null) {
			this.serverRunnable.stopRunnable();
			this.serverRunnable = null;
		}
		if (this.outputStreams != null) {
			System.out.printf("Closing Client Connections...\n");
			while (this.outputStreams.size() != 0) {
				ObjectOutputStream oos = outputStreams.elementAt(0);
				if (oos != null) {
					try { oos.close(); }
					catch (IOException e) {
						System.out.printf("Couldn't Close oos.\n");
					}
					this.outputStreams.removeElementAt(0);
				}
			}
			System.out.printf("Client Connections Closed.\n");
		}
		System.out.printf("ServerSocket Stopped.\n");

		return;
	}

	/**
	 * Write a message to the specified connection.
	 *
	 * @param connection - the ObjectOutputStream to write to
	 * @param obj - the Object to write
	 */
	public void writeToConnection(int connection, Object obj) {
		if (obj == null || this.outputStreams.size() == 0) {
			return;
		}
		ObjectOutputStream oos = null;
		try {
			oos = this.outputStreams.get(connection);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.printf(
				"ArrayIndexOutOfBoundsException... Connection[%d]\n", connection);
		}
		if (oos == null) { return; }
		try {
			oos.writeObject(obj);
			oos.flush();
			oos.reset();
		} catch (IOException e) {
			this.outputStreams.removeElementAt(connection);
			System.out.printf("IOException... Dropped Connection[%d]\n", connection);
		}

		return;
	}

	/**
	 * Write a message to all the clients connectioned.
	 *
	 * @param obj - the Object to write
	 */
	public void writeToAllConnections(Object obj) {
		if (obj == null || this.outputStreams.size() == 0) {
			return;
		}
		for (int i = 0; i < this.outputStreams.size(); i++) {
			ObjectOutputStream oos = null;
			try {
				oos = this.outputStreams.elementAt(i);
			} catch (ArrayIndexOutOfBoundsException e) {
			}
			if (oos == null) { break; }
			try {
				System.out.printf("Writing message to Connection[%d]\n", i);
				oos.writeObject(obj);
				oos.flush();
				oos.reset();
				System.out.printf("Wrote message to Connection[%d]\n", i);
			} catch (IOException e) {
				this.outputStreams.removeElementAt(i);
				System.out.printf("Dropped Connection[%d]\n", i);
				i--;
			}
		}

		return;
	}

	public static void main(String[] args) {
		ChessSocketServer css = null;
		int port              = ChessSocketServer.DEFAULT_PORT;

		if (args.length == 1) {
			try { port = Integer.parseInt(args[0]); }
			catch (NumberFormatException nf) { /* port defaulted to 7766 */ }
		}

		css  = new ChessSocketServer(port);
		css.startServer();

		return;
	}

	/**
	 * This class is the SocketServer's monitor Thread.
	 * It listens for and accepts socket connections.
	 */
	private class ServerRunnable implements Runnable {
		private int port;
		private Vector<ObjectOutputStream> outputStreams;
		private boolean running;
		private Thread socketMonitorThread;

		/**
		 * Create a new ServerRunnable.
		 *
		 * @param port - the port to listen on
		 * @param outputStreams - a collection to place the new connection in
		 */
		public ServerRunnable(int port,
			Vector<ObjectOutputStream> outputStreams) {
			this.port                = port;
			this.outputStreams       = outputStreams;
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
							ObjectOutputStream oos = new ObjectOutputStream(
								socket.getOutputStream());
							this.outputStreams.addElement(oos);
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
	} // ChessSocketServer$ServerRunnable

} 
