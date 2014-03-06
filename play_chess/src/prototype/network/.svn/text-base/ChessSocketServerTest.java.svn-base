package prototype.network;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.Date;
import java.util.Random;
import java.util.Vector;

import prototype.datamodel.ChessBoard;

/**
 * This is a simple test class writen to test ChessSocketServer
 * during its development.
 */
public class ChessSocketServerTest {

	public static final String[] PIECES = {
		"Pawn",
		"Knight",
		"Bishop",
		"Rook",
		"Queen",
		"King"
	};

	private ChessSocketServer server;
	private Socket c_socket;
	private ObjectOutputStream c_out;
	private ObjectInputStream c_in;
	private ChessSocketServerTest.TestObject t_o;

	/**
	 * Create a new ChessSocketServerTest.
	 *
	 * @param server - the ChessSocketServer to be tested
	 */
	public ChessSocketServerTest(ChessSocketServer server) {
		this.server = server;

		return;
	}

	/**
	 * Create a client Socket, and retrive its
	 * ObjectInput and ObjectOutput streams.
	 */
	public void connectClient() {
		try {
			this.c_socket =
				new Socket(this.server.getHost(), this.server.getPort());
			this.c_in     =
				new ObjectInputStream(this.c_socket.getInputStream());
			this.c_out    =
				new ObjectOutputStream(this.c_socket.getOutputStream());
		} catch (IOException ioe) {
			System.out.printf(
				"ChessSocketServerTest.connectClient():  Exiting...\n");
			ioe.printStackTrace();
			System.exit(1);
		}

		return;
	}

	/**
	 * Close both client ObjectInput and ObjectOutput streams.
	 */
	public void closeClientStreams() {
		if (this.c_out != null) {
			try { this.c_out.close(); }
			catch (IOException ioe) { System.out.println(ioe.getMessage()); }
			System.out.printf(
				"ChessSocketServerTest.closeClientStreams():  CLOSED c_out...\n");
		}
		if (this.c_in != null) {
			try { this.c_in.close(); }
			catch (IOException ioe) { System.out.println(ioe.getMessage()); }
			System.out.printf(
				"ChessSocketServerTest.closeClientStreams():  CLOSED c_in...\n");
		}

		return;
	}

	/**
	 * Receive in a test Object from the clients ObjectInputStream.
	 */
	public void receive() {
		try {
			this.t_o = (ChessSocketServerTest.TestObject)this.c_in.readObject();
			System.out.printf("ChessSocketServerTest.receive():  %s\n", this.t_o);
		} catch (ClassNotFoundException cnf) {
			cnf.printStackTrace();
		} catch (SocketException se) {
			System.out.printf("ChessSocketServerTest.receive():  Caught - %s",
				se.getMessage());
			this.closeClientStreams();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

	public static void main(String[] args) {
		int port    = ChessSocketServer.DEFAULT_PORT;
		//Random r   = new Random(new Date().getTime());
		//Vector tos = new Vector(r.nextInt(10));
		Vector<ChessSocketServerTest.TestObject> tos =
			new Vector<ChessSocketServerTest.TestObject>();

		if (args.length == 1) {
			try { port = Integer.parseInt(args[0]); }
			catch (NumberFormatException nf) { /* port defaulted to 7766 */ }
		}
		final ChessSocketServer css = new ChessSocketServer(port);

		for (int i = 0; i < 1; i++) {
			System.out.printf("Adding TestObject to tos[%d]\n", i);
			tos.add(new ChessSocketServerTest.TestObject());
		}

//		final ChessSocketServerTest sst = new ChessSocketServerTest(css);
//		sst.connectClient();
		final ChessBoard cs = new ChessBoard(port, "localhost");
		cs.connectClient();
		Thread c_t = new Thread(new Runnable() {
			public void run() {
				while(true) {
					cs.receive();
				}
			}
		});
		c_t.start();

		for (int i = 0; i < tos.size(); i++) {
			System.out.printf("ChessSocketServerTest.main():  SENDING...[%d]\n", i);
			ChessSocketServerTest.TestObject to = tos.get(i);
			System.out.println(to);
			css.writeToAllConnections(to);
		}

		//sst.closeClientStreams();

		return;
	}

	/**
	 * The TestObject used to test ChessSocketServer with.
	 */
	private static class TestObject implements Serializable {
		private static final long serialVersionUID = 123456789L;

		private short num_short;
		private int num_int;
		private long num_long;
		private float num_float;
		private double num_double;
		private String str;

		/**
		 * Create a new TestObject containing some pseudo-random data.
		 */
		public TestObject() {
			Date d          = new Date();
			Random r        = new Random(d.getTime());
			this.num_short  = (short)r.nextInt(Short.MAX_VALUE);
			r.setSeed(d.getTime() + 6549);
			this.num_int    = r.nextInt();
			r.setSeed(d.getTime() + 74319);
			this.num_long   = r.nextLong();
			r.setSeed(d.getTime() - 42865);
			this.num_float  = r.nextFloat();
			r.setSeed(d.getTime() + 867443);
			this.num_double = r.nextDouble();
			r.setSeed(d.getTime() - 94192);
			this.str        = ChessSocketServerTest.PIECES[
				r.nextInt(ChessSocketServerTest.PIECES.length)];
			System.out.printf("ChessSocketServerTest.TestObject():\n%s\n", this);

			return;
		}

		public short getShort() { return this.num_short; }
		public void setShort(short s) { this.num_short = s; }
		public int getInt() { return this.num_int; }
		public void setInt(int i) { this.num_int = i; }
		public long getLong() { return this.num_long; }
		public void setLong(long l) { this.num_long = l; }
		public float getFloat() { return this.num_float; }
		public void setFloat(float f) { this.num_float = f; }
		public double getDouble() { return this.num_double; }
		public void setDouble(double d) { this.num_double = d; }
		public String getString() { return this.str; }
		public void setString(String s) { this.str = s; }

		public String toString() {
			StringBuffer sb = new StringBuffer("####################\n");
			sb.append("num_short  = ").append(this.num_short).append("\n");
			sb.append("num_int    = ").append(this.num_int).append("\n");
			sb.append("num_long   = ").append(this.num_long).append("\n");
			sb.append("num_float  = ").append(this.num_float).append("\n");
			sb.append("num_double = ").append(this.num_double).append("\n");
			sb.append("str        = ").append(this.str).append("\n");
			sb.append("--------------------\n");
			return sb.toString();
		}
	}
}
