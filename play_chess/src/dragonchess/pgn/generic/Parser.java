/**
 * 
 */
package dragonchess.pgn.generic;

/**
 * @author Damola Mabogunje
 * This interface describes the behaviors for any parser used by the game
 * 
 * 
 */
public interface Parser 
{
	/**
	 * Converts the data in a file into a Game
	 * 
	 * @see Game
	 * @param filename The name of the file to be parsed
	 * @return a Game object
	 */
	public Game parse(String filename);
}
