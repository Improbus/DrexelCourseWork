package dragonchess.game.commands;

import org.apache.log4j.Logger;

import dragonchess.game.Command;
import dragonchess.game.Player;

/**
 * DragonChess ResignCommand.
 *
 * @author Group 4
 */
public class ResignCommand implements Command {

	private static final long serialVersionUID = 595L;
	private static final Logger log = Logger.getLogger(ResignCommand.class);

	private Player localPlayer;

	/**
	 * Create a new ResignCommand.
	 *
	 * @param localPlayer
	 */
	public ResignCommand(Player localPlayer) {
		this.localPlayer = localPlayer;

		return;
	}

	/**
	 * Return the Player that resigned.
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
