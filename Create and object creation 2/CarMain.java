
public class CarMain {
	public static void main(String args[]) {
		System.out.println("Creating first object");
		Car c1 = new Car();
		c1.brand = "TOYOTA";
		c1.modelYr = 2021;
		c1.color = "blue";
		c1.companyName = "BMW";
		c1.price = 24.7;
		c1.startCar();
		c1.carRunning();
		c1.carStaring();
		c1.carwheels();
		c1.stopCar();
		c1.display();
		System.out.println("------");

		System.out.println("creating Second object");
		Car c2 = new Car();
		c1.brand = "Suzuki";
		c1.modelYr = 2020;
		c1.color = "Black";
		c1.companyName = "Honda";
		c1.price = 45.98;
		c2.startCar();
		c2.carRunning();
		c2.carStaring();
		c2.carwheels();
		c2.stopCar();
		c2.display();
		System.out.println("------");

		System.out.println("creating third object");
		Car c3 = new Car();
		c3.brand = "Kia";
		c3.modelYr = 2016;
		c3.color = "Yellow";
		c3.companyName = "Hynudai";
		c3.price = 4.76;
		c3.startCar();
		c3.carRunning();
		c3.carStaring();
		c3.carwheels();
		c3.stopCar();
		c3.display();
		System.out.println("--------");

		System.out.println("creating fourth object");
		Car c4 = new Car();
		c4.brand = "Nissan";
		c4.modelYr = 2012;
		c4.color = "Green";
		c4.companyName = "Mercedes";
		c4.price = 87.9;
		c4.startCar();
		c4.carRunning();
		c4.carStaring();
		c4.carwheels();
		c4.stopCar();
		c4.display();
		System.out.println("-------");

	}
}
