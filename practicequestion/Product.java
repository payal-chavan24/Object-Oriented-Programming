package com.practicequestion;

// create a class product using encapsulation and 
//calculate discount using getter and setter methods
public class Product {
	private String name;
	private double price;
	private double discount;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if (price > 0) {
			this.price = price;
		} else {
			System.out.println("Price can not be zero");
		}
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		if (discount > 0 && discount <= 100) {
			this.discount = discount;
		} else {
			System.out.println("invalid");
		}
	}

	public double getDiscountAmount() {
		return price * discount / 100;
	}
}
