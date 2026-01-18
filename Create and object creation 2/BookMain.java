
public class BookMain {
	public static void main(String[] args) {
		// creating object
		Book b1 = new Book();
		System.out.println("First object creation");
		b1.color = "Blue";
		b1.author = "Sheetal";
		b1.publishYr = 2024;
		b1.title = "Can we be stranger again";
		b1.types = "Novel";
		b1.price = 250.00;
		b1.openBook();
		b1.checkAvailablity();
		b1.readBook();
		b1.closeBook();
		b1.display();

		System.out.println("---------");
		System.out.println("Second Object creation");
		Book b2 = new Book();
		b2.color = "yellow";
		b2.author = "Neha Sharma";
		b2.publishYr = 2022;
		b2.title = "Women";
		b2.types = "Novel";
		b2.price = 300.00;
		b2.openBook();
		b2.checkAvailablity();
		b2.readBook();
		b2.closeBook();
		b2.display();

		System.out.println("----------");
		System.out.println("third Object creation");
		Book b3 = new Book();
		b3.color = "White";
		b3.author = "A.P.J abduk kalam";
		b3.publishYr = 2024;
		b3.title = "Lets fly";
		b3.types = "Self improvment book";
		b3.price = 200.00;
		b3.openBook();
		b3.checkAvailablity();
		b3.readBook();
		b3.closeBook();
		b3.display();
		b3.display();
		System.out.println("----------");

		Book b4 = new Book();
		System.out.println("Fourth Object creation");
		b4.color = "green";
		b4.author = "Sane Guruji";
		b4.publishYr = 2015;
		b4.title = "Moment in school";
		b4.types = "Stories book";
		b4.price = 300.00;
		b4.openBook();
		b4.checkAvailablity();
		b4.readBook();
		b4.closeBook();
		b4.display();

	}

}
