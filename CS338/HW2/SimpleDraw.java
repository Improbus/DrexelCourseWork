/*
 * Daniel A DeCamillo
 * dad56@drexel.edu
 * CS338:GUI, Assignment [2]
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.swing.DefaultListModel;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class SimpleDraw{

	static JFrame frame = new JFrame("SimpleDraw");
	static JFrame dialogFrame = new JFrame("ShapeGen");
	static JPanel container = new JPanel();
	static Buttons buttons = new Buttons();
	static List list = new List();
	public static DefaultListModel listModel = new DefaultListModel();
	static int location;
	static JDialog shapeGen = new JDialog();
	static JTabbedPane tabbedPane = new JTabbedPane();
	static SquareTab st = new SquareTab();
	static RectangleTab rt = new RectangleTab();
	static CircleTab ct = new CircleTab();
	static OvalTab ot = new OvalTab();
	static LineTab lt = new LineTab();
	static dButtons db = new dButtons();
	static JInternalFrame sf = new JInternalFrame();
	static Circle c = new Circle();
	static Oval o = new Oval();
	static Square s = new Square();
	static Rectangle r = new Rectangle();
	static Line l = new Line();
	static Color previous;


	//creates main frame
	public static void main(String[] args) {

		createDia();
		container.setLayout(new GridLayout(0,1));
		container.add(list.makeList(listModel));
		container.add(buttons.makeButtons());
		frame.add(container);
		sf.setPreferredSize(new Dimension(500,500));
		frame.add(sf);
		frame.setLayout(new GridLayout(0,2, 5, 5));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	//Creates a Custom JDialog Box For Shape Editing
	public static void createDia(){
		shapeGen.setPreferredSize(new Dimension(700,500));
		tabbedPane.setPreferredSize(new Dimension(350,400));
		tabbedPane.addTab("Square" , st.makeTab());
		tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
		tabbedPane.addTab("Rectangle" , rt.makeTab());
		tabbedPane.setMnemonicAt(1, KeyEvent.VK_2);
		tabbedPane.addTab("Circle" , ct.makeTab());
		tabbedPane.setMnemonicAt(2, KeyEvent.VK_3);
		tabbedPane.addTab("Oval" , ot.makeTab());
		tabbedPane.setMnemonicAt(3, KeyEvent.VK_4);
		tabbedPane.addTab("Line" , lt.makeTab());
		tabbedPane.setMnemonicAt(4, KeyEvent.VK_5);
		shapeGen.setLayout(new GridLayout(0,2, 0, 0));
		shapeGen.setLocationRelativeTo(frame);
		shapeGen.add(tabbedPane);
		JPanel dButtons = (JPanel) db.makeButtons();
		dButtons.setPreferredSize(new Dimension(50,50));
		shapeGen.add(dButtons);
		shapeGen.pack();
	}
	
	//Opens JDialog When add Button is pressed
	public static void add() {
		
		shapeGen.setVisible(true);

	}

	//Closes JDialog when Cancel is Pressed
	public static void closeDialog() {
		shapeGen.setVisible(false);

	}

	//Draws shapes when ok is pressed in JDialog 
	public static void drawShape() {
		int sel = tabbedPane.getSelectedIndex();

		if(sel == 0){	
			if(st.getX().getText().equals("") ||st.getY().getText().equals("") || st.getSize().getText().equals("")){

			}
			else{
				
				s.setX(Integer.parseInt(st.getX().getText()));
				s.setY(Integer.parseInt(st.getY().getText()));
				s.setSSize(Integer.parseInt(st.getSize().getText()));
				if(st.getFill().isSelected()){
					s.setFill(true);
				}
				else{
					s.setFill(false);
				}

				if(st.getColor().getSelectedItem().equals("Black")){
					s.setColor(Color.black);
				}
				else if(st.getColor().getSelectedItem().equals("Blue")){
					s.setColor(Color.blue);
				}
				else if(st.getColor().getSelectedItem().equals("Green")){
					s.setColor(Color.green);
				}
				else if(st.getColor().getSelectedItem().equals("Red")){
					s.setColor(Color.red);
				}
				else if(st.getColor().getSelectedItem().equals("Yellow")){
					s.setColor(Color.yellow);
				}
				listModel.addElement(Utils.writeSquareArray(s));
				drawSquare(s);
			}
		}
		else if(sel == 1){
			if(rt.getX().getText().equals("") ||rt.getY().getText().equals("") || rt.getXSize().getText().equals("")|| rt.getYSize().getText().equals("")){

			}
			else{
				r.setX(Integer.parseInt(rt.getX().getText()));
				r.setY(Integer.parseInt(rt.getY().getText()));
				r.setSSize(Integer.parseInt(rt.getXSize().getText()));
				r.setWSize(Integer.parseInt(rt.getYSize().getText()));
				if(rt.getFill().isSelected()){
					r.setFill(true);
				}
				else{
					r.setFill(false);
				}

				if(rt.getColor().getSelectedItem().equals("Black")){
					r.setColor(Color.black);
				}
				else if(rt.getColor().getSelectedItem().equals("Blue")){
					r.setColor(Color.blue);
				}
				else if(rt.getColor().getSelectedItem().equals("Green")){
					r.setColor(Color.green);
				}
				else if(rt.getColor().getSelectedItem().equals("Red")){
					r.setColor(Color.red);
				}
				else if(rt.getColor().getSelectedItem().equals("Yellow")){
					r.setColor(Color.yellow);
				}
				listModel.addElement(Utils.writeRectangleArray(r));
				drawRectangle(r);
			}

		}
		else if(sel == 2){
			if(ct.getX().getText().equals("") ||ct.getY().getText().equals("") || ct.getRadius().getText().equals("")){

			}
			else{
				c.setX(Integer.parseInt(ct.getX().getText()));
				c.setY(Integer.parseInt(ct.getY().getText()));
				c.setRsize(Integer.parseInt(ct.getRadius().getText()));
				if(ct.getFill().isSelected()){
					c.setFill(true);
				}
				else{
					c.setFill(false);
				}

				if(ct.getColor().getSelectedItem().equals("Black")){
					c.setColor(Color.black);
				}
				else if(ct.getColor().getSelectedItem().equals("Blue")){
					c.setColor(Color.blue);
				}
				else if(ct.getColor().getSelectedItem().equals("Green")){
					c.setColor(Color.green);
				}
				else if(ct.getColor().getSelectedItem().equals("Red")){
					c.setColor(Color.red);
				}
				else if(ct.getColor().getSelectedItem().equals("Yellow")){
					c.setColor(Color.yellow);
				}
				listModel.addElement(Utils.writeCircleArray(c));
				drawCircle(c);
			}

		}
		else if(sel == 3){
			if(ot.getX().getText().equals("") ||ot.getY().getText().equals("") || ot.getXRadius().getText().equals("")|| ot.getYRadius().getText().equals("")){

			}
			else{
				o.setX(Integer.parseInt(ot.getX().getText()));
				o.setY(Integer.parseInt(ot.getY().getText()));
				o.setRxsize(Integer.parseInt(ot.getXRadius().getText()));
				o.setRysize(Integer.parseInt(ot.getYRadius().getText()));
				if(ot.getFill().isSelected()){
					o.setFill(true);
				}
				else{
					o.setFill(false);
				}

				if(ot.getColor().getSelectedItem().equals("Black")){
					o.setColor(Color.black);
				}
				else if(ot.getColor().getSelectedItem().equals("Blue")){
					o.setColor(Color.blue);
				}
				else if(ot.getColor().getSelectedItem().equals("Green")){
					o.setColor(Color.green);
				}
				else if(ot.getColor().getSelectedItem().equals("Red")){
					o.setColor(Color.red);
				}
				else if(ot.getColor().getSelectedItem().equals("Yellow")){
					o.setColor(Color.yellow);
				}
				listModel.addElement(Utils.writeOvalArray(o));
				drawOval(o);
			}
		}
		else if(sel == 4){
			if(lt.getX1().getText().equals("") ||lt.getY1().getText().equals("") || lt.getX2().getText().equals("") ||lt.getY2().getText().equals("")){

			}
			else{
				l.setX1(Integer.parseInt(lt.getX1().getText()));
				l.setY1(Integer.parseInt(lt.getY1().getText()));
				l.setX2(Integer.parseInt(lt.getX2().getText()));
				l.setY2(Integer.parseInt(lt.getY2().getText()));

				if(lt.getColor().getSelectedItem().equals("Black")){
					l.setColor(Color.black);
				}
				else if(lt.getColor().getSelectedItem().equals("Blue")){
					l.setColor(Color.blue);
				}
				else if(lt.getColor().getSelectedItem().equals("Green")){
					l.setColor(Color.green);
				}
				else if(lt.getColor().getSelectedItem().equals("Red")){
					l.setColor(Color.red);
				}
				else if(lt.getColor().getSelectedItem().equals("Yellow")){
					l.setColor(Color.yellow);
				}
				listModel.addElement(Utils.writeLineArray(l));
				drawLine(l);
			}
		}


		shapeGen.setVisible(false);
	}

	//Called when Object is selected from the JList Only 1 of each shape and color can be displayed at one time
	public static void draw() {

		String info = (String) list.getList().getSelectedValue();
		
		String[] ainfo = info.split(" ");

		if(ainfo[0].equals("Square")){
			
			s.setX(Integer.parseInt(ainfo[2]));
			s.setY(Integer.parseInt(ainfo[3]));
			s.setSSize(Integer.parseInt(ainfo[5]));
			if(ainfo[7].equals("true")){
				s.setFill(true);
			}
			else{
				s.setFill(false);
			}
			drawSquare(s);

		}
		else if(ainfo[0].equals("Rectangle")){
			r.setX(Integer.parseInt(ainfo[2]));
			r.setY(Integer.parseInt(ainfo[3]));
			r.setSSize(Integer.parseInt(ainfo[5]));
			r.setWSize(Integer.parseInt(ainfo[6]));
			
			if(ainfo[8].equals("true")){
				r.setFill(true);
			}
			else{
				r.setFill(false);
			}
			
			drawRectangle(r);
		}
		else if(ainfo[0].equals("Circle")){
			c.setX(Integer.parseInt(ainfo[2]));
			c.setY(Integer.parseInt(ainfo[3]));
			c.setRsize(Integer.parseInt(ainfo[5]));
						
			if(ainfo[8].equals("true")){
				r.setFill(true);
			}
			else{
				r.setFill(false);
			}
			drawCircle(c);
		}
		else if(ainfo[0].equals("Oval")){
			o.setX(Integer.parseInt(ainfo[2]));
			o.setY(Integer.parseInt(ainfo[3]));
			o.setRxsize(Integer.parseInt(ainfo[5]));
			o.setRysize(Integer.parseInt(ainfo[6]));
			
			if(ainfo[8].equals("true")){
				o.setFill(true);
			}
			else{
				o.setFill(false);
			}
			drawOval(o);
		}
		else if(ainfo[0].equals("Line")){
			l.setX1(Integer.parseInt(ainfo[2]));
			l.setY1(Integer.parseInt(ainfo[3]));
			l.setX2(Integer.parseInt(ainfo[5]));
			l.setY2(Integer.parseInt(ainfo[6]));
			drawLine(l);
		}

	}

	//Method to display the Drawn Line
	private static void drawLine(Line l) {
		sf.setVisible(false);
		l.setPreferredSize(new Dimension(100,00));
		sf.add(l);
		sf.repaint();
		sf.setVisible(true);

	}

	//	Method to display the Drawn Rectangle
	private static void drawRectangle(Rectangle r) {
		sf.setVisible(false);
		r.setPreferredSize(new Dimension(100,00));
		sf.add(r);
		sf.repaint();
		sf.setVisible(true);

	}

	//	Method to display the Drawn Square
	private static void drawSquare(Square s) {
		sf.setVisible(false);
		s.setPreferredSize(new Dimension(100,00));
		sf.add(s);
		sf.repaint();
		sf.setVisible(true);

	}
	
	//	Method to display the Drawn Oval
	private static void drawOval(Oval o) {
		sf.setVisible(false);
		o.setPreferredSize(new Dimension(100,00));
		sf.add(o);
		sf.repaint();
		sf.setVisible(true);

	}

	//	Method to display the Drawn Circle
	private static void drawCircle(Circle c) {
		sf.setVisible(false);
		c.setPreferredSize(new Dimension(100,00));
		sf.add(c);
		sf.repaint();
		sf.setVisible(true);

	}

	//Method to Remove and Object from the drawing frame
	public static void remove() {
		

		String info = (String) list.getList().getSelectedValue();

		String[] ainfo = info.split(" ");

		if(ainfo[0].equals("Square")){
			listModel.removeElement(list.getList().getSelectedValue());
			sf.setVisible(false);
			sf.remove(s);
			sf.repaint();
			sf.setVisible(true);
		}
		else if(ainfo[0].equals("Rectangle")){
			listModel.removeElement(list.getList().getSelectedValue());
			sf.setVisible(false);
			sf.remove(r);
			sf.repaint();
			sf.setVisible(true);
		}
		else if(ainfo[0].equals("Circle")){
			listModel.removeElement(list.getList().getSelectedValue());
			sf.setVisible(false);
			sf.remove(c);
			sf.repaint();
			sf.setVisible(true);
		}
		else if(ainfo[0].equals("Oval")){
			listModel.removeElement(list.getList().getSelectedValue());
			sf.setVisible(false);
			sf.remove(o);
			sf.repaint();
			sf.setVisible(true);
		}
		else if(ainfo[0].equals("Line")){
			listModel.removeElement(list.getList().getSelectedValue());
			sf.setVisible(false);
			sf.remove(l);
			sf.repaint();
			sf.setVisible(true);
		}

	}

	//Fills in info for selected value and allows for changes to it
	public static void change() {

		shapeGen.setVisible(true);


		String info = (String) list.getList().getSelectedValue();

		String[] ainfo = info.split(" ");

		if(ainfo[0].equals("Square")){
			tabbedPane.setSelectedIndex(0);
			sf.remove(s);
			listModel.removeElement(list.getList().getSelectedValue());
			st.getX().setText(Integer.toString(s.getX()));
			st.getY().setText(Integer.toString(s.getY()));
			st.getSize().setText(Integer.toString(s.getSSize()));
			
			if(s.isFill()){
				st.getFill().setSelected(true);
			}
			else{
				st.getFill().setSelected(false);
			}
			
			st.getColor().setSelectedItem(s.getColor());
		}
		else if(ainfo[0].equals("Rectangle")){
			tabbedPane.setSelectedIndex(1);
			sf.remove(r);
			listModel.removeElement(list.getList().getSelectedValue());
			rt.getX().setText(Integer.toString(r.getX()));
			rt.getY().setText(Integer.toString(r.getY()));
			rt.getXSize().setText(Integer.toString(r.getSSize()));
			rt.getYSize().setText(Integer.toString(r.getWSize()));
			
			if(r.isFill()){
				rt.getFill().setSelected(true);
			}
			else{
				rt.getFill().setSelected(false);
			}
			
			rt.getColor().setSelectedItem(r.getColor());
			
		}
		else if(ainfo[0].equals("Circle")){
			tabbedPane.setSelectedIndex(2);
			sf.remove(c);
			listModel.removeElement(list.getList().getSelectedValue());
			ct.getX().setText(Integer.toString(c.getX()));
			ct.getY().setText(Integer.toString(c.getY()));
			ct.getRadius().setText(Integer.toString(c.getRsize()));
			
			
			if(c.isFill()){
				ct.getFill().setSelected(true);
			}
			else{
				ct.getFill().setSelected(false);
			}
			
			ct.getColor().setSelectedItem(c.getColor());
			
		}
		else if(ainfo[0].equals("Oval")){
			tabbedPane.setSelectedIndex(3);
			sf.remove(o);
			listModel.removeElement(list.getList().getSelectedValue());
			ot.getX().setText(Integer.toString(o.getX()));
			ot.getY().setText(Integer.toString(o.getY()));
			ot.getXRadius().setText(Integer.toString(o.getRxsize()));
			ot.getYRadius().setText(Integer.toString(o.getRysize()));
			
			
			if(o.isFill()){
				ot.getFill().setSelected(true);
			}
			else{
				ot.getFill().setSelected(false);
			}
			
			ot.getColor().setSelectedItem(o.getColor());
		}
		else if(ainfo[0].equals("Line")){
			tabbedPane.setSelectedIndex(4);
			sf.remove(l);
			listModel.removeElement(list.getList().getSelectedValue());
			lt.getX1().setText(Integer.toString(l.getX1()));
			lt.getY1().setText(Integer.toString(l.getY1()));
			lt.getX2().setText(Integer.toString(l.getX2()));
			lt.getY2().setText(Integer.toString(l.getY2()));
			lt.getColor().setSelectedItem(l.getColor());
		}




	}


}
