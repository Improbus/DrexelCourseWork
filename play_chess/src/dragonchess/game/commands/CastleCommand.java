package dragonchess.game.commands;

import dragonchess.game.King;
import dragonchess.game.Position;

/**
 * DragonChess CastleCommands
 *
 * @author Group 4
 */
public class CastleCommand extends MoveCommand {

	private static final long serialVersionUID = -555L;
  private MoveCommand rookMoveCommand;

  public CastleCommand(King kingPiece, Position newPosition, 
      MoveCommand rookMoveCommand)
  {
    super(kingPiece, newPosition);

    this.rookMoveCommand = rookMoveCommand;

    return;
  }

  public void execute() {
    super.execute();

    rookMoveCommand.execute();
  }

  public void undo() {
    super.undo();

    rookMoveCommand.undo();
  }

  public MoveCommand getRookMoveCommand() {
    return rookMoveCommand;
  }

  public String toString() {
  	StringBuilder sb = new StringBuilder();

	sb.append(super.toString()).append(" ");
	sb.append(this.rookMoveCommand.toString());

	return sb.toString();
  }

}
