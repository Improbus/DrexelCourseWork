/**
 * 
 */
package dragonchess.pgn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import dragonchess.game.GamePieceType;
import dragonchess.game.Player;
import dragonchess.game.Position;
import dragonchess.pgn.generic.Move;

/**
 * @author Damola Mabogunje
 *
 */
public class PgnMove implements Move 
{
	private String move;
	private List<Flag> flags;
	private Map<Flag, Object> attr;
	private Player player;
	private GamePieceType piece;
	private Position pos;

	public PgnMove(Player player, String hit)
	{
		this.move = hit;
		this.player = player;
		this.attr = new HashMap<Flag, Object>();
		this.flags = new ArrayList<Flag>();
		
		initialize();
	}

	/* (non-Javadoc)
	 * @see dragonchess.pgn.iPGNMove#getPiece()
	 */
	public GamePieceType getPiece() 
	{
		return piece;
	}

	/* (non-Javadoc)
	 * @see dragonchess.pgn.iPGNMove#getPlayer()
	 */
	public Player getPlayer() 
	{
		return player;
	}

	/* (non-Javadoc)
	 * @see dragonchess.pgn.iPGNMove#getStartPosition()
	 */
	public Position getPosition() 
	{
		return pos;
	}
	
	public List<Flag> getFlags() 
	{
		return flags;
	}
	
	public Object getAttribute(Flag flag)
	{
		return attr.get( flag );
	}
	
	public void addFlag(Flag flag) 
	{
		this.flags.add(flag);	
	}

	public void delFlag(Flag flag) 
	{
		this.flags.remove(flag);	
	}
	
	public boolean hasFlags() 
	{
		return !flags.isEmpty();
	}
	
	public boolean hasFlag(Flag flag) 
	{
		return flags.contains(flag);
	}

	public void initialize()
	{
		Pattern regex;
		Matcher m;
		char pid;
		
		// Set Flags & Attributes
		if( move.contains( Flag.CAPTURE.toString() ))   { addFlag(Flag.CAPTURE); }
		if( move.contains( Flag.CHECK.toString() ))     { addFlag(Flag.CHECK); }
		if( move.contains( Flag.CHECKMATE.toString() )) { addFlag(Flag.CHECKMATE); }
		if( move.contains( Flag.KCASTLE.toString() ))   { addFlag(Flag.KCASTLE); }
		if( move.contains( Flag.QCASTLE.toString() ))   { addFlag(Flag.QCASTLE); }
		if( move.contains( Flag.PROMOTE.toString() ) )
		{
			int i = move.indexOf(Flag.PROMOTE.toString());
			String s = move.substring(i);
			move = move.replace(s, "");
			
			addFlag(Flag.PROMOTE);
			this.attr.put(Flag.PROMOTE, s);
		}
		
		Iterator<Flag> i = flags.iterator();
		
		while( i.hasNext() )
			move = move.replace(i.next().toString(), "");
		
		if(move.length() < 2)
		{
			pos = Position.NONE;
		}
		else
		{
			switch( move.length() )
			{	
				
				case 4:
					flags.add(Flag.AMBIGUOUS);
					attr.put(Flag.AMBIGUOUS, move.substring(1, 2));
				case 3:
					String temp;
					regex = Pattern.compile("[nbrqkNBRQK]");
					m = regex.matcher( move.substring(0, 1) );
					
					if(m.find())
					{
						switch(player.getGamePieceColor())
						{
							case Black:
								temp = move.toLowerCase();
								break;
							default:
								temp = move.toUpperCase();
								break;
						}
						pid = temp.charAt(0);
						break;
					}
					else
					{
						flags.add(Flag.AMBIGUOUS);
						attr.put(Flag.AMBIGUOUS, move.substring(0, 1));
						move = move.replaceFirst(attr.get(Flag.AMBIGUOUS).toString(), "");
					}
					
				default:
					switch(player.getGamePieceColor())
					{
						case Black:
							pid = 'p';
							break;
						default:
							pid = 'P';
							break;
					}
					break;
			}
			
			regex = Pattern.compile("[0-9]");
			m = regex.matcher(move);
			m.find();
			
			pos = Position.getPositionWithRankAndFile(move.charAt(move.length()-2), Integer.parseInt( move.substring( m.start() ) ));
			piece = toPiece(pid);
		}
	}
	
	private GamePieceType toPiece(char san)
	{
		String s = "" + san;
		s = s.toUpperCase();
		char c = s.charAt(0);
		
		switch(c)
		{
			case 'B': return GamePieceType.Bishop;
			case 'K': return GamePieceType.King;
			case 'N': return GamePieceType.Knight;
			case 'Q': return GamePieceType.Queen;
			case 'R': return GamePieceType.Rook;
			default : return GamePieceType.Pawn;
		}
	}
	
	private char toSAN(GamePieceType gp)
	{
		char san;
		
		switch( gp )
		{
			case Bishop: san = 'b'; break;
			case King:   san = 'k'; break;
			case Knight: san = 'n'; break;
			case Queen:  san = 'q'; break;
			case Rook:	 san = 'r'; break;
			default:	 san = 'p'; break;
		}
		
		switch( player.getGamePieceColor() )
		{
			case Black: san = Character.toLowerCase(san); break;
			default:	san = Character.toUpperCase(san); break;
		}
		
		return san;
	}
	
	@Override
	public String toString()
	{
		StringBuffer s = new StringBuffer(); 
		Flag flag;
		Iterator<Flag> flagList = flags.iterator();
		
		while( flagList.hasNext() )
		{
			flag = flagList.next();
			
			switch(flag)
			{
				case AMBIGUOUS: s.append( attr.get(flag) ); break;
				case CAPTURE: 
				case KCASTLE: 
				case QCASTLE: s.append(flag);
			}
		}
		
		s.reverse();
		if(pos != Position.NONE) { s.append( pos.toString() ); }
		flagList = flags.iterator(); // reset iterator
		
		while( flagList.hasNext() )
		{
			flag = flagList.next();
			
			switch(flag)
			{
				case PROMOTE:
				case CHECK:
				case CHECKMATE: s.append(flag); 
			}
		}
		
		if(piece != null)			
			return toSAN(piece) + s.toString();
		else
			return s.toString();
	}
}
