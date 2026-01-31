package com.practicequestion;

//create a parameterized constructor for a class book to intialize title and price
public class Book {
	String title;
	double price;

	public Book(String title, double price) {
		this.title = title;
		this.price = price;
	}

	public void displayInfo() {
		System.out.println("Book title =" + title);
		System.out.println("Book Price =" + price);
	}
}
