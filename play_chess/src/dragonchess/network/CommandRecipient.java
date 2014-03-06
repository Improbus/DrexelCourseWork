package dragonchess.network;

import dragonchess.game.Command;

/**
 * This interface defines a CommandRecipient.
 *
 * @author Group 4
 */
public interface CommandRecipient {

	/**
	 * Handle any incoming Commands.
	 *
	 * @param command
	 */
	public void handleCommand(Command command);

}
