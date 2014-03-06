package dragonchess.game;

/**
 * Result
 *
 * @author Group 4
 */
public enum Result {

	WhiteWon("1-0"),
	BlackWon("0-1"),
	Draw("1/2-1/2"),
	Other("*");

	/**
	 * The result of the match.
	 */
	private String result;

	/**
	 * Create a new Result.
	 *
	 * @param result
	 */
	private Result(String result) {
		this.result = result;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return this.result;
	}

	/**
	 * Return the Result from the specified ordinal.
	 *
	 * @param ordinal
	 */
	public static Result fromOrdinal(int ordinal) {
		Result type = Result.Other;

		try { type = Result.values()[ordinal]; }
		catch (ArrayIndexOutOfBoundsException aioob) { /** do nothing **/ }

		return type;
	}

	/**
	 * Return the Result from the specified string.
	 *
	 * @param string
	 */
	public static Result fromString(String string) {
		Result r = Result.valueOf(string);

		if (r ==  null) { r = Result.Other; }

		return r;
	}

}
