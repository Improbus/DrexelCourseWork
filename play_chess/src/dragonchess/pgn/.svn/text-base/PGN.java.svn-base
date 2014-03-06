package dragonchess.pgn;

import java.io.FileOutputStream;

import dragonchess.pgn.generic.Game;
import dragonchess.pgn.generic.Parser;

/**
 * @author Damola Mabogunje
 *
 */
public class PGN
{
	private Parser parser;
	
	public PGN()
	{
		parser = new PgnParser();
	}
	
	public Game load(String filename)
	{
		return parser.parse(filename);
	}
	
	public void save(Game game, String filename)
	{	
		try
		{	
			FileOutputStream fout = new FileOutputStream(filename) ;
			fout.write( game.toString().getBytes() ) ;
			fout.close();
		}
		catch(Exception ex)
		{
			System.out.print("Error: " + ex.getMessage()) ; 
		}
	}
}
