    /*
     * Daniel A DeCamillo
     * dad56@drexel.edu
     * CS338:GUI, Assignment [1]
     */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class SongLogger{

	static JFrame frame = new JFrame("SongLogger");
	static JTabbedPane tabbedPane = new JTabbedPane();
	static RockTab rock = new RockTab();
	static JazzTab jazz = new JazzTab();
	static ClassicalTab classical = new ClassicalTab();
	static Buttons buttons = new Buttons();
	static List list = new List();
	public static DefaultListModel listModel = new DefaultListModel();
	static int location;
	
	//creates main frame
	public static void main(String[] args) {

		
		tabbedPane.addTab("Rock", rock.makeTab());
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		tabbedPane.addTab("Jazz", jazz.makeTab());
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		tabbedPane.addTab("Classical", classical.makeTab());
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
		tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);
		frame.add(buttons.makeButtons());
		frame.getContentPane().add(tabbedPane, BorderLayout.WEST);

		frame.add(list.makeList(listModel));
		frame.setLayout(new GridLayout(0,3, 5, 5));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	//Method to save records
	public static void save() {
		int sel = tabbedPane.getSelectedIndex();

		if(sel == 0){	
			if(rock.getArtist().getText().equals("") || rock.getSong().getText().equals("") || rock.getAlbum().getText().equals("") ||
					rock.getTrack().getText().equals("") || rock.getLength().getText().equals("")){
						
					}
			else{
			Record record = new Record("Rock", rock.getArtist().getText(), rock.getSong().getText(), 
					rock.getAlbum().getText(), rock.getTrack().getText(), rock.getLength().getText());
			listModel.addElement(Utils.writeRecordArray(record));
			}
		}
		else if(sel == 1){
			if(jazz.getArtist().getText().equals("") || jazz.getSong().getText().equals("") || jazz.getAlbum().getText().equals("") ||
					jazz.getTrack().getText().equals("") || jazz.getLength().getText().equals("")){
						
					}
			else{
			Record record = new Record("Jazz", jazz.getArtist().getText(), jazz.getSong().getText(), 
					jazz.getAlbum().getText(), jazz.getTrack().getText(), jazz.getLength().getText(), jazz.getRecord().getText(),
					jazz.getComposer().getText());
			listModel.addElement(Utils.writeRecordArray(record));
			}
		}
		else if(sel == 2){
			if(classical.getArtist().getText().equals("") || classical.getSong().getText().equals("") || classical.getAlbum().getText().equals("") ||
					classical.getTrack().getText().equals("") || classical.getLength().getText().equals("")){
						
					}
			else{
			Record record = new Record("Classical", classical.getArtist().getText(), classical.getSong().getText(), 
					classical.getAlbum().getText(), classical.getTrack().getText(), classical.getLength().getText(), classical.getRecord().getText(),
					classical.getComposer().getText(), classical.getCompyear().getText());
			listModel.addElement(Utils.writeRecordArray(record));
			}
		}

	}

	//Method to Remove Records
	public static void remove() {
		int sel = list.getList().getSelectedIndex();
		listModel.remove(sel);
	}
	
	//Method to Change the Records
	public static void change() {
		int highlight = list.getList().getSelectedIndex();
		
		int sel = tabbedPane.getSelectedIndex();

		if(sel == 0){			
			Record record = new Record("Rock", rock.getArtist().getText(), rock.getSong().getText(), 
					rock.getAlbum().getText(), rock.getTrack().getText(), rock.getLength().getText());
			listModel.set(highlight, Utils.writeRecordArray(record));
		}
		else if(sel == 1){
			Record record = new Record("Jazz", jazz.getArtist().getText(), jazz.getSong().getText(), 
					jazz.getAlbum().getText(), jazz.getTrack().getText(), jazz.getLength().getText(), jazz.getRecord().getText(),
					jazz.getComposer().getText());
			listModel.set(highlight,Utils.writeRecordArray(record));
		}
		else if(sel == 2){
			Record record = new Record("Classical", classical.getArtist().getText(), classical.getSong().getText(), 
					classical.getAlbum().getText(), classical.getTrack().getText(), classical.getLength().getText(), classical.getRecord().getText(),
					classical.getComposer().getText(), classical.getCompyear().getText());
			listModel.set(highlight, Utils.writeRecordArray(record));
		}
		
	}

	//Method to Fill in the Tabs
	public static void fillInTab() {

		String info = (String) list.getList().getSelectedValue();
		
		String[] ainfo = info.split(" ");
		
		if(ainfo[0].equals("Rock")){
			tabbedPane.setSelectedIndex(0);
			rock.getArtist().setText(ainfo[1]);
			rock.getSong().setText(ainfo[2]);
			rock.getAlbum().setText(ainfo[3]);
			rock.getTrack().setText(ainfo[4]);
			rock.getLength().setText(ainfo[5]);
		}
		else if(ainfo[0].equals("Jazz")){
			tabbedPane.setSelectedIndex(1);
			jazz.getArtist().setText(ainfo[1]);
			jazz.getSong().setText(ainfo[2]);
			jazz.getAlbum().setText(ainfo[3]);
			jazz.getTrack().setText(ainfo[4]);
			jazz.getLength().setText(ainfo[5]);
			jazz.getRecord().setText(ainfo[6]);
			jazz.getComposer().setText(ainfo[7]);
		}
		else if(ainfo[0].equals("Classical")){
			tabbedPane.setSelectedIndex(2);
			classical.getArtist().setText(ainfo[1]);
			classical.getSong().setText(ainfo[2]);
			classical.getAlbum().setText(ainfo[3]);
			classical.getTrack().setText(ainfo[4]);
			classical.getLength().setText(ainfo[5]);
			classical.getRecord().setText(ainfo[6]);
			classical.getComposer().setText(ainfo[7]);
			classical.getCompyear().setText(ainfo[8]);
		}
				

	}



}



