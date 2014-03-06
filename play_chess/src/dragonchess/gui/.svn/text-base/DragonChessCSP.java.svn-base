package dragonchess.gui;

import java.awt.Dimension;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JSplitPane;

import org.apache.log4j.Logger;

import dragonchess.Utils;
import dragonchess.game.GamePieceColor;
import dragonchess.pgn.Hit;

/**
 * This JSplitPane contains the chess board and the list of moves.
 * 
 * @author Group 4
 */
public class DragonChessCSP extends JPanel {

	private static final long serialVersionUID = 778899001L;
	private static final Logger log = Logger.getLogger(DragonChessCSP.class);

	private MovesPanel movesPanel;
	private ChessBoardPanel chessPanel;
	private CapturedPanel blackCaptured;
	private CapturedPanel whiteCaptured;
	private JSplitPane splitPane;
	private DragonChessMW parent;

	/**
	 * Default constructor
	 */
	public DragonChessCSP(DragonChessMW parent) {
		super();

		this.parent = parent;
		this.createSplitPane();

		return;
	}

	/**
	 * Set the maxinum time - in minutes - each Player has to complete all of
	 * his/her moves.
	 * 
	 * @param maxTime
	 */
	public void setMaxTime(int maxTime) {
		this.movesPanel.setMaxTime(maxTime);

		return;
	}

	public void setWhiteName() {
		this.movesPanel.setWhiteName();

		return;
	}

	public void setBlackName() {
		this.movesPanel.setBlackName();

		return;
	}

	/**
	 * Return the splitPane (used by MainSplitPane).
	 */
	public MovesPanel getMovesPanel() {
		return this.movesPanel;
	}

	/**
	 * Return the splitPane (used by MainSplitPane).
	 */
	public JSplitPane getSplitPane() {
		return this.splitPane;
	}

	/**
	 * Add a hit to the movesList.
	 *
	 * @param hit
	 */
	public void addHit(Hit hit) {
		this.movesPanel.addHit(hit);

		return;
	}

	/**
	 * Remove a hit from the movesList.
	 *
	 * @param hit
	 */
	public void removeHit(Hit hit) {
		this.movesPanel.removeHit(hit);

		return;
	}

	/**
	 * Update a hit from the movesList.
	 *
	 * @param hit
	 */
	public void updateHit(Hit hit) {
		this.movesPanel.updateHit(hit);

		return;
	}

	/**
	 *
	 */
	private void createSplitPane() {
		this.movesPanel = new MovesPanel(this.parent);
		this.chessPanel = new ChessBoardPanel(this.parent);
		this.whiteCaptured = new CapturedPanel(this.parent,
				GamePieceColor.White);
		this.blackCaptured = new CapturedPanel(this.parent,
				GamePieceColor.Black);
		JPanel chessBoard = new JPanel();
		chessBoard.setLayout(new BoxLayout(chessBoard, BoxLayout.LINE_AXIS));
		if (this.parent != null &&
				parent.getLocalPlayer().getGamePieceColor().equals(
					GamePieceColor.Black)) {
			chessBoard.add(this.blackCaptured);
			chessBoard.add(Box.createHorizontalStrut(5));
			chessBoard.add(this.chessPanel);
			chessBoard.add(Box.createHorizontalStrut(5));
			chessBoard.add(this.whiteCaptured);
		} else {
			chessBoard.add(this.whiteCaptured);
			chessBoard.add(Box.createHorizontalStrut(5));
			chessBoard.add(this.chessPanel);
			chessBoard.add(Box.createHorizontalStrut(5));
			chessBoard.add(this.blackCaptured);
		}

		this.splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				chessBoard, this.movesPanel);
		// this.splitPane.setOneTouchExpandable(true);
		this.splitPane.setDividerLocation(Utils.DCMSP_DIV_LOC);
		this.chessPanel.setMinimumSize(new Dimension(2 * Utils.DCCP_MIN_WIDTH
				+ Utils.DCCB_MIN_WIDTH_HEIGHT, Utils.DCCB_MIN_WIDTH_HEIGHT));
		this.whiteCaptured.setMinimumSize(new Dimension(Utils.DCCP_MIN_WIDTH,
				Utils.DCCB_MIN_WIDTH_HEIGHT));
		this.blackCaptured.setMinimumSize(new Dimension(Utils.DCCP_MIN_WIDTH,
				Utils.DCCB_MIN_WIDTH_HEIGHT));
		this.chessPanel.setMinimumSize(new Dimension(
				Utils.DCCB_MIN_WIDTH_HEIGHT, Utils.DCCB_MIN_WIDTH_HEIGHT));
		this.movesPanel.setMinimumSize(new Dimension(
				Utils.DCCB_MIN_MOVES_WIDTH, Utils.DCCB_MIN_WIDTH_HEIGHT));
		this.splitPane.setPreferredSize(new Dimension(Utils.DCMSP_MIN_WIDTH,
				Utils.DCMSP_C_MIN_HEIGHT));

		super.add(this.splitPane);

		return;
	}

}
