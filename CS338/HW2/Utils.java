/*
 * Daniel A DeCamillo
 * dad56@drexel.edu
 * CS338:GUI, Assignment [2]
 */

public class Utils {

//	Standard Utils Class for Parsing data	
	public static String writeCircleArray(Circle c) {
		String info ="Circle" + " " + "Center" + " " + c.getX() + " " + c.getY() +  " " + "Radius" + " " + c.getRsize()
		+ " " + "Fill" + " " + c.isFill();
		return info;
	}

	public static String writeOvalArray(Oval o) {
		String info ="Oval" + " " + "Center" + " " + o.getX() + " " + o.getY() + " " + "Radius" + " "  + o.getRxsize() + " " + o.getRysize() + " " + "Fill" + " " + o.isFill();
		return info;
	}

	public static String writeSquareArray(Square s) {
		String info ="Square" + " " + "Center" + " "  + s.getX() + " " + s.getY() +  " " + "Size" + " " + s.getSSize() +  " " + "Fill" + " " + s.isFill();
		return info;
	}

	public static String writeRectangleArray(Rectangle r) {
		String info ="Rectangle" + " " + "Center" + " " + r.getX() + " " + r.getY() +  " " + "Size" + " "  + r.getSSize() + " " + r.getWSize() +  " " + "Fill" + " " + r.isFill();
		return info;
	}

	public static String writeLineArray(Line l) {
		String info ="Line" + " " + "Position 1" + " "  + l.getX1() + " " + l.getY1() + " " + "Position 2" + " "  + l.getX2() + " " + l.getY2();
		return info;
	}

}
