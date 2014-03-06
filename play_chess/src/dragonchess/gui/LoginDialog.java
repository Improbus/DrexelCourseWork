package dragonchess.gui;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.apache.log4j.Logger;

import dragonchess.Utils;

/**
 * A custom login JDialog.
 *
 * @author Group 4
 */
public class LoginDialog extends JDialog {

	private static final long serialVersionUID = 777777777L;
	private static final Logger log = Logger.getLogger(LoginDialog.class);

	private JFrame parent;
	private LoginListener listener;
	private JPanel mainPanel;
	private JOptionPane optionPane;
	private JTextField playerName;
	private JTextField hostName;
	private JTextField portNumber;
	private JTextField minutes;
	private JRadioButton serverRB;
	private JRadioButton clientRB;

	/**
	 * Create a new JDialog.
	 *
	 * @param owner
	 * @param title
	 * @param listener
	 */
	public LoginDialog(JFrame owner, String title) {
		super(owner, true);
		super.setTitle(title);

		this.parent = owner;

		this.createMainPanel();

		return;
    }

	/**
	 * Return the optionPane.
	 */
	public JOptionPane getOptionPane() {
		return this.optionPane;
	}

	/**
	 * Return the player name.
	 */
	public String getPlayerName() {
		String name = "";

		if (this.playerName != null) {
			name = this.playerName.getText().trim();
		}

		return name;
	}

	/**
	 * Set the player name.
	 *
	 * @param name
	 */
	public void setPlayerName(String name) {
		if (this.playerName != null) {
			name = this.playerName.getText();
		}

		return;
	}

	/**
	 * Return the host name.
	 */
	public String getHostName() {
		String name = "";

		if (this.hostName != null) {
			name = this.hostName.getText();
		}

		return name;
	}

	/**
	 * Set the host name.
	 *
	 * @param name
	 */
	public void setHostName(String name) {
		if (this.hostName != null) {
			this.hostName.setText(name);
		}

		return;
	}

	/**
	 * Enable/disable hostName.
	 *
	 * @param enable
	 */
	public void enableHost(boolean enable) {
		if (this.hostName != null) {
			this.hostName.setEnabled(enable);
		}
	}

	/**
	 * Enable/disable minutes.
	 *
	 * @param enable
	 */
	public void enableMinutes(boolean enable) {
		if (this.minutes != null) {
			this.minutes.setEnabled(enable);
		}
	}

	/**
	 * Return the port number.
	 */
	public int getPortNumber() {
		int port = Utils.DEFAULT_PORT_NUMBER;

		if (this.portNumber != null) {
			try { port = Integer.parseInt(this.portNumber.getText().trim()); }
			catch (NumberFormatException nfe) { /** do nothing **/ }
		}

		return port;
	}

	/**
	 * Set the port number.
	 *
	 * @param port
	 */
	public void setPortNumber(int port) {
		if (this.portNumber != null) {
			this.portNumber.setText(Integer.toString(port));
		}

		return;
	}

	/**
	 * Return true if "Host a match" has been selected.
	 */
	public boolean isServer() {
		boolean server = true;

		if (this.clientRB != null && this.clientRB.isSelected()) {
			server = false;
		}

		return server;
	}

	/**
	 * Return the number of minutes each Player has to make all of his/her moves.
	 */
	public int getMinutes() {
		int minutes = Utils.DEFAULT_TIME;

		if (this.minutes != null) {
			try { minutes = Integer.parseInt(this.minutes.getText().trim()); }
			catch (NumberFormatException nfe) { /** do nothing **/ }
		}

		return minutes;
	}

	/**
	 * Set the number of minutes each Player has to make all of his/her moves.
	 *
	 * @param minutes
	 */
	public void setMinutes(int minutes) {
		if (this.minutes != null) {
			this.minutes.setText(Long.toString(minutes));
		}

		return;
	}

	/**
	 * This method clears the dialog.
	 */
	public void clear() {
		if (this.playerName != null) {
			this.playerName.setText("");
		}
		if (this.hostName != null) {
			this.hostName.setText(Utils.DEFAULT_HOST_NAME);
		}
		if (this.portNumber != null) {
			this.portNumber.setText(Utils.DEFAULT_PORT_NUMBER_STR);
		}
		if (this.serverRB != null) {
			this.serverRB.setSelected(false);
		}
		if (this.clientRB != null) {
			this.clientRB.setSelected(false);
		}
		if (this.minutes != null) {
			this.minutes.setText(Utils.DEFAULT_TIME_STR);
		}

		return;
	}

	/**
	 * This method hides the dialog.
	 */
	public void conceal() {
		super.setVisible(!super.isVisible());

		return;
	}

	/**
	 * Set the LoginListener.
	 *
	 * @param listener
	 */
	public void setListener(LoginListener listener) {
		this.listener = listener;

		if (this.serverRB != null) {
			this.serverRB.addActionListener(this.listener);
		}
		if (this.clientRB != null) {
			this.clientRB.addActionListener(this.listener);
		}
		if (this.optionPane != null) {
			this.optionPane.addPropertyChangeListener(this.listener);
		}

		return;
	}

	/**
	 * Called from w/in the constructor to create the mainPanel.
	 */
	private void createMainPanel() {
//		this.prefSize = new Dimension(280, 260);
		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new BorderLayout());
//		this.mainPanel.setPreferredSize(this.prefSize);
		JPanel inputPanel = new JPanel();
		inputPanel.setLayout(new GridBagLayout());

		GridBagConstraints gc = new GridBagConstraints();
		Insets insets         = new Insets(2, 2, 2, 2);

		// row 0: Player name
		JLabel playerLabel = new JLabel("Player Name:");
		this.playerName    = new JTextField();
		this.playerName.setColumns(25);
		Utils.setConstraints(gc, 0, 0,
			GridBagConstraints.RELATIVE, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(playerLabel, gc);
		Utils.setConstraints(gc,
			GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE,
			GridBagConstraints.REMAINDER, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(this.playerName, gc);
		// row 1: Host name
		JLabel hostLabel = new JLabel("Host Name/IP address:");
		this.hostName    = new JTextField(Utils.DEFAULT_HOST_NAME);
		this.hostName.setColumns(25);
		this.hostName.setEnabled(false);
		Utils.setConstraints(gc, 1, 0,
			GridBagConstraints.RELATIVE, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(hostLabel, gc);
		Utils.setConstraints(gc,
			GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE,
			GridBagConstraints.REMAINDER, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(this.hostName, gc);
		// row 2: Port number
		JLabel portLabel = new JLabel(String.format("Port Number (%d - %d):",
			Utils.MIN_PORT, Utils.MAX_PORT));
		this.portNumber  = new JTextField(Utils.DEFAULT_PORT_NUMBER_STR);
		this.portNumber.setColumns(10);
		Utils.setConstraints(gc, 2, 0,
			GridBagConstraints.RELATIVE, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(portLabel, gc);
		Utils.setConstraints(gc,
			GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE,
			GridBagConstraints.REMAINDER, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(this.portNumber, gc);
		// row 3: Client/Server
		JPanel rbPanel = new JPanel();
		JLabel qLabel = new JLabel("Would you like to:");
		this.serverRB = new JRadioButton("Host a match");
		this.serverRB.setMnemonic(KeyEvent.VK_H);
		this.serverRB.setActionCommand(Utils.SERVER_RB_CMD);
		this.serverRB.setSelected(true);
		this.serverRB.addActionListener(this.listener);
		this.clientRB = new JRadioButton("Join a match");
		this.clientRB.setMnemonic(KeyEvent.VK_J);
		this.clientRB.setActionCommand(Utils.CLIENT_RB_CMD);
		this.clientRB.addActionListener(this.listener);
		ButtonGroup rbGroup = new ButtonGroup();
		rbGroup.add(this.serverRB);
		rbGroup.add(this.clientRB);
		rbPanel.add(this.serverRB);
		rbPanel.add(this.clientRB);
		Utils.setConstraints(gc, 3, 0,
			GridBagConstraints.RELATIVE, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(qLabel, gc);
		Utils.setConstraints(gc,
			GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE,
			GridBagConstraints.REMAINDER, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(rbPanel, gc);
		// row 4: minutes
		JLabel minLabel = new JLabel("Total Time Per Player (in minutes):");
		this.minutes    = new JTextField(Utils.DEFAULT_TIME_STR);
		this.minutes.setColumns(5);
		Utils.setConstraints(gc, 4, 0,
			GridBagConstraints.RELATIVE, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(minLabel, gc);
		Utils.setConstraints(gc,
			GridBagConstraints.RELATIVE, GridBagConstraints.RELATIVE,
			GridBagConstraints.REMAINDER, 1, GridBagConstraints.WEST, insets);
		inputPanel.add(this.minutes, gc);

		this.optionPane = new JOptionPane(null,
			JOptionPane.PLAIN_MESSAGE, JOptionPane.OK_CANCEL_OPTION);

		this.mainPanel.add(inputPanel, BorderLayout.CENTER);
		this.mainPanel.add(this.optionPane, BorderLayout.SOUTH);

		super.setContentPane(this.mainPanel);

		super.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		super.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				optionPane.setValue(new Integer(JOptionPane.CLOSED_OPTION));
			}
		});

		this.optionPane.addPropertyChangeListener(this.listener);

		return;
	}

}
