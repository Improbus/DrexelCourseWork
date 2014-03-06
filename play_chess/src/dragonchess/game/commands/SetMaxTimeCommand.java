package dragonchess.game.commands;

import org.apache.log4j.Logger;

import dragonchess.game.Command;

/**
 * DragonChess SetMaxTimeCommands.
 *
 * @author Group 4
 */
public class SetMaxTimeCommand implements Command {

	private static final long serialVersionUID = 115L;
	private static final Logger log = Logger.getLogger(SetMaxTimeCommand.class);

	private int time;

	/**
	 * Create a new SetMaxTimeCommand
	 *
	 * @param time
	 */
	public SetMaxTimeCommand(int time) {
		this.time = time;

		return;
	}

	/**
	 * Return the maximum time - in minutes - each player has to
	 * complete all his/her moves.
	 */
	public int getMaxTime() {
		return this.time;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.format("%1$d minutes", this.time);
	}

	//
	// implement Command
	//

	/**
	 * {@inheritDoc}
	 */
	public void execute() {
		// does nothing
		return;
	}

}
