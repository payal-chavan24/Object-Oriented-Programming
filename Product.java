package multilevelinheritance;

public class Product {
	int product_id;
	double price;

	Product(int product_id, double price) {
		this.product_id = product_id;
		this.price = price;

	}

	public void productDisplay() {
		System.out.println("Product id =" + product_id);
		System.out.println("price =" + price);
	}
}
