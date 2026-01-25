package com.parameterwithreturntype;

// Write a method to print the first 10 natural numbers.
public class Number {
	public int printnumber(int a) {
		int last = 0;
		for (int i = 1; i <= a; i++) {
			System.out.println(i);
			last = a;
		}
		return last;
	}
}
