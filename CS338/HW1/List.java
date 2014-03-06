    /*
     * Daniel A DeCamillo
     * dad56@drexel.edu
     * CS338:GUI, Assignment [1]
     */

import java.awt.Component;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class List implements ListSelectionListener{
    public JList list;
    public DefaultListModel listModel;
	
   
    public List(){}
    
    //Generates List Component
    public Component makeList(DefaultListModel listModel){
    	list = new JList(listModel);
    	list.setSelectedIndex(-1);
    	list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    	list.setLayoutOrientation(JList.VERTICAL);
    	list.setVisibleRowCount(-1);
    	list.addListSelectionListener(this);
    	return list;
    }
      

	public JList getList() {
		return list;
	}

	public void setList(JList list) {
		this.list = list;
	}

	public void valueChanged(ListSelectionEvent e) {
		if (e.getValueIsAdjusting() == false) {
            if (list.getSelectedIndex() == -1) {
            	Buttons.disable();
            } else {
            	Buttons.enable();
            SongLogger.fillInTab();
            }
        }
	}

	public DefaultListModel getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel listModel) {
		this.listModel = listModel;
	}
	

}
