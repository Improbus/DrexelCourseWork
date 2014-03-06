package dragonchess.game;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;

/**
 * Each player starts with two rooks.
 * <p>
 * Starting squares:
 * <ul>
 * <li>White:  a1 and h1</li>
 * <li>Black:  a8 and h8</li>
 * </ul>
 * </p>
 * <p>
 * Movement: unlimited vertical and horizontal,
 * but cannot jump over other pieces.
 * </p>
 *
 * @author Group 4
 */
public class Rook extends GamePiece {

	private static final long serialVersionUID = 35L;
	private static final Logger log = Logger.getLogger(Rook.class);
  private int numMoves = 0;

	/**
	 * Create a new Rook.
	 */
	public Rook() {
		super(GamePieceType.Rook, GamePieceColor.NULL, null);

		return;
	}

	/**
	 * Create a new Rook.
	 *
	 * @param color
	 */
	public Rook(GamePieceColor color) {
		super(GamePieceType.Rook, color, null);

		return;
	}

	/**
	 * Create a new Rook.
	 *
	 * @param color
	 * @param san
	 */
	public Rook(GamePieceColor color, GamePieceSAN san) {
		super(GamePieceType.Rook, color, san);

		return;
	}

  public void setPosition(Position pose, boolean undo)
  {
    super.setPosition(pose, undo);

    if(!undo)
      numMoves++;
    else
      numMoves--;
  }

  protected Collection<Square> getPotentialMoves(ChessBoard board) {
    ArrayList<Square> potentialMoves = new ArrayList<Square>();

    Direction[] directions = {Direction.N, Direction.E, Direction.S, Direction.W};
    Position myPose = super.getPosition();

    for(Direction direction : directions)
    {
      for(Position p : board.getRay(myPose, direction))
      {
        Square square = board.getSquare(p);
        if( square.isEmpty() )
          potentialMoves.add(square);
        else
        {
          if( square.getPiece().getColor() != getColor() )
            potentialMoves.add(square);

          break;
        }
      }
    }

		return potentialMoves;
  }

  public boolean hasNotMoved()
  {
    return numMoves == 0;
  }

}
