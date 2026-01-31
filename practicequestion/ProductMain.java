package com.practicequestion;

public class ProductMain {

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setName("Mobile");
		p1.setPrice(10000);
		p1.setDiscount(10);
		System.out.println("Product name =" + p1.getName());
		System.out.println("Price =" + p1.getPrice());
		System.out.println("Discount =" + p1.getDiscount());
		System.out.println("Discount amount =" + p1.getDiscountAmount());
	}

}
