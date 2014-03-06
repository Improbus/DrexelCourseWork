package dragonchess.gui;

import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

import dragonchess.game.GamePieceColor;

public class TimerPanel extends JPanel {

	private static final long serialVersionUID = 3391047541099768087L;
	private DragonChessMW parent;
	private JLabel white_name, black_name, white_time, black_time;

	public TimerPanel(DragonChessMW parent) {
		super();
		this.parent = parent;
		white_name = new JLabel();
		black_name = new JLabel();
		white_time = new JLabel("0");
		black_time = new JLabel("0");
		this.createTimerPanel();
		this.setWhiteName();
		this.setBlackName();
		this.parent.getMainApp().getTimer().setTimerPanel(this);
	}

	private void createTimerPanel() {
		super.setBorder(BorderFactory.createTitledBorder("Game Clock"));
		super.setLayout(new GridLayout(3, 2));
		super.add(new JLabel("White"));
		super.add(new JLabel("Black"));
		super.add(white_name);
		super.add(black_name);
		super.add(white_time);
		super.add(black_time);
	}

	public void setWhiteName() {
		this.white_name.setText(parent.getMainApp().getPlayer(
			GamePieceColor.White).getName().toString());
		super.repaint();
	}

	public void setBlackName() {
		this.black_name.setText(parent.getMainApp().getPlayer(
			GamePieceColor.Black).getName().toString());
		super.repaint();
	}

	public void setWhiteTime(int t) {
		white_time.setText(formatTime(t));
		super.repaint();
	}

	public void setBlackTime(int t) {
		black_time.setText(formatTime(t));
		super.repaint();
	}

	private String formatTime(int i) {
		String min, sec;
		
		int seconds = i % 60;
		int minutes = (i - seconds) / 60;
		if(minutes < 10)
			min = "0" + String.valueOf(minutes);
		else
			min = String.valueOf(minutes);
		if(seconds < 10)
			sec = "0" + String.valueOf(seconds);
		else
			sec = String.valueOf(seconds);
		return min + ":" + sec;
	}

}
