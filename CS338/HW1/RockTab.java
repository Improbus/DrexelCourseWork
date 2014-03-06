    /*
     * Daniel A DeCamillo
     * dad56@drexel.edu
     * CS338:GUI, Assignment [1]
     */

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class RockTab {
	
	JPanel panel = new JPanel(new BorderLayout());
    JTextField artist = new JTextField();
    JTextField song = new JTextField();
    JTextField album = new JTextField();
    JTextField Track = new JTextField();
    JTextField Length = new JTextField();
    JLabel sartist = new JLabel("Artist");
    JLabel ssong = new JLabel("Song Title");
    JLabel salbum = new JLabel("Album Title");
    JLabel strack = new JLabel("Track Number");
    JLabel sLength = new JLabel("Length");
	
	public RockTab() {}
	
	//Creates Rock Tab
	public Component makeTab(){
		panel.setLayout(new GridLayout(0,1));
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(sartist);
        panel.add(artist);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(ssong);
        panel.add(song);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(salbum);
        panel.add(album);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(strack);
        panel.add(Track);
        panel.add (Box.createRigidArea (new Dimension (200,15)));
        panel.add(sLength);
        panel.add(Length);
        return panel;
	}

	public JTextField getAlbum() {
		return album;
	}

	public void setAlbum(JTextField album) {
		this.album = album;
	}

	public JTextField getArtist() {
		return artist;
	}

	public void setArtist(JTextField artist) {
		this.artist = artist;
	}

	public JTextField getLength() {
		return Length;
	}

	public void setLength(JTextField length) {
		Length = length;
	}

	public JPanel getPanel() {
		return panel;
	}

	public void setPanel(JPanel panel) {
		this.panel = panel;
	}

	public JLabel getSalbum() {
		return salbum;
	}

	public void setSalbum(JLabel salbum) {
		this.salbum = salbum;
	}

	public JLabel getSartist() {
		return sartist;
	}

	public void setSartist(JLabel sartist) {
		this.sartist = sartist;
	}

	public JLabel getSLength() {
		return sLength;
	}

	public void setSLength(JLabel length) {
		sLength = length;
	}

	public JTextField getSong() {
		return song;
	}

	public void setSong(JTextField song) {
		this.song = song;
	}

	public JLabel getSsong() {
		return ssong;
	}

	public void setSsong(JLabel ssong) {
		this.ssong = ssong;
	}

	public JLabel getStrack() {
		return strack;
	}

	public void setStrack(JLabel strack) {
		this.strack = strack;
	}

	public JTextField getTrack() {
		return Track;
	}

	public void setTrack(JTextField track) {
		Track = track;
	}
}
