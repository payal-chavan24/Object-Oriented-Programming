
public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		String a = c1.brand = "Maruti Suzuki";
		String b = c1.model = "Baleno";
		double c = c1.price = 5.79;
		System.out.println("Brand Name=" + a);
		System.out.println("Mode =" + b);
		System.out.println("Price =" + c + "Lakh");
		System.out.println("----------");
		Car c2 = new Car();
		String d = c2.brand = "TaTa Motors";
		String e = c2.model = "Harrier";
		double f = c2.price = 45.6;
		System.out.println("Brand Name=" + d);
		System.out.println("Mode =" + e);
		System.out.println("Price =" + f + "Lakh");
	}

}
