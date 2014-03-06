package dragonchess.game.commands;

import org.apache.log4j.Logger;

import dragonchess.game.Command;
import dragonchess.game.Result;

/**
 * DragonChess SetResultCommands.
 *
 * @author Group 4
 */
public class SetResultCommand implements Command {

	private static final long serialVersionUID = 715L;
	private static final Logger log = Logger.getLogger(SetResultCommand.class);

	private Result result;

	/**
	 * Create a new SetResultCommand
	 *
	 * @param result
	 */
	public SetResultCommand(Result result) {
		this.result = result;

		return;
	}

	/**
	 * Reresult whose result it to move.
	 */
	public Result getResult() {
		return this.result;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return this.result.toString();
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
