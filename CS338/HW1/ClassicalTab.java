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


public class ClassicalTab {

	JPanel panel = new JPanel(new BorderLayout());
    JTextField artist = new JTextField();
    JTextField song = new JTextField();
    JTextField album = new JTextField();
    JTextField Track = new JTextField();
    JTextField Length = new JTextField();
    JTextField record = new JTextField();
    JTextField Composer = new JTextField();
    JTextField compyear = new JTextField();
    JLabel sartist = new JLabel("Artist");
    JLabel ssong = new JLabel("Song Title");
    JLabel salbum = new JLabel("Album Title");
    JLabel strack = new JLabel("Track Number");
    JLabel sLength = new JLabel("Length");
    JLabel srecord = new JLabel("Recording Year");
    JLabel sComp = new JLabel("Composer");
    JLabel sCompyear = new JLabel("Composition Year");
		
	public ClassicalTab() {}
	
	//Creates Classical Tab
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
	        panel.add (Box.createRigidArea (new Dimension (200,15)));
	        panel.add(srecord);
	        panel.add(record);
	        panel.add (Box.createRigidArea (new Dimension (200,15)));
	        panel.add(sComp);
	        panel.add(Composer);
	        panel.add (Box.createRigidArea (new Dimension (200,15)));
	        panel.add(sCompyear);
	        panel.add(compyear);
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

	public JTextField getComposer() {
		return Composer;
	}

	public void setComposer(JTextField composer) {
		Composer = composer;
	}

	public JTextField getCompyear() {
		return compyear;
	}

	public void setCompyear(JTextField compyear) {
		this.compyear = compyear;
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

	public JTextField getRecord() {
		return record;
	}

	public void setRecord(JTextField record) {
		this.record = record;
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

	public JLabel getSComp() {
		return sComp;
	}

	public void setSComp(JLabel comp) {
		sComp = comp;
	}

	public JLabel getSCompyear() {
		return sCompyear;
	}

	public void setSCompyear(JLabel compyear) {
		sCompyear = compyear;
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

	public JLabel getSrecord() {
		return srecord;
	}

	public void setSrecord(JLabel srecord) {
		this.srecord = srecord;
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
