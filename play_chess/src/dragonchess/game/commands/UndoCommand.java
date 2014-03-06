package dragonchess.game.commands;

import org.apache.log4j.Logger;

import dragonchess.game.Command;

/**
 * DragonChess UndoCommands.
 *
 * @author Group 4
 */
public class UndoCommand implements Command {

	private static final long serialVersionUID = 555L;
	private static final Logger log = Logger.getLogger(UndoCommand.class);

	/**
	 * Create a new UndoCommand.
	 */
	public UndoCommand() {
		return;
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
