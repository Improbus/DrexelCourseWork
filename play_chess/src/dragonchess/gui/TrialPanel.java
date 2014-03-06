package dragonchess.gui;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

import org.apache.log4j.Logger;

import dragonchess.Utils;

/**
 * The test JPanel.
 *
 * @author Group 4
 */
public class TrialPanel extends JPanel implements ActionListener {

	private static final long serialVersionUID = 771199228L;
	private static final Logger log = Logger.getLogger(TrialPanel.class);

	/** */
	private JButton moveButton;
	/** */
	private JTextField oldSquareFile;
	/** */
	private JTextField oldSquareRank;
	/** */
	private JTextField newSquareFile;
	/** */
	private JTextField newSquareRank;
	/** */
	private DragonChessMW parent;

	/**
	 * Default constructor
	 */
	public TrialPanel(DragonChessMW parent) {
		super();

		this.parent = parent;
		this.createTrialPanel();

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
		String eCmd = e.getActionCommand();

		if (eCmd.equals(Utils.MOVE_CMD)) {
//			char oFile = this.getFile(this.oldSquareFile);
//			int oRank = this.getRank(this.oldSquareRank);
//			char nFile = this.getFile(this.newSquareFile);
//			int nRank = this.getRank(this.newSquareRank);
//			Position oldPose = new Position(oFile, oRank);
//			Position newPose = new Position(nFile, nRank);
//			Square oSquare = this.parent.getSquare(oldPose);
//			Square nSquare = this.parent.getSquare(newPose);
//			if (!(oSquare == null || nSquare == null)) {
//				log.debug(String.format("actionPerformed():  oSquare = %s",
//					oSquare));
//				log.debug(String.format("actionPerformed():  nSquare = %s",
//					nSquare));
//				if (!oSquare.isEmpty()) {
//					GamePiece gp = oSquare.getPiece();
//					log.debug(String.format("actionPerformed():  gp = %s", gp));
//					if (gp.isValidMove(nSquare)) {
//						log.debug("actionPerformed():  Valid move....");
//						Command cmd = null;
//						if (nSquare.isEmpty()) {
//							log.debug("actionPerformed():  nSquare.isEmpty()");
//							cmd = new MoveCommand(gp , nSquare);
//						} else {
//							// TODO
//						}
//						if (cmd != null) {
//							log.debug(String.format(
//								"actionPerformed():  cmd = %s", cmd.toString()));
//							this.parent.sendCommand(cmd);
//						} else {
//							log.debug("actionPerformed():  cmd = null");
//						}
//					} else {
//						JOptionPane.showMessageDialog(
//							this.parent.getRootFrame(),
//							String.format("Can NOT move to %s.", nSquare),
//							"Error",
//							JOptionPane.ERROR_MESSAGE);
//					}
//				} else {
//					JOptionPane.showMessageDialog(
//						this.parent.getRootFrame(),
//						String.format("%s is NOT occupied.", oSquare),
//						"Error",
//						JOptionPane.ERROR_MESSAGE);
//				}
//			} else {
//				JOptionPane.showMessageDialog(
//					this.parent.getRootFrame(),
//					"Unable to retrive the specified Squares.",
//					"Error",
//					JOptionPane.ERROR_MESSAGE);
//			}
		}

		return;
	}


	/**
	 * @param field
	 */
	private char getFile(JTextField field) {
		char f = 'z';
		String file = field.getText().trim();
		if (file.length() != 1) {
			JOptionPane.showMessageDialog(
				this.parent.getRootFrame(),
				"File must be a single character.",
				"Error",
				JOptionPane.ERROR_MESSAGE);
			return f;
		}
		f = file.charAt(0);
		if (f < 'a' || f > 'h') {
			JOptionPane.showMessageDialog(
				this.parent.getRootFrame(),
				String.format("%s%s\n%s", file,
					" is NOT valid.",
					"File must be a character between 'a' and 'h'."),
				"Error",
				JOptionPane.ERROR_MESSAGE);
			return f;
		}

		return f;
	}

	/**
	 * @param field
	 */
	private int getRank(JTextField field) {
		int rank = 0;

		try {
			rank = Integer.parseInt(field.getText().trim());
		}
		catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(
				this.parent.getRootFrame(),
				"Rank must be a number between 1 and 8.",
				"Error",
				JOptionPane.ERROR_MESSAGE);
		}

		return rank;
	}

	/**
	 *
	 */
	private void createTrialPanel() {
		super.setLayout(new GridLayout());
		super.setBorder(BorderFactory.createTitledBorder(
			BorderFactory.createEtchedBorder(EtchedBorder.RAISED,
				Color.darkGray, Color.black),
			"MoveCommand"));

		JPanel movePanel = new JPanel();
		movePanel.setLayout(new GridLayout());

		JLabel osLabel = new JLabel("Old Square:");
		this.oldSquareFile = new JTextField();
		this.oldSquareRank = new JTextField();

		JLabel nsLabel = new JLabel("New Square:");
		this.newSquareFile = new JTextField();
		this.newSquareRank = new JTextField();

		this.moveButton = new JButton(Utils.MOVE_CMD);
		this.moveButton.addActionListener(this);
		this.moveButton.setActionCommand(Utils.MOVE_CMD);

		movePanel.add(osLabel);
		movePanel.add(this.oldSquareFile);
		movePanel.add(this.oldSquareRank);
		movePanel.add(nsLabel);
		movePanel.add(this.newSquareFile);
		movePanel.add(this.newSquareRank);
		movePanel.add(this.moveButton);

		super.add(movePanel);

		return;
	}

}
