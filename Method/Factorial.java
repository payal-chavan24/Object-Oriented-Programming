//Write a method to calculate the factorial of a given number.
package com.number;

public class Factorial {
	public void displayfactorial() {
		int num = 5;
		int fact = 1;
		for (int i = num; i <= 1; i--) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + num + " is " + fact);
	}

}
