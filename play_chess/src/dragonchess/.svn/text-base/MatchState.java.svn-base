package dragonchess;

import dragonchess.game.GamePieceColor;

public enum MatchState {

	Local("This is a local game."),
	Idle("Waiting for both Players to connect."),
	WhiteConnected("The SocketServer started."),
	BlackConnected("The Socket client connected."),
	WhiteTurn("White's turn to move."),
	BlackTurn("Black's turn to move."),
	Fin("This chess match has ended.");

	private String descr;

	/**
	 * Create a new NetworkConnectionState
	 *
	 * @param descr
	 */
	private MatchState(String descr) {
		this.descr = descr;

		return;
	}

	/**
	 * Return the description of this enum.
	 */
	public String getDescription() {
		return this.descr;
	}

	/**
	 * Return true if this is my turn.
	 */
	public boolean myTurn(GamePieceColor color) {
		boolean turn = false;

		switch (color) {
			case Black:
				turn = this != WhiteTurn;
				break;
			case White:
				turn = this != BlackTurn;
				break;
		}

		return turn;
	}

	/**
	 * Return the opposite MatchState, if there is one;
	 * else return the same MatchState.
	 */
	public MatchState opposite() {
		MatchState opposite = this;

		switch (this) {
			case Local:
				opposite = Idle;
				break;
			case Idle:
				opposite = Local;
				break;
			case WhiteConnected:
				opposite = BlackConnected;
				break;
			case BlackConnected:
				opposite = WhiteConnected;
				break;
			case WhiteTurn:
				opposite = BlackTurn;
				break;
			case BlackTurn:
				opposite = WhiteTurn;
				break;
			case Fin:
				opposite = Local;
				break;
		}

		return opposite;
	}

}
