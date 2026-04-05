package multilevelinheritance;

public class Electronics extends Product {
String warrentyPeriod;

	Electronics(int product_id, double price,String warrentyPeriod) {
		super(product_id, price);
		this.warrentyPeriod=warrentyPeriod;
		
	}
	public void electronicsDisplay() {
		super.productDisplay();
		System.out.println("warrentyPeriod ="+warrentyPeriod);
	}
	

}
