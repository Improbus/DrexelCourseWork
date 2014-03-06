package dragonchess.gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JSplitPane;

import org.apache.log4j.Logger;

import dragonchess.Utils;
import dragonchess.pgn.Hit;

/**
 * This is the main JSplitPane for the DragonChess application.
 *
 * @author Group 4
 */
public class DragonChessMSP extends JPanel {

	private static final long serialVersionUID = 112233445L;
	private static final Logger log = Logger.getLogger(DragonChessMSP.class);

	private JSplitPane inputSP;
	private InputPanel inputPanel;
	private DragonChessCSP chessSP;
	private DragonChessMW parent;

	/**
	 * Default constructor
	 */
	public DragonChessMSP(DragonChessMW parent) {
		super();

		this.parent = parent;
		this.createInputSP();

		return;
	}

	/**
	 * Set the maxinum time - in minutes - each Player has to
	 * complete all of his/her moves.
	 *
	 * @param maxTime
	 */
	public void setMaxTime(int maxTime) {
		this.chessSP.setMaxTime(maxTime);

		return;
	}

	public void setWhiteName() {
		this.chessSP.setWhiteName();

		return;
	}

	public void setBlackName() {
		this.chessSP.setBlackName();

		return;
	}

	/**
	 * Return the InputPanel.
	 */
	public InputPanel getInputPanel() {
		return this.inputPanel;
	}

	/**
	 * Add a hit to the movesList.
	 *
	 * @param hit
	 */
	public void addHit(Hit hit) {
		this.chessSP.addHit(hit);

		return;
	}

	/**
	 * Remove a hit from the movesList.
	 *
	 * @param hit
	 */
	public void removeHit(Hit hit) {
		this.chessSP.removeHit(hit);

		return;
	}

	/**
	 * Update a hit from the movesList.
	 *
	 * @param hit
	 */
	public void updateHit(Hit hit) {
		this.chessSP.updateHit(hit);

		return;
	}
	/**
	 *
	 */
	private void createInputSP() {
		this.chessSP    = new DragonChessCSP(this.parent);
		this.inputPanel = new InputPanel(this.parent);

		JSplitPane center = this.chessSP.getSplitPane();
		center.setBorder(null);

		this.inputSP = new JSplitPane(JSplitPane.VERTICAL_SPLIT,
			center, this.inputPanel);

		this.inputSP.setOneTouchExpandable(true);
		this.inputSP.setDividerLocation(Utils.DCMSP_DIV_LOC);

		center.setMinimumSize(new Dimension(Utils.DCMSP_MIN_WIDTH,
			Utils.DCMSP_C_MIN_HEIGHT));
		this.inputPanel.setMinimumSize(new Dimension(
			Utils.DCMSP_MIN_WIDTH, Utils.DCMSP_I_MIN_HEIGHT));

		super.add(this.inputSP);

		return;
	}

}
