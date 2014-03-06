    /*
     * Daniel A DeCamillo
     * dad56@drexel.edu
     * CS338:GUI, Assignment [1]
     */
public class Record {
	
	public String type;
	public String artist;
	public String song;
	public String album;
	public String track;
	public String length;
	public String year;
	public String composer;
	public String compyear;
	
	//Rock COnstructor
	public Record(String type, String artist, String song, String album, String track, String length){
		this.type = type;
		this.artist = artist;
		this.song = song;
		this.album = album;
		this.track = track;
		this.length = length;
		year = "null";
		composer = "null";
		compyear = "null";
		
	}
	
	//Jazz COnstructor
	public Record(String type, String artist, String song, String album, String track, String length, String year, String composer){
		this.type = type;
		this.artist = artist;
		this.song = song;
		this.album = album;
		this.track = track;
		this.length = length;
		this.year = year;
		this.composer = composer;
		compyear = "null";
		
	}
	
	//Classical Constructor
	public Record(String type, String artist, String song, String album, String track, String length, String year, String composer, String compyear){
		this.type = type;
		this.artist = artist;
		this.song = song;
		this.album = album;
		this.track = track;
		this.length = length;
		this.year = year;
		this.composer = composer;
		this.compyear = compyear;
		
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getCompyear() {
		return compyear;
	}

	public void setCompyear(String compyear) {
		this.compyear = compyear;
	}

	public String getLength() {
		return length;
	}

	public void setLength(String length) {
		this.length = length;
	}

	public String getSong() {
		return song;
	}

	public void setSong(String song) {
		this.song = song;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}
	
	
	

}
