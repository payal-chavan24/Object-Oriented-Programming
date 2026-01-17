
public class LaptopMain {

	public static void main(String[] args) {
		Laptop l1 = new Laptop();
		l1.ram = 8;
		l1.processor = "intel core i3";
		l1.price = 45000;
		System.out.println("Ram =" + l1.ram + "GB");
		System.out.println("Processor =" + l1.processor);
		System.out.println("Price =" + l1.price);
	}

}
