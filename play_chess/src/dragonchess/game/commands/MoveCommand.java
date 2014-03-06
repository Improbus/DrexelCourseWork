package dragonchess.game.commands;

import org.apache.log4j.Logger;

import dragonchess.game.GamePiece;
import dragonchess.game.Position;
import dragonchess.game.UndoableCommand;

/**
 * DragonChess MoveCommands.
 *
 * @author Group 4
 */
public class MoveCommand implements UndoableCommand {

	private static final long serialVersionUID = 5L;
	private static final Logger log = Logger.getLogger(MoveCommand.class);

	private GamePiece piece;
	private GamePiece capturedPiece;
	private Position oldPosition;
	private Position newPosition;

	/**
	 * Create a new MoveCommand.
	 *
	 * @param piece The GamePiece to move.
	 * @param newPosition The Position to move to.
	 */
	public MoveCommand(GamePiece piece, Position newPosition) {
		this.piece       = piece;
		this.oldPosition = piece.getPosition();
		this.newPosition = newPosition;
		this.capturedPiece = null;

		return;
	}

	/**
	 * Return the GamePiece to be moved.
	 */
	public GamePiece getGamePiece() {
		return this.piece;
	}

	/**
	 * Return the new Position.
	 */
	public Position getNewPosition() {
		return this.newPosition;
	}

	/**
	 * Return the old Position.
	 */
	public Position getOldPosition() {
		return this.oldPosition;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.format("%1$s - %2$s",
			(this.oldPosition != null ? this.oldPosition.toString() : "NULL"),
			(this.newPosition != null ? this.newPosition.toString() : "NULL"));
	}

	//
	// implement UndoableCommand
	//

	/**
	 * {@inheritDoc}
	 */
	public void execute() {
		this.move(this.newPosition);

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void undo() {
		this.unmove(this.oldPosition);

		return;
	}

	/**
	 * Move to the specified Position.
	 *
	 * @param toPosition
	 */
	private void move(Position toPosition) {
		this.piece.setPosition(toPosition, false);

		return;
	}

	private void unmove(Position toPosition) {
		this.piece.setPosition(toPosition, true);

		return;
	}

	public void setCapturedPiece(GamePiece capturedPiece) {
		this.capturedPiece = capturedPiece;
	}

	public GamePiece getCapturedPiece() {
		return capturedPiece;
	}

}
