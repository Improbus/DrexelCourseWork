package dragonchess.game;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;

/**
 * Each player starts with two bishops.
 * <p>
 * Starting squares:
 * <ul>
 * <li>White:  c1 and f1</li>
 * <li>Black:  c8 and f8</li>
 * </ul>
 * </p>
 * <p>
 * Movement: unlimited diagonal, but cannot jump over other pieces.
 * </p>
 *
 * @author Group 4
 */
public class Bishop extends GamePiece {

	private static final long serialVersionUID = 10L;
	private static final Logger log = Logger.getLogger(Bishop.class);

	/**
	 * Create a new Bishop.
	 */
	public Bishop() {
		super(GamePieceType.Bishop, GamePieceColor.NULL, null);

		return;
	}

	/**
	 * Create a new Bishop.
	 *
	 * @param color
	 */
	public Bishop(GamePieceColor color) {
		super(GamePieceType.Bishop, color, null);

		return;
	}

	/**
	 * Create a new Bishop.
	 *
	 * @param color
	 * @param san
	 */
	public Bishop(GamePieceColor color, GamePieceSAN san) {
		super(GamePieceType.Bishop, color, san);

		return;
	}

  protected Collection<Square> getPotentialMoves(ChessBoard board) {
    ArrayList<Square> potentialMoves = new ArrayList<Square>();

    Direction[] directions = {Direction.NE, Direction.NW, Direction.SE, Direction.SW};
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
