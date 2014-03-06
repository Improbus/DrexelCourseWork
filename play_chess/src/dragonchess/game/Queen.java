package dragonchess.game;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;

/**
 * Each player starts with a single queen.
 * <p>
 * Starting squares:
 * <ul>
 * <li>White:  d1</li>
 * <li>Black:  d8</li>
 * </ul>
 * </p>
 * <p>
 * Movement: unlimited vertical, horizontal, and diagonal;
 * but cannot jump over other pieces.
 * </p>
 *
 * @author Group 4
 */
public class Queen extends GamePiece {

	private static final long serialVersionUID = 30L;
	private static final Logger log = Logger.getLogger(Queen.class);

	/**
	 * Create a new Queen.
	 */
	public Queen() {
		super(GamePieceType.Queen, GamePieceColor.NULL, null);

		return;
	}

	/**
	 * Create a new Queen.
	 *
	 * @param color
	 */
	public Queen(GamePieceColor color) {
		super(GamePieceType.Queen, color, null);

		return;
	}

	/**
	 * Create a new Queen.
	 *
	 * @param color
	 * @param san
	 */
	public Queen(GamePieceColor color, GamePieceSAN san) {
		super(GamePieceType.Queen, color, san);

		return;
	}

  protected Collection<Square> getPotentialMoves(ChessBoard board) {
    ArrayList<Square> potentialMoves = new ArrayList<Square>();

    Direction[] directions = {Direction.N, Direction.S, Direction.E, Direction.W, Direction.NW, Direction.NE, Direction.SW, Direction.SE};

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

}
