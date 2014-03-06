package prototype.datamodel;

public class Player {

	private String name;
	private PlayerColor color;

	public Player(String name, PlayerColor color) {
		this.name  = name;
		this.color = color;

		return;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;

		return;
	}

	public PlayerColor getColor() {
		return this.color;
	}

	public void setColor(PlayerColor color) {
		this.color = color;

		return;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("[");
		sb.append(this.color).append(" \"");
		sb.append(this.name).append("\"]");

		return sb.toString();
	}

}
