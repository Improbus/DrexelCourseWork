package dragonchess.game;

import org.apache.log4j.Logger;

/**
 * An enumeration of all (both) possible GamePiece colors.
 *
 * @author Group 4
 */
public enum GamePieceColor {

	White,
	Black,
	NULL;

	private static final Logger log = Logger.getLogger(GamePieceColor.class);

	/**
	 * Create a new GamePieceColor.
	 */
	private GamePieceColor() {
		return;
	}

	/**
	 * Return the GamePieceColor from the specified ordinal.
	 *
	 * @param ordinal
	 */
	public static GamePieceColor fromOrdinal(int ordinal) {
		GamePieceColor color = GamePieceColor.NULL;

		try { color = GamePieceColor.values()[ordinal]; }
		catch (ArrayIndexOutOfBoundsException aioob) { /** do nothing **/ }

		return color;
	}

	/**
	 * Return the GamePieceColor from the specified name.
	 *
	 * @param name
	 */
	public static GamePieceColor fromString(String name) {
		GamePieceColor color = GamePieceColor.valueOf(name);

		if (color ==  null) { color = GamePieceColor.NULL; }

		return color;
	}

}
