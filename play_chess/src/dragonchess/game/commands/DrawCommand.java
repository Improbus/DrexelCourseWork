package dragonchess.game.commands;

import org.apache.log4j.Logger;

import dragonchess.game.Command;
import dragonchess.game.Player;

/**
 * DragonChess DrawCommand.
 *
 * @author Group 4
 */
public class DrawCommand implements Command {

	private static final long serialVersionUID = 545L;
	private static final Logger log = Logger.getLogger(DrawCommand.class);

	private Player localPlayer;

	/**
	 * Create a new DrawCommand.
	 *
	 * @param localPlayer
	 */
	public DrawCommand(Player localPlayer) {
		this.localPlayer = localPlayer;

		return;
	}

	/**
	 * Return the Player that initiated the draw offer.
	 */
	public Player getPlayer() {
		return this.localPlayer;
	}

	//
	// implement Command
	//

	/**
	 * {@inheritDoc}
	 */
	public void execute() {
		// do nothing
		return;
	}

}
