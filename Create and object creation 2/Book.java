
public class Book {
//Instance variable which have default size
	String title;
	String author;
	double price;
	String color;
	String types;
	int publishYr;

	// methods
	void checkAvailablity() {
		System.out.println("book is available");
	}

	void readBook() {
		System.out.println("Reading the book");
	}

	void openBook() {
		System.out.println("Book is open");
	}

	void closeBook() {
		System.out.println("Book is close");
	}

	void knowledge() {
		System.out.println("Knowledge comes from books");
	}

	void display() {
		System.out.println("Title =" + title);
		System.out.println("Author =" + author);
		System.out.println("Book Price =" + price);
		System.out.println("Book Color =" + color);
		System.out.println("Book type =" + types);
		System.out.println("Publish year =" + publishYr);
	}
}
