package dragonchess.game;

import java.io.Serializable;

import org.apache.log4j.Logger;

/**
 * A Square.
 *
 * @author Group 4
 */
public class Square implements Serializable {

	private static final long serialVersionUID = 5L;
	private static final Logger log = Logger.getLogger(Square.class);

	protected Position position;
	protected GamePiece piece;

	/**
	 * Create a new Square
	 *
	 * @param position
	 */
	public Square(Position position) {
		this(position, null);

		return;
	}

	/**
	 * Create a new Square
	 *
	 * @param position
	 * @param piece
	 */
	public Square(Position position, GamePiece piece) {
		this.position = position;
		this.piece    = piece;

		return;
	}

	/**
	 * Return the Position of this Square.
	 */
	public Position getPosition() {
		return this.position;
	}

	/**
	 * Return the GamePiece that is occupying this Square.
	 */
	public GamePiece getPiece() {
		return this.piece;
	}

	/**
	 * Set the GamePiece for this Square.
	 *
	 * @param newPiece
	 */
	public void setPiece(GamePiece newPiece) {
		this.piece = newPiece;

		return;
	}

	/**
	 * Return true is this.piece is null.
	 */
	public boolean isEmpty() {
		return this.piece == null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object other) {
		boolean equal = false;

		if (other instanceof Square) {
			Square sq = (Square)other;
			if (this.position != null) {
				equal = this.position.equals(sq.getPosition());
			}
			if (this.piece != null) {
				equal = this.piece.equals(sq.getPiece());
			}
		}

		return equal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.format("%1$2s[%2$5s]", this.position.toString(),
			(this.piece != null ? this.piece.toString() : ""));
	}

}
