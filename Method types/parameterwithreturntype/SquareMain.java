package com.parameterwithreturntype;

public class SquareMain {

	public static void main(String[] args) {
		Square sqr = new Square();
		int a = 10;
		int b = sqr.printSquare(a);
		System.out.println("Square of " + a + " is " + b);
	}

}
