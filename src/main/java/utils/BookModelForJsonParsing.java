package utils;
public class BookModelForJsonParsing {
	
	private String name;
	private int size;
	private boolean available;
	private String[] subtitles;
	private Author authors;
	
	
	

	
	public BookModelForJsonParsing() {
	}
	public BookModelForJsonParsing(String name, int size, boolean available, String[] subtitles, Author authors) {
		this.name = name;
		this.size = size;
		this.available = available;
		this.subtitles = subtitles;
		this.authors = authors;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public boolean isAvailable() {
		return available;
	}
	public void setAvailable(boolean available) {
		this.available = available;
	}
	public String[] getSubtitles() {
		return subtitles;
	}
	public void setSubtitles(String[] subtitles) {
		this.subtitles = subtitles;
	}
	public Author getAuthors() {
		return authors;
	}
	public void setAuthors(Author authors) {
		this.authors = authors;
	}
	
	
	
	
	
	
}
