package dragonchess.game;

import org.apache.log4j.Logger;

/**
 * An enumeration of all the DrogonChess game pieces.
 *
 * @author Group 4
 */
public enum GamePieceType {

	Pawn(1),
	Knight(3),
	Bishop(3),
	Rook(5),
	Queen(9),
	King(Integer.MAX_VALUE),
	Empty(0);

	private static final Logger log = Logger.getLogger(GamePieceType.class);

	/**
	 * The relative value of each game piece (i.e. the 1/3/3/5/9 system).
	 */
	private int value;

	/**
	 * Create a new GamePieceType with the specified 'value.'
	 *
	 * @param value
	 */
	private GamePieceType(int value) {
		this.value = value;

		return;
	}

	/**
	 * Return the value of this GamePieceType.
	 */
	public int getValue() {
		return this.value;
	}

	/**
	 * Set the value of this GamePieceType.
	 *
	 * @param newValue
	 */
	public void setValue(int newValue) {
		this.value = newValue;

		return;
	}

	/**
	 * Return the GamePieceType from the specified ordinal.
	 *
	 * @param ordinal
	 */
	public static GamePieceType fromOrdinal(int ordinal) {
		GamePieceType type = GamePieceType.Empty;

		try { type = GamePieceType.values()[ordinal]; }
		catch (ArrayIndexOutOfBoundsException aioob) { /** do nothing **/ }

		return type;
	}

	/**
	 * Return the GamePieceType from the specified name.
	 *
	 * @param name
	 */
	public static GamePieceType fromString(String name) {
		GamePieceType type = GamePieceType.valueOf(name);

		if (type ==  null) { type = GamePieceType.Empty; }

		return type;
	}

}
