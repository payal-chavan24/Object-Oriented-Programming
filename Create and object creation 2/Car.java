
public class Car {
//variable
	int modelYr;
	String brand;
	String color;
	double price;
	String companyName;

	void carRunning() {
		System.out.println("car is running");
	}

	void carStaring() {
		System.out.println("staring Activity");
	}

	void carwheels() {
		System.out.println("wheels are moving");
	}

	void startCar() {
		System.out.println("car is started");
	}

	void stopCar() {
		System.out.println("car is stoped");
	}

	void display() {
		System.out.println("Model year =" + modelYr);
		System.out.println("Brand name =" + brand);
		System.out.println("Price =" + price + "Lakh");
		System.out.println("Company name =" + companyName);
		System.out.println("Color =" + color);
	}
}
