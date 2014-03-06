/**
 * 
 */
package dragonchess.pgn.generic;

import java.util.List;

import dragonchess.game.GamePieceColor;
import dragonchess.game.Player;
import dragonchess.game.Result;

/**
 * @author Damola Mabogunje
 *
 * This interface describes the behaviors of a Chess Game as read in from a file
 */
public interface Game 
{
	/**
	 * Returns the event in which this game was played
	 * 
	 * @return String
	 */
	public String getEvent();
	
	/**
	 * Returns the location at which this game was played
	 * 
	 * @return String
	 */
	public String getSite();
	
	/**
	 * Returns the date this game was played
	 * 
	 * @return String
	 */
	public String getDate();
	
	/**
	 * Returns the round of play for this game
	 * 
	 * @return String
	 */
	public String getRound();
	
	/**
	 * Returns the player using GamePieceColor color in this game
	 *
	 * @see GamePieceColor
	 * @return Player
	 */
	
	/**
	 * Returns the result of this game
	 *
	 * @see Result
	 * @return Result
	 */
	public Result getResult();
	
	/**
	 * Returns the player using GamePieceColor color in this game
	 *
	 * @see GamePieceColor
	 * @return Player
	 */
	public Player getPlayer(GamePieceColor color);
	
	/**
	 * Returns a List containing the pair of moves made on turn index
	 * i.e The List will always contain 2 moves, one made by white followed by black
	 * 
	 * @param index The number of the turn
	 * @return List<Move>
	 */
	public List<Move> getTurn(int index);
	
	/**
	 * Returns a list of all moves made in this game
	 * 
	 * @return List<Move>
	 */
	public List<Move> getMoves();
	
	/**
	 * Returns a list of all moves made by player in this game
	 * 
	 * @param player The Player whose moves are to be returned
	 * @return List<Move>
	 */
	public List<Move> getMoves(Player player);
	
	/**
	 * Returns the index move i.e 1st move if index = 1;
	 * 
	 * @param index The number of the move to return
	 * @return The index move
	 */
	public Move getMove(int index);
	
	public String toString();
}
