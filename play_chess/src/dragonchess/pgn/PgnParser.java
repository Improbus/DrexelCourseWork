/**
 * 
 */
package dragonchess.pgn;

import java.util.List;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.supareno.pgnparser.PGNGame;
import com.supareno.pgnparser.PGNParser;

import dragonchess.game.ChessBoard;
import dragonchess.pgn.generic.Game;
import dragonchess.pgn.generic.Parser;

/**
 * @author Damola Mabogunje
 *
 */
public class PgnParser implements Parser 
{
	private PGNParser parser;
	final Logger LOGGER = Logger.getLogger(PGN.class);
	
	public PgnParser()
	{
		PropertyConfigurator.configure("./config/log4j.properties");
		parser = new PGNParser(Level.DEBUG);
	}
	
	/* (non-Javadoc)
	 * @see dragonchess.pgn.iPGNParser#parse(java.lang.String)
	 */
	public Game parse(String filename) 
	{
		List<PGNGame> games = parser.parseFile("./data/tests/test.pgn");
		Game game = new PgnGame( games.get(0) );
		
		return game;
	}

	public Game convert(ChessBoard board) 
	{
		// TODO Auto-generated method stub
		return null;
	}
}
