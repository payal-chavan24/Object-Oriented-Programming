package multilevelinheritance;

public class AmzonMain {

	public static void main(String[] args) {
		AmazonShopping a1 = new AmazonShopping();
		a1.logIn();
		a1.buy();
		a1.logOut();
		System.out.println("---------------------");
		AmazonPrime a2 = new AmazonPrime();
		a2.logIn();
		a2.watching();
		a2.logOut();
	}

}
