package dragonchess.game.commands;

import dragonchess.game.Command;
import dragonchess.pgn.Hit;

import org.apache.log4j.Logger;

/**
 * DragonChess HitCommands.
 *
 * @author Group 4
 */
public class HitCommand implements Command {

	private static final long serialVersionUID = 715L;
	private static final Logger log = Logger.getLogger(HitCommand.class);

	private Hit hit;

	/**
	 * Create a new HitCommand
	 *
	 * @param hit
	 */
	public HitCommand(Hit hit) {
		this.hit = hit;

		return;
	}

	/**
	 * Rehit whose hit it to move.
	 */
	public Hit getHit() {
		return this.hit;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.format("%1$3d %2$s %3$s",
			this.hit.getNumber(), this.hit.getWhiteMove(), this.hit.getBlackMove());
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
