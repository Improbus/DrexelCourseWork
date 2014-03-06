package dragonchess.game.commands;

import org.apache.log4j.Logger;

import dragonchess.MatchState;
import dragonchess.game.Command;

/**
 * DragonChess SetTurnCommands.
 *
 * @author Group 4
 */
public class SetTurnCommand implements Command {

	private static final long serialVersionUID = 15L;
	private static final Logger log = Logger.getLogger(SetTurnCommand.class);

	private MatchState turn;

	/**
	 * Create a new SetTurnCommand
	 *
	 * @param turn
	 */
	public SetTurnCommand(MatchState turn) {
		this.turn = turn;

		return;
	}

	/**
	 * Return whose turn it to move.
	 */
	public MatchState getTurn() {
		return this.turn;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return this.turn.toString();
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
