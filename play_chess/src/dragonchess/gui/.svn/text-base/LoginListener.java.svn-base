package dragonchess.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JOptionPane;

import org.apache.log4j.Logger;

import dragonchess.ChessException;
import dragonchess.MatchState;
import dragonchess.Utils;
import dragonchess.game.GamePieceColor;
import dragonchess.game.Player;
import dragonchess.network.DragonChessClient;
import dragonchess.network.DragonChessServer;
import dragonchess.network.NetworkConnection;

/**
 * The input JPanel.
 *
 * @author Group 4
 */
public class LoginListener implements ActionListener, PropertyChangeListener {

	private static final Logger log = Logger.getLogger(LoginListener.class);

	private LoginDialog loginDialog;
	private DragonChessMW parent;

	/**
	 * Default constructor
	 */
	public LoginListener(DragonChessMW parent, LoginDialog loginDialog) {
		super();

		this.parent      = parent;
		this.loginDialog = loginDialog;

		return;
	}

	//
	// Implements ActionListener
	//

	/**
	 *
	 * @param e
	 */
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();

		if (cmd.equals(Utils.SERVER_RB_CMD)) {
			this.loginDialog.setHostName(Utils.DEFAULT_HOST_NAME);
			this.loginDialog.enableHost(false);
			this.loginDialog.enableMinutes(true);
		} else if (cmd.equals(Utils.CLIENT_RB_CMD)) {
			this.loginDialog.enableHost(true);
			this.loginDialog.enableMinutes(false);
		}

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void propertyChange(PropertyChangeEvent e) {
		JOptionPane optionPane = this.loginDialog.getOptionPane();

		String prop = e.getPropertyName();
//		log.debug(String.format("propertyChange():  prop = %s\n", prop));

		if (this.loginDialog.isVisible() &&
			(e.getSource() == optionPane) &&
			(JOptionPane.VALUE_PROPERTY.equals(prop) ||
				JOptionPane.INPUT_VALUE_PROPERTY.equals(prop))) {
			Object value = optionPane.getValue();

			if (value == JOptionPane.UNINITIALIZED_VALUE) {
				return; // ignore reset
			}

//			log.debug(String.format("propertyChange():  value = %s\n", value));

			optionPane.setValue(JOptionPane.UNINITIALIZED_VALUE);

			if (((Integer)value).intValue() == JOptionPane.OK_OPTION) {
				// get a valid Player's name
				String pName = this.loginDialog.getPlayerName();
				if (pName.length() < 2) {
					JOptionPane.showMessageDialog(
						this.loginDialog,
						"Player Name must be at least 2 characters long.",
						"Error",
						JOptionPane.ERROR_MESSAGE);
					return;
				}
				// get isServer
				boolean isServer = this.loginDialog.isServer();
				// get a hostname
				String hName = this.loginDialog.getHostName();
				if (hName.length() <= 0) {
					JOptionPane.showMessageDialog(
						this.loginDialog,
						"You must enter a hostname/IP address.",
						"Error",
						JOptionPane.ERROR_MESSAGE);
					return;
				}
				// get a valid port number
				int port = this.loginDialog.getPortNumber();
				if (port < Utils.MIN_PORT || port > Utils.MAX_PORT) {
					JOptionPane.showMessageDialog(
						this.loginDialog,
						String.format(
							"Port number must be between %d and %d.",
							Utils.MIN_PORT, Utils.MAX_PORT),
						"Error",
						JOptionPane.ERROR_MESSAGE);
					return;
				}
				// get match minutes
				int min = this.loginDialog.getMinutes();
				if (min < Utils.MIN_MIN) {
					JOptionPane.showMessageDialog(
						this.loginDialog,
						String.format(
							"Time must be greater than or equal to %d.",
							Utils.MIN_MIN),
						"Error",
						JOptionPane.ERROR_MESSAGE);
					return;
				}
				// create Playre and a Connection
				Player player = null;
				NetworkConnection conn = null;
				if (isServer) {
					player = new Player(pName, GamePieceColor.White);
					conn = new DragonChessServer(this.parent.getMainApp(),
						hName, port);
				} else {
					player = new Player(pName, GamePieceColor.Black);
					conn = new DragonChessClient(this.parent.getMainApp(),
						hName, port);
				}
				this.parent.setPlayer(player);
				try {
					conn.connect();
				} catch (ChessException ce) {
					JOptionPane.showMessageDialog(
						this.loginDialog,
						ce.getMessage(),
						"Error",
						JOptionPane.ERROR_MESSAGE);
					return;
				}
				this.parent.setConnection(conn);
				this.parent.packMainPanel();

				this.loginDialog.conceal();
				if (isServer) { // wait for client to connect
					this.parent.setTurn(MatchState.WhiteConnected);
					this.parent.setMaxTime(min);
					SplashScreen sScreen = new SplashScreen(this.parent);
				} else {
					this.parent.setVisible(true);
				}
			} else {
				this.loginDialog.conceal();
				this.parent.dispose();
			}
		}

		return;
	}

}
