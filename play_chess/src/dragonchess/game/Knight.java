package dragonchess.game;

import java.util.ArrayList;
import java.util.Collection;

import org.apache.log4j.Logger;

/**
 * Each player starts with two knights.
 * <p>
 * Starting squares:
 * <ul>
 * <li>White:  b1 and g1</li>
 * <li>Black:  b8 and g8</li>
 * </ul>
 * </p>
 * <p>
 * Movement: two squares horizontally and one square vertically, or
 * two squares vertically and one square horizontally; can jump over
 * all other game pieces.
 * </p>
 *
 * @author Group 4
 */
public class Knight extends GamePiece {

	private static final long serialVersionUID = 20L;
	private static final Logger log = Logger.getLogger(Knight.class);

	/**
	 * Create a new Knight.
	 */
	public Knight() {
		super(GamePieceType.Knight, GamePieceColor.NULL, null);

		return;
	}

	/**
	 * Create a new Knight.
	 *
	 * @param color
	 */
	public Knight(GamePieceColor color) {
		super(GamePieceType.Knight, color, null);

		return;
	}

	/**
	 * Create a new Knight.
	 *
	 * @param color
	 * @param san
	 */
	public Knight(GamePieceColor color, GamePieceSAN san) {
		super(GamePieceType.Knight, color, san);

		return;
	}

  protected Collection<Square> getPotentialMoves(ChessBoard board) {
    ArrayList<Square> potentialMoves = new ArrayList<Square>();   

    Direction[][] corners = {{Direction.N, Direction.W},
                             {Direction.N, Direction.E},
                             {Direction.S, Direction.W},
                             {Direction.S, Direction.E}};

    Position pos = getPosition();
    Position next, nextNext, diag;
    for(Direction[] corner : corners)
    {
      if((next = pos.nextPosition(corner[0])) != null &&
          (nextNext = next.nextPosition(corner[0])) != null &&
          (diag = nextNext.nextPosition(corner[1])) != null)
      {
        Square s = board.getSquare( diag );
        if( s.isEmpty() || s.getPiece().getColor() != getColor() )
          potentialMoves.add(s);
      }
      
      if((next = pos.nextPosition(corner[1])) != null &&
          (nextNext = next.nextPosition(corner[1])) != null &&
          (diag = nextNext.nextPosition(corner[0])) != null)
      {
        Square s = board.getSquare( diag );
        if( s.isEmpty() || s.getPiece().getColor() != getColor() )
          potentialMoves.add(s);
      }

    }

    return potentialMoves;

	}

}
