package com.practicequestion;

public class CarMain {

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.setBrand("TATA");
		c1.setPrice(78000);
		System.out.println("Car model =" + c1.getBrand());
		System.out.println("Car price =" + c1.getPrice());

	}

}
