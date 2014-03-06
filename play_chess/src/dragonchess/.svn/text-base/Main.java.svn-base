package dragonchess;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import dragonchess.game.ChessBoard;
import dragonchess.game.Command;
import dragonchess.game.Data;
import dragonchess.game.GamePiece;
import dragonchess.game.GamePieceColor;
import dragonchess.game.GamePieceSAN;
import dragonchess.game.GamePieceType;
import dragonchess.game.King;
import dragonchess.game.Pawn;
import dragonchess.game.Player;
import dragonchess.game.Position;
import dragonchess.game.Result;
import dragonchess.game.Square;
import dragonchess.game.commands.CastleCommand;
import dragonchess.game.commands.DrawCommand;
import dragonchess.game.commands.HitCommand;
import dragonchess.game.commands.MoveCommand;
import dragonchess.game.commands.PromoteCommand;
import dragonchess.game.commands.ResignCommand;
import dragonchess.game.commands.SetMaxTimeCommand;
import dragonchess.game.commands.SetResultCommand;
import dragonchess.game.commands.SetTurnCommand;
import dragonchess.game.commands.UndoCommand;
import dragonchess.game.listeners.DrawListener;
import dragonchess.gui.DragonChessMW;
import dragonchess.gui.Timer;
import dragonchess.network.CommandRecipient;
import dragonchess.network.DataRecipient;
import dragonchess.network.NetworkConnection;
import dragonchess.pgn.Flag;
import dragonchess.pgn.Hit;
import dragonchess.pgn.PGN;
import dragonchess.pgn.generic.Game;
import dragonchess.pgn.generic.Move;

/**
 * The entry point to Dragonchess.
 *
 * @author Group 4
 */
public class Main implements DataRecipient, CommandRecipient {

	private static final Logger log = Logger.getLogger(Main.class);

	private Player white;
	private Player black;
	private ChessBoard board;
	private MatchState turn;
	private int round;
	private int maxTime;
	private Result result;
	private Date now;
	private SimpleDateFormat sdf;
	private SimpleDateFormat stf;
	private NetworkConnection connection;
	private DragonChessMW mainWindow;
	private java.util.Timer timer;
	private Timer gameTimer;
	private PGN pgn;
	private List<Hit> hits;

	/**
	 * Create a new "Local" DragonChess entry point.
	 */
	public Main() {
		this(MatchState.Local);

		return;
	}

	/**
	 * Create a new DragonChess entry point.
	 *
	 * @param turn
	 */
	public Main(MatchState turn) {
		this.turn       = turn;
		this.white      = new Player("Default, White", GamePieceColor.White);
		this.black      = new Player("Default, Black", GamePieceColor.Black);
		this.round      = -1;
		this.maxTime    = Utils.DEFAULT_TIME;
		this.result     = Result.Other;
		this.now        = new Date();
		this.sdf        = new SimpleDateFormat("yyyy.MM.dd");
		this.stf        = new SimpleDateFormat("HH:MM:SS");
		this.timer      = new java.util.Timer();
		this.gameTimer  = new Timer(this.maxTime,this);
		this.timer.schedule(gameTimer, 0L, 1000L);
		this.pgn        = new PGN();
		this.hits       = new ArrayList<Hit>();

		this.board      = new ChessBoard();
		if (!isLocal()) {
			this.board.setGamePieces(Utils.DEFAULT_PIECES);
		}
		this.mainWindow = new DragonChessMW(this);

		return;
	}

	/**
	 * Return true if DragonChess is in "local" mode.
	 */
	public boolean isLocal() {
		return this.turn == MatchState.Local;
	}

	/**
	 * Return the specified Square.
	 *
	 * @param pose
	 */
	public Square getSquare(Position pose) {
		return this.board.getSquare(pose);
	}

	/**
	 * Return the specified Player.
	 *
	 * @param color
	 * @return player
	 */
	public Player getPlayer(GamePieceColor color) {
		Player player = null;

		switch (color) {
			case Black:
				player = this.black;
				break;
			case White:
				player = this.white;
				break;
			default:
				log.error(String.format("%1$s is not a valid GamePieceColor.\n",
					color));
				break;
		}

		return player;
	}

	/**
	 * Set the specified Player.
	 *
	 * @param player
	 */
	public void setPlayer(Player player) {
		GamePieceColor color = player.getGamePieceColor();

		switch (color) {
			case Black:
				this.black = player;
				if (this.mainWindow != null) {
					this.mainWindow.setBlackName();
				}
				break;
			case White:
				this.white = player;
				if (this.mainWindow != null) {
					this.mainWindow.setWhiteName();
				}
				break;
			default:
				log.error(String.format("%1$s is not a valid GamePieceColor.\n",
					color));
				break;
		}

		return;
	}

	/**
	 * Return whose move it is.
	 *
	 * @return turn
	 */
	public MatchState getTurn() {
		return this.turn;
	}

	/**
	 * Set whose move it is.
	 *
	 * @param turn
	 */
	public void setTurn(MatchState turn) {
		this.turn = turn;

		return;
	}
	
	/**
	 * Return the current Chess board
	 * @return
	 */
	public ChessBoard getBoard(){
		return this.board;
	}

	/**
	 * Return the result of this chess match.
	 *
	 * @return result
	 */
	public Result getResult() {
		return this.result;
	}

	/**
	 * Set the result of this chess match.
	 *
	 * @param result
	 */
	public void setResult(Result result) {
		this.result = result;

		return;
	}

	/**
	 * Return the round of this chess match.
	 *
	 * @return round
	 */
	public int getRound() {
		return this.round;
	}

	/**
	 * Set the round of this chess match.
	 *
	 * <p>
	 * <strong>-1 = unknown</strong>
	 * </p>
	 * @param round
	 */
	public void setRound(int round) {
		this.round = round;

		return;
	}

	/**
	 * Return the maxinum time - in minutes - each Player has to
	 * complete all of his/her moves.
	 *
	 * @return maxTime
	 */
	public int getMaxTime() {
		return this.maxTime;
	}

	/**
	 * Set the maxinum time - in minutes - each Player has to
	 * complete all of his/her moves.
	 *
	 * @param maxTime
	 */
	public void setMaxTime(int maxTime) {
		if (maxTime > 0) {
			this.maxTime = maxTime;
		}

		return;
	}

	/**
	 * Return the NetworkConnection object used by this application.
	 *
	 * @return connection
	 */
	public NetworkConnection getConnection() {
		return this.connection;
	}

	/**
	 * Set the NetworkConnection object used by this application.
	 *
	 * @param connection
	 */
	public void setConnection(NetworkConnection connection) {
		this.connection = connection;

		return;
	}

	/**
	 * Return all the GamePieces of this ChessBoard.
	 */
	public GamePiece[] getGamePiecesArray() {
		return this.board.getGamePiecesArray();
	}

	/**
	 * Return all the GamePieces of this ChessBoard.
	 */
	public Map<GamePieceSAN, GamePiece> getGamePieces() {
		return this.board.getGamePieces();
	}

	/**
	 * Set all the GamePieces of the ChessBoard.
	 *
	 * @param pieces
	 */
	public void setGamePieces(GamePiece[] pieces) {
		this.board.setGamePieces(pieces);
		return;
	}

	/**
	 * Add a DrawListener for the specified Square.
	 *
	 * @param pose
	 * @param listener
	 */
	public void addDrawListener(Position pose, DrawListener listener) {
		this.board.addDrawListener(pose, listener);

		return;
	}

	/**
	 * Remove a DrawListener for the specified Square.
	 *
	 * @param pose
	 */
	public void removeDrawListener(Position pose) {
		this.board.removeDrawListener(pose);

		return;
	}

	/**
	 * Restore a chess match from a file.
	 *
	 * @param file
	 */
	public void restore(File file) 
	{
		//this.board.setGamePieces(Utils.DEFAULT_PIECES);
		Game game = this.pgn.load(file.getPath());
		
		Iterator<Move> moveList = game.getMoves().iterator();
		Iterator<Flag> flagList;
		Move move;
		Flag flag;
		GamePiece gp = null;
		
		while( moveList.hasNext() )
		{
			move = moveList.next();
			/* 
			 * Only Castling moves have no piece or position defined.
			 * Therefore this checks that the move was not a castle
			 */
			if(move.getPiece() != null && move.getPosition() != Position.NONE )
			{	
				/*
				 * Retrieve the piece to be moved by Checking type, validity of move, and making sure this piece has not already been captured
				 */
				for(GamePieceSAN gps : GamePieceSAN.values())
				{
					if( this.getGamePieces().get(gps).getType() == move.getPiece() &&
						this.getGamePieces().get(gps).getPosition() != Position.NONE &&
						this.getGamePieces().get(gps).getMoves(board).contains(this.getSquare(move.getPosition()))
					  )
					{
						gp = this.getGamePieces().get(gps);
						break;
					}
				}
				
				if( move.hasFlags() )
				{	
					flagList = move.getFlags().iterator();
				
					while( flagList.hasNext() )
					{
						flag = flagList.next();
						
						if( move.hasFlag(flag) )
						{
							switch( flag )
							{
								case AMBIGUOUS: // Recalculates the game piece to be moved using the file. 
									char startFile = ((String) move.getAttribute(flag)).charAt(0);
									
									/*
									 * Retrieve the piece to be moved by Checking type, validity of move, and making sure this piece has not already been captured
									 */
									for(GamePieceSAN gps : GamePieceSAN.values())
									{
										if( this.getGamePieces().get(gps).getType() == move.getPiece() &&
											this.getGamePieces().get(gps).getPosition().getFile() == startFile &&
											this.getGamePieces().get(gps).getPosition() != Position.NONE &&
											this.getGamePieces().get(gps).getMoves(board).contains(this.getSquare(move.getPosition()))
										  )
										{
											gp = this.getGamePieces().get(gps);
											break;
										}
									}
									break;
							
								case CAPTURE: break;
								
								case CHECK: break;
							
								case CHECKMATE: break;
						
								case PROMOTE:
									GamePieceType gpt = ( (GamePieceType) move.getAttribute(flag) );
									Pawn p = (Pawn) gp;
							
									p.setPromote();
									this.handleCommand( new PromoteCommand(p, gpt) );
									break;
							}
						}
					}
				}
				this.handleCommand( new MoveCommand( gp, move.getPosition()) );
			}
			else
			{	
				flagList = move.getFlags().iterator();
				
				while( flagList.hasNext() )
				{
					flag = flagList.next();
					
					if( move.hasFlag(flag) )
					{
						switch( flag )
						{
							case KCASTLE:
								switch( move.getPlayer().getGamePieceColor() )
								{
									case Black:
										this.handleCommand( new CastleCommand( 
																				(King) this.getGamePieces().get(GamePieceSAN.k), 
																				GamePieceSAN.kr.getPosition(),
																				new MoveCommand( this.getGamePieces().get(GamePieceSAN.kr), GamePieceSAN.kb.getPosition() )
																			  ) 
														   );
										break;
									default:
										this.handleCommand( new CastleCommand( 
																				(King) this.getGamePieces().get(GamePieceSAN.k), 
																				GamePieceSAN.kr.getPosition(),
																				new MoveCommand( this.getGamePieces().get(GamePieceSAN.KR), GamePieceSAN.KB.getPosition() )
											  								  )
														  );
								}
								break;
				
							case QCASTLE:
								switch( move.getPlayer().getGamePieceColor() )
								{
									case Black:
										this.handleCommand( new CastleCommand( 
																				(King) this.getGamePieces().get(GamePieceSAN.k), 
																				GamePieceSAN.qr.getPosition(),
																				new MoveCommand( this.getGamePieces().get(GamePieceSAN.qr), GamePieceSAN.qb.getPosition() )
																			  ) 
														   );
										break;
									default:
										this.handleCommand( new CastleCommand( 
																				(King) this.getGamePieces().get(GamePieceSAN.K), 
																				GamePieceSAN.QR.getPosition(),
																				new MoveCommand( this.getGamePieces().get(GamePieceSAN.QR), GamePieceSAN.QB.getPosition() )
											  								  )
														  );
								}
								break;
						}
					}
				}
			}
			
			/*
			switch(move.getPlayer().getGamePieceColor())
			{
				case White:
					this.handleCommand(new SetTurnCommand(MatchState.BlackTurn));
				case Black:
					this.handleCommand(new SetTurnCommand(MatchState.WhiteTurn));
			}
			*/
		}
		return;
	}
	
	/**
	 * Save the current chess match to a file.
	 *
	 * @param file
	 */
	public void save(File file) {
		if (file == null) {
			log.error("save():  file is NULL...");
			return;
		}
//		if (!file.isFile()) {
//			log.error("save():  file is NOT a file...");
//			return;
//		}

		PrintStream pOut = null;
		try {
			boolean override = true;
			if (file.exists()) {
				log.error("save():  file already exists...");
			}
			if (override) {
				log.debug(String.format("save():  to %1$s", file.getName()));
				FileOutputStream fOut = new FileOutputStream(file);
				pOut = new PrintStream(fOut);
				// TODO: append hits
				pOut.print(this);
				log.debug("save():  hit = " + this.hits.size());
				for (int i = 0; i < this.hits.size(); i++) {
					pOut.print(this.hits.get(i).toString());
					if (i % 5 == 0) { pOut.print("\n"); }
				}
				pOut.flush();
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (pOut != null) { pOut.close(); }
		}

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[Event \"DragonChess Match\"]\n");
		if (this.connection != null) {
			sb.append(this.connection).append("\n");
		}
		sb.append(String.format("[Date \"%1$s\"]\n", this.sdf.format(this.now)));
		sb.append(String.format("[Round \"%1$s\"]\n",
			(this.round == -1 ? "?" : Integer.toString(this.round))));
		sb.append(this.white).append("\n");
		sb.append(this.black).append("\n");
		sb.append(String.format("[Result \"%1$s\"]\n", this.result));
		sb.append(String.format("[Time \"%1$s\"]\n\n", this.stf.format(this.now)));
//		sb.append(this.board);

		return sb.toString();
	}

	//
	// implement DataRecipient
	//

	/**
	 * {@inheritDoc}
	 */
	public void handleData(Data data) {
		if (data instanceof Player) {
			Player player = (Player)data;
			log.debug(String.format("handleData():  %1$s", player));
			this.setPlayer(player);
		} else {
			log.error(String.format("Don't know how to handle:  %1$s", data));
		}

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void promptUser(String message) {
		this.mainWindow.promptUser(message);

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public boolean sendOK() {
		Player local = (this.black.isLocal() ? this.black : this.white);

		return this.turn.myTurn(local.getGamePieceColor());

	}

	//
	// implement CommandRecipient
	//

	/**
	 * {@inheritDoc}
	 */
	public void handleCommand(Command command) {
		log.debug(String.format("handleCommand():  command = %1$s", command));
		if (command instanceof MoveCommand) {
			MoveCommand cmd = (MoveCommand)command;
			log.debug(String.format("MoveCommand:  %1$s", cmd));
			this.board.move(cmd);
			if (this.turn != MatchState.Local &&
				this.turn == MatchState.BlackTurn) {
				this.connection.send(new HitCommand(this.board.getHit()));
			}
		} else if (command instanceof HitCommand) {
			HitCommand cmd = (HitCommand)command;
			Hit hit = cmd.getHit();
			this.hits.add(hit);
			this.mainWindow.addHit(hit);
		} else if (command instanceof SetTurnCommand) {
			SetTurnCommand cmd = (SetTurnCommand)command;
			log.debug(String.format("SetTurnCommand:  %1$s", cmd));
			MatchState turn = cmd.getTurn();
			if (turn == MatchState.BlackConnected) {
				turn =  MatchState.WhiteTurn;
				cmd = new SetTurnCommand(turn);
				if (this.connection != null) {
					this.connection.send(cmd);
				}
			}
			this.setTurn(turn);
			if (this.mainWindow != null) {
				this.mainWindow.setTurn(this.turn);
				this.mainWindow.updateGameMenu();
			}
		} else if (command instanceof UndoCommand) {
			this.board.undo();
		} else if (command instanceof PromoteCommand) {
		} else if (command instanceof DrawCommand) {
			DrawCommand cmd = (DrawCommand)command;
			Player offerPlayer = cmd.getPlayer();
			Player localPlayer = this.mainWindow.getLocalPlayer();
			if (this.mainWindow != null && !localPlayer.equals(offerPlayer)) {
				this.mainWindow.offerDraw();
			}
		} else if (command instanceof ResignCommand) {
			ResignCommand cmd = (ResignCommand)command;
			Player resignPlayer = cmd.getPlayer();
			Player localPlayer = this.mainWindow.getLocalPlayer();
			if (this.mainWindow != null && !localPlayer.equals(resignPlayer)) {
				this.mainWindow.informResigned(resignPlayer.getName());
			}
		} else if (command instanceof SetResultCommand) {
			SetResultCommand cmd = (SetResultCommand)command;
			this.setResult(cmd.getResult());
			log.debug(this);
		} else if (command instanceof SetMaxTimeCommand) {
			SetMaxTimeCommand cmd = (SetMaxTimeCommand)command;
			log.debug(String.format("SetMaxTimeCommand:  %1$s", cmd));
			this.setMaxTime(cmd.getMaxTime());
			if (this.mainWindow != null) {
				this.mainWindow.setMaxTime(this.getMaxTime());
			}
		} else {
			log.error(String.format("Don't know how to handle command:  %1$s.",
				command));
		}

		return;
	}

	public Timer getTimer(){
		return this.gameTimer;
	}

	/**
	 * Test method.
	 */
	protected void elephantGambitOpening() {
		this.setGamePieces(Utils.DEFAULT_PIECES);
		this.setPlayer(new Player("Lange", GamePieceColor.White));
		this.setPlayer(new Player("Anonymous", GamePieceColor.Black));
		// white move (1. e4)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		GamePiece gp = this.board.getGamePiece(Position.E2);
		MoveCommand mc = new MoveCommand(gp, Position.E4);
		log.debug("1. e4");
		this.handleCommand(mc);
		// black move (1... e5)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.E7);
		mc = new MoveCommand(gp, Position.E5);
		log.debug("1... e5");
		this.handleCommand(mc);
		// white move (2. Nf3)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.G1);
		mc = new MoveCommand(gp, Position.F3);
		log.debug("2. Nf3");
		this.handleCommand(mc);
		// black move (2... d5)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.D7);
		mc = new MoveCommand(gp, Position.D5);
		log.debug("2... d5");
		this.handleCommand(mc);
		// white move (3. Nxe5)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.F3);
		mc = new MoveCommand(gp, Position.E5);
		log.debug("3. Nxe5");
		this.handleCommand(mc);
		// black move (3... dxe4)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.D5);
		mc = new MoveCommand(gp, Position.E4);
		log.debug("3... dxe4");
		this.handleCommand(mc);
		// white move (4. Bc4)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.F1);
		mc = new MoveCommand(gp, Position.C4);
		log.debug("4. Bc4");
		this.handleCommand(mc);
		// black move (4... Qg5)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.D8);
		mc = new MoveCommand(gp, Position.G5);
		log.debug("4... Qg5");
		this.handleCommand(mc);
		// white move (5. Nxf7)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.E5);
		mc = new MoveCommand(gp, Position.F7);
		log.debug("5. Nxf7");
		this.handleCommand(mc);
		// black move (5... Qxg2)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.G5);
		mc = new MoveCommand(gp, Position.G2);
		log.debug("5... Qxg2");
		this.handleCommand(mc);
		// white move (6. Qh5)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.D1);
		mc = new MoveCommand(gp, Position.H5);
		log.debug("6. Qh5");
		this.handleCommand(mc);
		// black move (6... Qxh1+)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.G2);
		mc = new MoveCommand(gp, Position.H1);
		log.debug("6... Qxh1+");
		this.handleCommand(mc);
		gp.setCheck(); //<<-- should be moved to the move();
		// white move (7. Ke2)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.E1);
		mc = new MoveCommand(gp, Position.E2);
		log.debug("7. Ke2");
		this.handleCommand(mc);
		// black move (7... Qxc1)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.H1);
		mc = new MoveCommand(gp, Position.C1);
		log.debug("7... Qxc1");
		this.handleCommand(mc);
		// white move (8. Nd6+)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.F7);
		mc = new MoveCommand(gp, Position.D6);
		log.debug("8. Nd6+");
		this.handleCommand(mc);
		gp.setCheck(); //<<-- should be moved to the move();
		// black move (8... Kd7)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.E8);
		mc = new MoveCommand(gp, Position.D7);
		log.debug("8... Kd7");
		this.handleCommand(mc);
		// white move (9. Qf7+)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.H5);
		mc = new MoveCommand(gp, Position.F7);
		log.debug("9. Qf7+");
		this.handleCommand(mc);
		gp.setCheck(); //<<-- should be moved to the move();
		// black move (9... Kxd6)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.D7);
		mc = new MoveCommand(gp, Position.D6);
		log.debug("9... Kxd6");
		this.handleCommand(mc);
		// white move (10. Nc3)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.B1);
		mc = new MoveCommand(gp, Position.C3);
		log.debug("10. Nc3");
		this.handleCommand(mc);
		// black move (10... Qxa1)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.C1);
		mc = new MoveCommand(gp, Position.A1);
		log.debug("10... Qxa1");
		this.handleCommand(mc);
		// white move (11. Nxe4+)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.C3);
		mc = new MoveCommand(gp, Position.E4);
		log.debug("11. Nxe4+");
		this.handleCommand(mc);
		gp.setCheck(); //<<-- should be moved to the move();
		// black move (11... Ke5)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.D6);
		mc = new MoveCommand(gp, Position.E5);
		log.debug("11... Ke5");
		this.handleCommand(mc);
		// white move (12. Qd5+)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.F7);
		mc = new MoveCommand(gp, Position.D5);
		log.debug("12. Qd5+");
		this.handleCommand(mc);
		gp.setCheck(); //<<-- should be moved to the move();
		// black move (12... Kf4)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.E5);
		mc = new MoveCommand(gp, Position.F4);
		log.debug("12... Kf4");
		this.handleCommand(mc);
		// white move (13. Qg5+)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.D5);
		mc = new MoveCommand(gp, Position.G5);
		log.debug("13. Qg5+");
		this.handleCommand(mc);
		gp.setCheck(); //<<-- should be moved to the move();
		// black move (13... Kxe4)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.F4);
		mc = new MoveCommand(gp, Position.E4);
		log.debug("13... Kxe4");
		this.handleCommand(mc);
		// white move (14. d3+)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.D2);
		mc = new MoveCommand(gp, Position.D3);
		log.debug("14. d3+");
		this.handleCommand(mc);
		gp.setCheck(); //<<-- should be moved to the move();
		// black move (14... Kd4)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.E4);
		mc = new MoveCommand(gp, Position.D4);
		log.debug("14... Kd4");
		this.handleCommand(mc);
		// white move (15. Qe3#)
		try { Thread.sleep(1000); }
		catch (InterruptedException ie) { /** do nothing **/ }
		gp = this.board.getGamePiece(Position.G5);
		mc = new MoveCommand(gp, Position.E3);
		log.debug("15. Qe3#");
		this.handleCommand(mc);
		gp.setCheckMate(); //<<-- should be moved to the move();
		// white won
		this.setResult(Result.WhiteWon);

		return;
	}

	public static void main(String[] args) {
		PropertyConfigurator.configure(Utils.LOG4J_CONFIG);

		Main main = null;

		if (args.length > 0 && args[0].equalsIgnoreCase("local")) {
			main = new Main();
		} else {
			main = new Main(MatchState.Idle);
		}

		Main.log.debug("\n" + main);

		// run a test by using the Elephant Gambit (opening)
		if (main.isLocal()) {
			//main.elephantGambitOpening();
			 //print the game
			//Main.log.debug("\n" + main);
		}

		return;
	}

}
