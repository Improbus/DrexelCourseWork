package dragonchess.game;

import org.apache.log4j.Logger;

/**
 * A Player.
 *
 * @author Group 4
 */
public class Player implements Data {

	private static final long serialVersionUID = 5L;
	private static final Logger log = Logger.getLogger(Player.class);

	private String name;
	private GamePieceColor color;
	private boolean local;

	/**
	 * Create a new Player
	 *
	 * @param name
	 */
	public Player(String name) {
		this(name, GamePieceColor.NULL, true);

		return;
	}

	/**
	 * Create a new Player
	 *
	 * @param color
	 */
	public Player(GamePieceColor color) {
		this("", color, true);

		return;
	}

	/**
	 * Create a new Player
	 *
	 * @param name
	 * @param color
	 */
	public Player(String name, GamePieceColor color) {
		this(name, color, true);

		return;
	}

	/**
	 * Create a new Player
	 *
	 * @param name
	 * @param color
	 * @param local
	 */
	public Player(String name, GamePieceColor color, boolean local) {
		this.name  = name;
		this.color = color;
		this.local = local;

		return;
	}

	/**
	 * Return this Player's name.
	 *
	 * @return name
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Set this Player's name.
	 *
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Return this Player's GamePieceColor.
	 *
	 * @return color
	 */
	public GamePieceColor getGamePieceColor() {
		return this.color;
	}

	/**
	 * Set this Player's GamePieceColor.
	 *
	 * @param color
	 */
	public void setGamePieceColor(GamePieceColor color) {
		this.color = color;
	}

	/**
	 * Return true if this is the local Player.
	 */
	public boolean isLocal() {
		return this.local;
	}

	/**
	 * Set/un-set this Player the local Player.
	 *
	 * @param local
	 */
	public void setLocal(boolean local) {
		this.local = local;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public boolean equals(Object other) {
		boolean equal = false;

		if (other instanceof Player) {
			Player p = (Player)other;
			equal = this.color == p.getGamePieceColor();
		}

		return equal;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.format("[%1$s \"%2$s\"]", this.color.toString(), this.name);
	}

}
