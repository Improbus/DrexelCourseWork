    /*
     * Daniel A DeCamillo
     * dad56@drexel.edu
     * CS338:GUI, Assignment [1]
     */

public class Utils {

//Standard Utils Class for Parsing data	
	public static String writeRecordArray(Record record) {
			String info =record.getType() + " " + record.getArtist() + " " + record.getSong() + " " + record.getAlbum() + " " + record.getTrack()
			+ " " + record.getLength() + " " + record.getYear() + " " + record.getComposer() + " " + record.getCompyear();
		    return info;
	}
	
}
