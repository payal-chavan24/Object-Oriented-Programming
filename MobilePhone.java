package multilevelinheritance;

public class MobilePhone extends Electronics {
	String brand;
	int modelYear;

	MobilePhone(int product_id, double price, String warrentyPeriod, String brand, int modelYear) {
		super(product_id, price, warrentyPeriod);
		this.modelYear = modelYear;
		this.brand = brand;

	}

	public void method() {
		super.electronicsDisplay();
		System.out.println("Model year =" + modelYear);
		System.out.println("brand =" + brand);
	}

}
