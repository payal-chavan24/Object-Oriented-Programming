package com.parameterwithreturntype;

//6. Write a method to check whether a number is even or odd.
public class EvenOdd {
	public String checkEvenOdd(int num) {
		if (num % 2 == 0) {
			return num + " Is even number";
		} else {
			return num + " Is odd number";
		}
	}
}
