package com.parameterwithoutreturntype;

//7. Write a method to calculate the factorial of a given number.
public class Factorial {
	public void printFact(int num) {
		int num2=num;
		int fact = 1;
		while (num > 0) {
			fact = fact * num;
			num--;
		}
		System.out.println("Factorial of "+num2+" is "+fact);
	}
}
