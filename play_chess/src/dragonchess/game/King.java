package dragonchess.game;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * Each player starts with one king.
 * <p>
 * Starting squares:
 * <ul>
 * <li>White:  e1</li>
 * <li>Black:  e8</li>
 * </ul>
 * </p>
 * <p>
 * Movement: one square in any direction, and cannot jump over other pieces.
 * </p>
 *
 * @author Group 4
 */
public class King extends GamePiece {

	private static final long serialVersionUID = 15L;
	private static final Logger log = Logger.getLogger(King.class);
  private int numMoves = 0;

	/**
	 * Create a new King.
	 */
	public King() {
		super(GamePieceType.King, GamePieceColor.NULL, null);

		return;
	}

	/**
	 * Create a new King.
	 *
	 * @param color
	 */
	public King(GamePieceColor color) {
		super(GamePieceType.King, color, null);

		return;
	}

	/**
	 * Create a new King.
	 *
	 * @param color
	 * @param san
	 */
	public King(GamePieceColor color, GamePieceSAN san) {
		super(GamePieceType.King, color, san);

		return;
	}

  public void setPosition(Position pose, boolean undo)
  {
    Position oldPosition = getPosition();
    Position newPosition = pose;

    if(oldPosition.getFile() == 'e' && newPosition.getFile() == 'c')
    {
      if(getColor() == GamePieceColor.White)
        setLongCastle();
      else
        setShortCastle();
    }

    if(oldPosition.getFile() == 'e' && newPosition.getFile() == 'g')
    {
      if(getColor() == GamePieceColor.White)
        setShortCastle();
      else
        setLongCastle();
    }

    super.setPosition(pose, undo);
    if(!undo)
      numMoves++;
    else
      numMoves--;
  }


  protected Collection<Square> getPotentialMoves(ChessBoard board) {
    ArrayList<Square> potentialMoves = new ArrayList<Square>();

    Direction[] directions = {Direction.N, Direction.S, Direction.E, Direction.W, Direction.NW, Direction.NE, Direction.SW, Direction.SE};

    Position pos = getPosition();

    for(Direction direction : directions)
    {
      Position next = pos.nextPosition(direction);
      if(next != null)
      {
        Square square = board.getSquare(next);
        if(square.isEmpty() || square.getPiece().getColor() != getColor())
          potentialMoves.add(square);
      }
    }

    if(numMoves == 0)
    {
      // check if castling is possible
      Direction[] castleDirections = {Direction.W, Direction.E};
      for(Direction direction : castleDirections)
      {
        List<Position> ray = board.getRay(pos, direction);
        if(ray.size() >= 2)
        {
          for(Position p : ray)
          {
            Square square = board.getSquare(p);
            if( square.isEmpty() )
            {
            }
            else if( (square.getPiece() instanceof Rook &&
                ((Rook) square.getPiece()).hasNotMoved() ))
            {
              Square castleSquare = board.getSquare( ray.get(1) );
              potentialMoves.add(castleSquare);
              this.setLongCastle();
              System.err.println("Castle value: " + this.getLongCastle());
            }
            else
            {
              break;
            }
          }
        }
      }
    }

    return potentialMoves;
	}
}
