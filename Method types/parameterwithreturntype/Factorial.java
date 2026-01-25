package com.parameterwithreturntype;

//7. Write a method to calculate the factorial of a given number.
public class Factorial {
	public int printFact(int num) {
		int fact = 1;
		while (num > 0) {
			fact = fact * num;
			num--;
		}
		return fact;
	}
}
