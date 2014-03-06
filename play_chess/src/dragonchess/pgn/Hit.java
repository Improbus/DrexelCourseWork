package dragonchess.pgn;

import org.apache.log4j.Logger;

import dragonchess.game.Data;

/**
 * A container class for listing out all of the chess match's hits.
 *
 * @author Group 4
 */
public class Hit implements Data {

	private static final long serialVersionUID = -5L;
	private static final Logger log = Logger.getLogger(Hit.class);

	private static int autoIncr = 1;

	private int number;
	private String whiteMove;
	private String blackMove;

	/**
	 * Create a new Hit.
	 */
	public Hit() {
		this("", "");

		return;
	}

	/**
	 * Create a new Hit.
	 *
	 * @param whiteMove
	 * @param blackMove
	 */
	public Hit(String whiteMove, String blackMove) {
		this.number    = Hit.autoIncr++;
		this.whiteMove = whiteMove;
		this.blackMove = blackMove;

		return;
	}

	/**
	 * Return the number of this Hit.
	 */
	public int getNumber() {
		return this.number;
	}

	/**
	 * Return white's move.
	 */
	public String getWhiteMove() {
		return this.whiteMove;
	}

	/**
	 * Set white's move.
	 *
	 * @param whiteMove
	 */
	public void setWhiteMove(String whiteMove) {
		this.whiteMove = whiteMove;

		return;
	}

	/**
	 * Return black's move.
	 */
	public String getBlackMove() {
		return this.blackMove;
	}

	/**
	 * Set black's move.
	 *
	 * @param blackMove
	 */
	public void setBlackMove(String blackMove) {
		this.blackMove = blackMove;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object other) {
		boolean equal = false;

		if (other instanceof Hit) {
			Hit h = (Hit)other;
			equal = this.number == h.getNumber();
		}

		return equal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.format("%1$3d. %2$s %3$s", this.number,
			this.whiteMove, this.blackMove);
	}

}
