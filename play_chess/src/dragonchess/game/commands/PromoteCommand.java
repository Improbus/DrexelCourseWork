package dragonchess.game.commands;

import org.apache.log4j.Logger;

import dragonchess.game.GamePiece;
import dragonchess.game.GamePieceType;
import dragonchess.game.Promoteable;
import dragonchess.game.UndoableCommand;

/**
 * DragonChess PromoteCommands.
 *
 * @author Group 4
 */
public class PromoteCommand implements UndoableCommand {

	private static final long serialVersionUID = 10L;
	private static final Logger log = Logger.getLogger(PromoteCommand.class);

	private Promoteable piece;
	private GamePieceType newType;

	/**
	 * Create a new PromoteCommand
	 *
	 * @param piece
	 * @param newType
	 */
	public PromoteCommand(Promoteable piece, GamePieceType newType) {
		this.piece   = piece;
		this.newType = newType;

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public String toString() {
		return this.piece.toString();
	}

	//
	// implement UndoableCommand
	//

	/**
	 * {@inheritDoc}
	 */
	public void execute() {
		this.piece.promote(this.newType);
		((GamePiece)this.piece).setPromote();

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void undo() {
		this.piece.demote();
		((GamePiece)this.piece).clearFlags();

		return;
	}

}
