package dragonchess.game;

import org.apache.log4j.Logger;

/**
 *
 * @author Group 4
 */
public enum EnPassant {

	Left,
	Right,
	None;

	private static final Logger log = Logger.getLogger(EnPassant.class);

	/**
	 * Create a new EnPassant.
	 */
	private EnPassant() {
		return;
	}

	/**
	 * Return the EnPassant from the specified ordinal.
	 *
	 * @param ordinal
	 */
	public static EnPassant fromOrdinal(int ordinal) {
		EnPassant enPassant = EnPassant.None;

		try { enPassant = EnPassant.values()[ordinal]; }
		catch (ArrayIndexOutOfBoundsException aioob) { /** do nothing **/ }

		return enPassant;
	}

	/**
	 * Return the EnPassant from the specified name.
	 *
	 * @param name
	 */
	public static EnPassant fromString(String name) {
		EnPassant enPassant = EnPassant.valueOf(name);

		if (enPassant ==  null) { enPassant = EnPassant.None; }

		return enPassant;
	}

}
