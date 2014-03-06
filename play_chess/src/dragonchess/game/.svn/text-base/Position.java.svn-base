package dragonchess.game;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * The file and rank of each ChessBoard Square.
 *
 * @author Group 4
 */
public enum Position {

	A1('a', 1, false),
	B1('b', 1, false),
	C1('c', 1, false),
	D1('d', 1, false),
	E1('e', 1, false),
	F1('f', 1, false),
	G1('g', 1, false),
	H1('h', 1, false),
	A2('a', 2, false),
	B2('b', 2, false),
	C2('c', 2, false),
	D2('d', 2, false),
	E2('e', 2, false),
	F2('f', 2, false),
	G2('g', 2, false),
	H2('h', 2, false),
	A3('a', 3, false),
	B3('b', 3, false),
	C3('c', 3, false),
	D3('d', 3, false),
	E3('e', 3, false),
	F3('f', 3, false),
	G3('g', 3, false),
	H3('h', 3, false),
	A4('a', 4, false),
	B4('b', 4, false),
	C4('c', 4, false),
	D4('d', 4, false),
	E4('e', 4, false),
	F4('f', 4, false),
	G4('g', 4, false),
	H4('h', 4, false),
	A5('a', 5, false),
	B5('b', 5, false),
	C5('c', 5, false),
	D5('d', 5, false),
	E5('e', 5, false),
	F5('f', 5, false),
	G5('g', 5, false),
	H5('h', 5, false),
	A6('a', 6, false),
	B6('b', 6, false),
	C6('c', 6, false),
	D6('d', 6, false),
	E6('e', 6, false),
	F6('f', 6, false),
	G6('g', 6, false),
	H6('h', 6, false),
	A7('a', 7, false),
	B7('b', 7, false),
	C7('c', 7, false),
	D7('d', 7, false),
	E7('e', 7, false),
	F7('f', 7, false),
	G7('g', 7, false),
	H7('h', 7, false),
	A8('a', 8, false),
	B8('b', 8, false),
	C8('c', 8, false),
	D8('d', 8, false),
	E8('e', 8, false),
	F8('f', 8, false),
	G8('g', 8, false),
	H8('h', 8, false),
	NONE('X', -1, false);

	private static final Logger log = Logger.getLogger(Position.class);

	private char file;
	private int rank;
	private boolean startPose;

	/**
	 * Create a new Position
	 *
	 * @param file
	 * @param rank
	 * @param startPose
	 */
	private Position(char file, int rank, boolean startPose) {
		this.file      = file;
		this.rank      = rank;
		this.startPose = startPose;

		return;
	}

	/**
	 * Return the file of this Position.
	 */
	public char getFile() {
		return this.file;
	}

	/**
	 * Return the rank of this Position
	 */
	public int getRank() {
		return this.rank;
	}

	/**
	 * Return true if this Position is a starting Position.
	 */
	public boolean isStartPosition() {
		return this.startPose;
	}

	/**
	 *
	 * @param startPose
	 */
	public void setStartPosition(boolean startPose) {
		this.startPose = startPose;

		return;
	}


  /**
   * Get a List of Positions radiating from this one in a certain direction
   * @param direction 
   */
  public List<Position> getRay(Direction direction)
  {
    List<Position> list = new ArrayList<Position>();
    Position cur = this;

    while((cur = cur.nextPosition(direction)) != null)
      list.add(cur);

    return list;
  }

  /**
   * Get the next position along a given direction, or null if does not exist
   */
  public Position nextPosition(Direction direction)
  {
    char next = '\0';
    char prev = '\0';

    int diffRank = 0;
    int diffFile = 0;

    switch(this.file)
    {
      case 'a':
        next = 'b';
        prev = '\0';
        break;
      case 'b':
        next = 'c';
        prev = 'a';
        break;
      case 'c':
        next = 'd';
        prev = 'b';
        break;
      case 'd':
        next = 'e';
        prev = 'c';
        break;
      case 'e':
        next = 'f';
        prev = 'd';
        break;
      case 'f':
        next = 'g';
        prev = 'e';
        break;
      case 'g':
        next = 'h';
        prev = 'f';
        break;
      case 'h':
        next = '\0';
        prev = 'g';
        break;
    }

    switch(direction)
    {
      case N:
        diffRank = +1;
        diffFile = 0;
        break;
      case NE:
        diffRank = +1;
        diffFile = +1;
        break;
      case E:
        diffRank = 0;
        diffFile = +1;
        break;
      case SE:
        diffRank = -1;
        diffFile = +1;
        break;
      case S:
        diffRank = -1;
        diffFile = 0;
        break;
      case SW:
        diffRank = -1;
        diffFile = -1;
        break;
      case W:
        diffRank = 0;
        diffFile = -1;
        break;
      case NW:
        diffRank = +1;
        diffFile = -1;
        break;
    }

    int newRank = this.rank + diffRank;

    char newFile;
    if(diffFile == +1)
      newFile = next;
    else if(diffFile == -1)
      newFile = prev;
    else
      newFile = this.file;
    
    if(newRank != 0 && newRank != 9 && newFile != '\0')
      return getPositionWithRankAndFile(newFile, newRank);
    else
      return null;

  }

  public static Position getPositionWithRankAndFile(char file, int rank)
  {
    for(Position p : EnumSet.range(Position.A1, Position.H8))
      if(p.rank == rank && p.file == file)
        return p;

    return null;
  }

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		return String.format("%c%d", this.file, this.rank);
	}
}
