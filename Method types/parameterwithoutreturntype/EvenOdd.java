package com.parameterwithoutreturntype;

//6. Write a method to check whether a number is even or odd.
public class EvenOdd {
	public void checkEvenodd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is even number");
		} else {
			System.out.println(num + " is odd number");
		}
	}
}
