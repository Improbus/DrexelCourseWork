package dragonchess.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.EtchedBorder;

import org.apache.log4j.Logger;

import dragonchess.Main;
import dragonchess.MatchState;
import dragonchess.Utils;
import dragonchess.game.Command;
import dragonchess.game.GamePieceColor;
import dragonchess.game.Player;
import dragonchess.game.Position;
import dragonchess.game.Result;
import dragonchess.game.Square;
import dragonchess.game.commands.DrawCommand;
import dragonchess.game.commands.ResignCommand;
import dragonchess.game.commands.SetResultCommand;
import dragonchess.game.commands.SetTurnCommand;
import dragonchess.game.commands.UndoCommand;
import dragonchess.network.NetworkConnection;
import dragonchess.pgn.Hit;

/**
 * This is the main JFrame for the DragonChess project.
 * 
 * @author Group 4
 */
public class DragonChessMW {

	private static final Logger log = Logger.getLogger(DragonChessMW.class);

	private JFrame mainWindow, loginWindow;
	private AboutDialog aboutDialog;
	private LoginDialog loginDialog;
	private LoginListener loginListener;
	private JPanel mainPanel;
	private DragonChessMSP dcSplitPane;
	private JMenuItem saveItem;
	private JMenuItem loadItem;
	private JMenuItem exitItem;
	private JMenuItem whiteItem;
	private JMenuItem blackItem;
	private JMenuItem aboutItem;
	private JMenuItem undoItem;
	private JMenuItem drawItem;
	private JMenuItem resignItem;
	private Main app;
	private JFileChooser fc;
	private File filename;
	private JFrame frame;
	private Player localplayer;

	/**
	 * Default constructor
	 * 
	 * @param app
	 */
	public DragonChessMW(Main app) {
		this.app = app;

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException cnfe) {
			/** do nothing **/
		} catch (InstantiationException ie) {
			/** do nothing **/
		} catch (IllegalAccessException iae) {
			/** do nothing **/
		} catch (UnsupportedLookAndFeelException ulafe) {
			/** do nothing **/
		}

		this.mainWindow = new JFrame("DragonChess");
		this.loginWindow = new JFrame("DragonChess Login");
		this.mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set application's screen location
		Toolkit tk = Toolkit.getDefaultToolkit();
		Dimension screen = tk.getScreenSize();
		this.mainWindow.setLocation((screen.width / 2)
				- (Utils.DCMSP_MIN_WIDTH / 2), (screen.height / 2)
				- (Utils.DCMSP_MIN_WIDTH / 2));

		fc = new JFileChooser();
		File currDir = new File(".");
		fc.setCurrentDirectory(currDir);
		frame = new JFrame();
		File dir1 = new File(".");
		try {
			log.debug(String.format("Current Dir: %1$s", dir1
					.getCanonicalPath()));
		} catch (Exception e) {
			e.printStackTrace();
		}

		if (this.app.isLocal()) {
			log.debug("Starting in \"local\" mode.");
			this.localplayer = new Player(GamePieceColor.White);
			this.packMainPanel();
			this.setVisible(true);
		} else {
			log.debug("Starting in \"networked\" mode.");
			this.createLoginPanel();
			this.loginDialog.setVisible(true);
		}

		return;
	}

	/**
	 * Return a reference to the Main.
	 */
	public Main getMainApp() {
		return this.app;
	}

	/**
	 * Return the root JFrame of this application.
	 * 
	 * @return mainWindow
	 */
	public JFrame getRootFrame() {
		return this.mainWindow;
	}

	/**
	 * 
	 * @param visible
	 */
	public void setVisible(boolean visible) {
		this.mainWindow.setVisible(visible);

		return;
	}

	/**
	 * Return the ChessBoard.
	 * 
	 * @param pose
	 */
	public Square getSquare(Position pose) {
		return this.app.getSquare(pose);
	}

	/**
	 * Return the specified Player.
	 * 
	 * @param color
	 * @return player
	 */
	public Player getPlayer(GamePieceColor color) {
		return this.app.getPlayer(color);
	}

	/**
	 * Set the specified Player.
	 * 
	 * @param player
	 */
	public void setPlayer(Player player) {
		this.app.setPlayer(player);
		this.localplayer = player;

		return;
	}

	public Player getLocalPlayer() {
		return localplayer;
	}

	/**
	 * Ask the localplayer to accept/decline a draw offer.
	 */
	public void offerDraw() {
		if (JOptionPane.showConfirmDialog(DragonChessMW.this.mainWindow,
				"Accept a Draw", "Accept Draw", JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
			DragonChessMW.this.sendCommand(new SetResultCommand(Result.Draw));
			DragonChessMW.this.sendCommand(new SetTurnCommand(MatchState.Fin));
		}

		return;
	}

	/**
	 * Inform the localPlayer of opponent's resignation.
	 * 
	 * @param name
	 */
	public void informResigned(String name) {
		JOptionPane.showMessageDialog(this.mainWindow, String.format(
				"Congratulations, you won!.  %1$s has resigned.", name),
				"You Won!", JOptionPane.ERROR_MESSAGE);

		return;
	}

	/**
	 * Set the maxinum time - in minutes - each Player has to complete all of
	 * his/her moves.
	 * 
	 * @param maxTime
	 */
	public void setMaxTime(int maxTime) {
		this.dcSplitPane.setMaxTime(maxTime);
		this.app.setMaxTime(maxTime);

		return;
	}

	public void setWhiteName() {
		this.dcSplitPane.setWhiteName();

		return;
	}

	public void setBlackName() {
		this.dcSplitPane.setBlackName();

		return;
	}

	/**
	 * Return whose move it is.
	 * 
	 * @return turn
	 */
	public MatchState getTurn() {
		return this.app.getTurn();
	}

	/**
	 * Set whose move it is.
	 * 
	 * @return turn
	 */
	public void setTurn(MatchState turn) {
		this.app.setTurn(turn);

		return;
	}

	/**
	 * Add a hit to the movesList.
	 *
	 * @param hit
	 */
	public void addHit(Hit hit) {
		this.dcSplitPane.addHit(hit);

		return;
	}

	/**
	 * Remove a hit from the movesList.
	 *
	 * @param hit
	 */
	public void removeHit(Hit hit) {
		this.dcSplitPane.removeHit(hit);

		return;
	}

	/**
	 * Update a hit from the movesList.
	 *
	 * @param hit
	 */
	public void updateHit(Hit hit) {
		this.dcSplitPane.updateHit(hit);

		return;
	}

	/**
	 * Return the NetworkConnection object used by this application.
	 * 
	 * @return connection
	 */
	public NetworkConnection getConnection() {
		return this.app.getConnection();
	}

	/**
	 * Set the NetworkConnection object used by this application.
	 * 
	 * @param connection
	 */
	public void setConnection(NetworkConnection connection) {
		this.app.setConnection(connection);

		return;
	}

	/**
	 * Close and dispose mainWindow.
	 */
	public void dispose() {
		this.close();
		this.mainWindow.dispose();
		System.exit(0);

		return;
	}

	/**
	 * {@inheritDoc}
	 */
	public void promptUser(String message) {
		JOptionPane.showMessageDialog(this.mainWindow, message, "Error",
				JOptionPane.ERROR_MESSAGE);
		return;
	}

	/**
	 * /** Used for closing any network connections, and saving the current
	 * state before exiting the DragonChess application.
	 */
	private void close() {
		NetworkConnection conn = this.app.getConnection();
		if (conn != null) {
			conn.disconnect();
		}

		return;
	}

	/**
	 * Send a command to both the remote and local user.
	 * 
	 * @param command
	 */
	public void sendCommand(Command command) {
		log.debug(String.format("sendCommand():  command = %s\n", command
				.toString()));
		log.debug(String.format("sendCommand():  turn = %s\n", this.app
				.getTurn()));
		NetworkConnection conn = this.app.getConnection();
		if (conn != null) {
			// if (!(command instanceof SetTurnCommand ||
			// this.app.getTurn() == MatchState.Local)) {
			// log.debug("sendCommand():  RETURNING....\n");
			// return;
			// }
			log.debug(String.format("sendCommand(sendsing):  %1$s", command));
			conn.send(command);
			this.app.handleCommand(command); // update local chess board
		} else {
			log.error("sendCommand():  conn = null\n");
			JOptionPane.showMessageDialog(this.mainWindow,
					"Remote Player is not Responding.", "Error",
					JOptionPane.ERROR_MESSAGE);
		}

		return;
	}

	protected void packMainPanel() {
		this.createMenuBar();
		this.createMainPanel();
		this.addWindowClosingListener();
		this.updateGameMenu();

		Container contentPane = this.mainWindow.getContentPane();
		// contentPane.add(new TrialPanel(this), BorderLayout.NORTH);
		contentPane.add(this.mainPanel, BorderLayout.CENTER);

		this.mainWindow.pack();
	}

	/**
	 * Called from w/in the constructor to create the mainPanel of mainWindow.
	 */
	private void createLoginPanel() {
		this.loginDialog = new LoginDialog(this.loginWindow,
				"Connect to DragonChess");
		this.loginListener = new LoginListener(this, this.loginDialog);
		this.loginDialog.setListener(this.loginListener);
		this.loginDialog.pack();

		return;
	}

	/**
	 * Called from w/in packMainPanel() to create the mainPanel.
	 */
	private void createMainPanel() {
		this.aboutDialog = new AboutDialog(this.mainWindow, "About DragonChess");
		this.aboutDialog.setVisible(false);

		this.mainPanel = new JPanel();
		this.mainPanel.setLayout(new BorderLayout());
		this.mainPanel.setBorder(BorderFactory.createEtchedBorder(
				EtchedBorder.RAISED, Color.darkGray, Color.black));

		this.dcSplitPane = new DragonChessMSP(this);

		this.mainPanel.add(this.dcSplitPane, BorderLayout.CENTER);

		return;
	}

	/**
	 *
	 */
	private void createMenuBar() {
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		JMenu gameMenu = new JMenu("Game");
		JMenu aboutMenu = new JMenu("About");

		this.addFileMenuItems(fileMenu);
		this.addGameMenuItems(gameMenu);
		this.addAboutMenuItems(aboutMenu);

		menuBar.add(fileMenu);
		menuBar.add(gameMenu);
		menuBar.add(aboutMenu);

		this.mainWindow.setJMenuBar(menuBar);

		return;
	}

	/**
	 * @param menu
	 */
	private void addFileMenuItems(JMenu menu) {
		this.exitItem = new JMenuItem("Exit", 'X');
		this.saveItem = new JMenuItem("Save", 'S');
		this.loadItem = new JMenuItem("Load", 'L');
		this.whiteItem = new JMenuItem("White", 'W');
		this.blackItem = new JMenuItem("Black", 'B');

		menu.setMnemonic('F');
		menu.addSeparator();
		menu.add(this.exitItem);
		menu.addSeparator();
		menu.add(this.saveItem);
		menu.addSeparator();
		menu.add(this.loadItem);
		menu.addSeparator();
		JMenu submenu = new JMenu("Orientation");
		submenu.setMnemonic('O');
		submenu.add(this.whiteItem);
		submenu.add(this.blackItem);
		menu.add(submenu);

		if (!this.app.isLocal()) {
			submenu.setEnabled(false);
		}

		// prompt user before exiting application
		this.exitItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (JOptionPane.showConfirmDialog(
						DragonChessMW.this.mainWindow, "Are you sure",
						"Exit DragonChess", JOptionPane.YES_NO_OPTION,
						JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {
					DragonChessMW.this.close();
					System.exit(0);
				}
				return;
			}
		});

		this.saveItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (fc.showSaveDialog(frame) == JFileChooser.APPROVE_OPTION)
					filename = fc.getSelectedFile();
				DragonChessMW.this.app.save(filename);
			}
		});

		this.loadItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if (fc.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION)
					filename = fc.getSelectedFile();
				DragonChessMW.this.app.restore(filename);
			}
		});

		this.whiteItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DragonChessMW.this.app.setGamePieces(Utils.DEFAULT_PIECES);
				DragonChessMW.this.mainPanel.repaint();
				return;
			}
		});

		this.blackItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DragonChessMW.this.setPlayer(new Player(GamePieceColor.Black));
				DragonChessMW.this.app.setGamePieces(Utils.DEFAULT_PIECES);
				DragonChessMW.this.mainPanel.repaint();
				return;
			}
		});

		return;
	}

	/**
	 * 
	 * @param menu
	 */
	private void addGameMenuItems(JMenu menu) {
		menu.setMnemonic('G');
		this.undoItem = new JMenuItem("Undo", 'U');
		this.drawItem = new JMenuItem("Draw", 'D');
		this.resignItem = new JMenuItem("Resign", 'R');
		menu.add(undoItem);
		menu.add(drawItem);
		menu.add(resignItem);

		this.undoItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DragonChessMW.this.sendCommand(new UndoCommand());
				DragonChessMW.this.sendCommand(new UndoCommand());
				// DragonChessMW.this.sendCommand(new SetTurnCommand(
				// DragonChessMW.this.getTurn().opposite()));
				undoItem.setEnabled(false);
				return;
			}
		});

		this.drawItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DragonChessMW.this.sendCommand(new DrawCommand(
						DragonChessMW.this.localplayer));
				return;
			}
		});

		this.resignItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DragonChessMW.this.sendCommand(new ResignCommand(
						DragonChessMW.this.localplayer));
				if (DragonChessMW.this.localplayer.getGamePieceColor() == GamePieceColor.Black) {
					DragonChessMW.this.sendCommand(new SetResultCommand(
							Result.WhiteWon));
				} else {
					DragonChessMW.this.sendCommand(new SetResultCommand(
							Result.BlackWon));
				}
				DragonChessMW.this.sendCommand(new SetTurnCommand(
						MatchState.Fin));
				return;
			}
		});

		return;
	}

	/**
	 * @param menu
	 */
	private void addAboutMenuItems(JMenu menu) {
		menu.setMnemonic('A');

		this.aboutItem = new JMenuItem("About", 'B');

		menu.addSeparator();
		menu.add(aboutItem);

		this.aboutItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				DragonChessMW.this.aboutDialog.setVisible(true);
				return;
			}
		});

		return;
	}

	/**
	 *
	 */
	private void addWindowClosingListener() {
		this.mainWindow.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we) {
				DragonChessMW.this.close();
				System.exit(0);
				return;
			}
		});

		return;
	}

	public void updateGameMenu() {
		MatchState turn = this.getMainApp().getTurn();
		// if it is the local player's turn
		if ((turn.equals(MatchState.WhiteTurn) && localplayer
				.getGamePieceColor().equals(GamePieceColor.White))
				|| (turn.equals(MatchState.BlackTurn) && localplayer
						.getGamePieceColor().equals(GamePieceColor.Black))) {
			this.undoItem.setEnabled(true);
			this.drawItem.setEnabled(true);
			this.resignItem.setEnabled(true);
		} else {
			this.undoItem.setEnabled(false);
			this.drawItem.setEnabled(false);
			this.resignItem.setEnabled(false);
		}
	}

}
