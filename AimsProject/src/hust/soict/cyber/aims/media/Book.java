package hust.soict.cyber.aims.media;
import java.util.ArrayList;
import java.util.List;

public class Book extends Media{
	private List<String> authors = new ArrayList<String>();
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public List<String> getAuthors() {
		return authors;
	}
//	public Book(String title, String category, List<String> authors,  float cost) {
//		super();
//		this.title = title;
//		this.category = category;
//		this.authors = authors;
//		this.cost = cost;
//	}
	public void addAuthor(String authorName) {
		if(authors.contains(authorName) == false) {
			authors.add(authorName);
			System.out.println("Author has been added");
		} else {
			System.out.println("Author has been existed");
		}
	}
	public void removeAuthor(String authorName) {
		if(authors.contains(authorName)) {
			authors.remove(authorName);
			System.out.println("Author has been removed");
		} else {
			System.out.println("Author not found");
		}
	}
	public String toString() {
		return title + " - " + category + " - " + String.join(", ", authors) + " - " + id + ": " + cost;
	}
}

