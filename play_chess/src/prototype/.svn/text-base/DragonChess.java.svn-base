package prototype;

import prototype.datamodel.Player;
import prototype.datamodel.PlayerColor;
import prototype.network.Connection;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DragonChess {

	private Scanner input;
	private Connection connection;
	private Player player;
	private Date now;
	private SimpleDateFormat sdf;

	public DragonChess() {
		this.input = new Scanner(System.in);
		this.now   = new Date();
		this.sdf   = new SimpleDateFormat("yyyy.MM.dd");

		return;
	}

	public void setConnection(Connection connection) {
		this.connection = connection;

		return;
	}

	public void setPlayer(Player player) {
		this.player = player;

		return;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[Event \"DragonChess Match\"]\n");
		sb.append(this.connection).append("\n");
		sb.append("[Date \"").append(this.sdf.format(this.now)).append("\"]\n");
		sb.append("[Round \"1\"]\n");
		sb.append(this.player).append("\n");

		return sb.toString();
	}

	protected void connect() {
		System.out.printf("\tConnecting....\n\n");
		this.connection.connect();
		System.out.printf("\tConnected.\n\n");

		return;
	}

	protected void disconnect() {
		System.out.printf("\tDisconnecting....\n\n");
		this.connection.disconnect();
		System.out.printf("\tDisconnected.\n\n");

		return;
	}

	protected void play() {
		String line = null;

		System.out.printf("\tPlaying....\n\n");
		System.out.printf("Enter a \".\" on its own line to quit.\n");
		System.out.printf(">>  ");
		while (!(line = this.input.nextLine()).equals(".")) {
			if (this.connection != null && this.connection.isServer()) {
				// send line to the client
				this.connection.serverSend(line);
			} else {
				// send line to the server
				this.connection.clientSend(line);
			}
			System.out.printf(">>  ");
		}
		System.out.printf("\tStopped match.\n\n");

		return;
	}

	protected void save() {
		System.out.printf("\tSaving....\n\n");
		System.out.printf("\tSaved match.\n\n");

		return;
	}

	protected Player promptPlayer() {
		PlayerColor pColor = PlayerColor.White;

		System.out.println("Enter your name:  ");
		String name = this.input.nextLine();
		System.out.println("Enter color (white|black):  ");
		String color = this.input.next();

		if (color.equalsIgnoreCase("black") || color.startsWith("b") ||
			color.startsWith("B")) {
			pColor = PlayerColor.Black;
		}

		return new Player(name, pColor);
	}

	/**
	 * Prompt for connection info.
	 */
	protected Connection promptConnection() {
		String host = "localhost";

		System.out.println("Are you hosting, or joing a match (h|j):  ");
		boolean server = this.input.next().startsWith("h");

		if (!server) {
			System.out.println("Enter the hostname/IP address of the server:  ");
			host = this.input.next();
		}

		System.out.println("Enter the port the server is listening on:  ");
		int port = this.input.nextInt();

		return new Connection(host, port, server);
	}

	public static void main(String[] args) {
		DragonChess dc = new DragonChess();

		dc.setPlayer(dc.promptPlayer());
		dc.setConnection(dc.promptConnection());
		dc.connect();
		dc.play();
		dc.disconnect();
		dc.save();

		System.out.println(dc);

		return;
	}

}
