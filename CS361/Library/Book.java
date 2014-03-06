//Class to create a book object to be checked in and out

public class Book {
	
	protected String title;
	protected boolean available;
	
	public Book(String title, boolean available){
		this.title = title;
		this.available = available;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

}
