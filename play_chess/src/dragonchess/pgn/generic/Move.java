/**
 * 
 */
package dragonchess.pgn.generic;

import java.util.List;

import dragonchess.game.GamePieceType;
import dragonchess.game.Player;
import dragonchess.game.Position;
import dragonchess.pgn.Flag;

/**
 * @author Damola Mabogunje
 * 
 * This interface describes the behaviors of a Chess Move as read in from a file
 */
public interface Move 
{
	/**
	 * Returns the player who made the move
	 * @see Player
	 * @return Player
	 */
	public Player getPlayer();
	
	/**
	 * Returns the end Position of the move
	 * @see Position
	 * @return Position
	 */
	public Position getPosition();
	
	/**
	 * Returns the type of piece moved
	 * 
	 * @see GamePieceType
	 * @return GamePieceType
	 */
	public GamePieceType getPiece();
	
	/**
	 * Returns the attribute of a special move denoted by flag. 
	 * e.g A PROMOTE flag will have an attribute denoting the piece to promote to.
	 * <p>
	 * An attribute can be any type of Object so it is assumed that logic relying on this
	 * method will cast the Object to the expected type
	 *  
	 * @see Enum
	 * @param flag The flag denoting the move
	 * @return The attribute of the flag
	 */
	public Object getAttribute(Flag flag);
	
	/**
	 * Returns true if move has been flagged; false otherwise
	 * 
	 * @return true if move has been flagged; false otherwise
	 */
	public boolean hasFlags();
	
	/**
	 * Returns true if move has the specific Flag flag
	 * 
	 * @param flag The flag to check for
	 * @return true if move has flag; false otherwise
	 */
	public boolean hasFlag(Flag flag);
	
	/**
	 * Returns a list of all flags for this move
	 * 
	 * @return List
	 */
	public List<Flag> getFlags();
	
	/**
	 * Flags a move as type flag
	 * 
	 * @param flag flag to use
	 */
	public void addFlag(Flag flag);
	
	/**
	 * Removes flag from move
	 * 
	 * @param flag to be removed
	 */
	public void delFlag(Flag flag);
	
	public String toString();
}
