package com.nonparameterwithoutreturntype;

//7. Write a method to calculate the factorial of a given number.
public class FactorialNumber {
	public void printFact() {
		int num = 5;
		int fact = 1;
		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact);
	}
}
