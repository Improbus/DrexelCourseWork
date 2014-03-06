/**
 * 
 */
package dragonchess.pgn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.supareno.pgnparser.PGNGame;
import com.supareno.pgnparser.PGNHit;

import dragonchess.game.GamePieceColor;
import dragonchess.game.Player;
import dragonchess.game.Result;
import dragonchess.pgn.generic.Game;
import dragonchess.pgn.generic.Move;

/**
 * @author Damola Mabogunje
 *
 */
public class PgnGame implements Game 
{
	private PGNGame game;
	private List<Move> moves;
	private Player[] players;
	private Map<String, String> details;
	private Result result;
	
	private static final String DATE = "Date";
	private static final String EVENT = "Event";
	private static final String SITE = "Site";
	private static final String ROUND = "Round";
	private static final String RESULT = "Result";
	
	public PgnGame(PGNGame game)
	{
		this.game = game;
		this.moves = new ArrayList<Move>();
		this.players = new Player[2];
		this.details = game.getAttributesNValues();
		
		for(Result r : Result.values())
		{
			if( details.get(RESULT).contentEquals(r.toString()) )
				result = r;
		}
		
		initialize();
	}

	/* (non-Javadoc)
	 * @see dragonchess.pgn.iPGNGame#getMove(int)
	 */
	public Move getMove(int index) 
	{
		return moves.get(index);
	}

	/* (non-Javadoc)
	 * @see dragonchess.pgn.iPGNGame#getMoves()
	 */
	public List<Move> getMoves() 
	{
		return moves;
	}

	
	public List<Move> getMoves(Player player) 
	{
		List<Move> pm = new ArrayList<Move>();
		Iterator<Move> i = moves.iterator();
		Move m;
		
		while( i.hasNext() )
		{
			m = i.next(); 
			
			if(m.getPlayer() == player)
				pm.add(m);
		}
		
		return pm;
	}

	/* (non-Javadoc)
	 * @see dragonchess.pgn.iPGNGame#getPlayer(dragonchess.game.GamePieceColor)
	 */
	public Player getPlayer(GamePieceColor color) 
	{
		switch(color)
		{
			case Black:
				return players[1];
			default:
				return players[0];
		}
	}
	
	public String getDate() 
	{
		return details.get(DATE);
	}

	public String getEvent() 
	{
		return details.get(EVENT);
	}

	public String getRound() 
	{
		return details.get(ROUND);
	}

	public String getSite() 
	{
		return details.get(SITE);
	}
	
	public Result getResult() 
	{
		return result;
	}
	
	public void initialize()
	{
		Iterator<PGNHit> hits = game.getHitsList().iterator();
		PGNHit hit;
		Move white, black;
		
		players[0] = new Player( details.get( GamePieceColor.White.toString() ), GamePieceColor.White );
		players[1] = new Player( details.get( GamePieceColor.Black.toString() ), GamePieceColor.Black );
		
		while( hits.hasNext() )
		{
			hit = hits.next();
			white = new PgnMove( players[0], hit.getHitSeparated()[0] );
			black = new PgnMove( players[1], hit.getHitSeparated()[1] );
			
			moves.add(white);
			moves.add(black);
		}
	}
	
	public List<Move> getTurn(int index) 
	{
		List<Move> turn = new ArrayList<Move>();
		
		if(index < 1) { index += 1; }
		
		int lastMove = index*2;
		
		turn.add( moves.get(lastMove-1) );
		turn.add( moves.get(lastMove) );
		
		return turn;
	}
	
	/*
	public String toString()
	{
		return null;
	}
	*/
}
