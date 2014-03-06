package dragonchess.game;

import org.apache.log4j.Logger;

/**
 * An enumeration of all Directions.
 *
 * @author Group 4
 */
public enum Direction {

	N("North"),
	NNE("North-northeast"),
	NE("Northeast"),
	ENE("East-northeast"),
	E("East"),
	ESE("East-southeast"),
	SE("Southeast"),
	SSE("South-southeast"),
	S("South"),
	SSW("South-southwest"),
	SW("Southwest"),
	WSW("West-southwest"),
	W("West"),
	WNW("West-northwest"),
	NW("Northwest"),
	NNW("North-northwest");

	private static final Logger log = Logger.getLogger(Direction.class);

	/** Description */
	private String descr;

	/**
	 * Create a new Direction with the specified description.
	 *
	 * @param descr
	 */
	private Direction(String descr) {
		this.descr = descr;

		return;
	}

	/**
	 * Return the description of this Direction.
	 */
	public String getDescription() {
		return this.descr;
	}

	/**
	 * Return the Direction from the specified ordinal.
	 *
	 * @param ordinal
	 */
	public static Direction fromOrdinal(int ordinal) {
		Direction type = Direction.N;

		try { type = Direction.values()[ordinal]; }
		catch (ArrayIndexOutOfBoundsException aioob) { /** do nothing **/ }

		return type;
	}

	/**
	 * Return the Direction from the specified name.
	 *
	 * @param name
	 */
	public static Direction fromString(String name) {
		Direction type = Direction.valueOf(name);

		if (type ==  null) { type = Direction.N; }

		return type;
	}

}
