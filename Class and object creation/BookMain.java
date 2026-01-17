
public class BookMain {

	public static void main(String[] args) {
		Book b1 = new Book();
		String a = b1.title = "Think like monk";
		String b = b1.author = "Jay Shetty";
		int c = b1.bookid = 23;
		System.out.println("Title of the book =" + a);
		System.out.println("Authour of the book =" + b);
		System.out.println("Book Id=" + c);
		System.out.println("-----");
		Book b2 = new Book();
		String d = b2.title = "You can fly";
		String e = b2.author = "A.p.j Abdul Kalam";
		int f = b2.bookid = 567;
		System.out.println("Title of the book =" + d);
		System.out.println("Authour of the book =" + e);
		System.out.println("Book Id=" + f);

	}

}
