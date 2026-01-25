package com.parameterwithreturntype;

public class SumMain {

	public static void main(String[] args) {
		Sum add = new Sum();
		int a = 8;
		int b = 34;
		int c = add.printSum(a, b);
		System.out.println("Sum of " + a + " " + b + " is " + c);

	}

}
