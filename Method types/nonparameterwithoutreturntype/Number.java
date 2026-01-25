package com.nonparameterwithoutreturntype;

//9. Write a method to return the largest of three numbers.
public class Number {
	public void printLargestNum() {
		int a = 4, b = 89, c = 100;
		if (a > b && a > c) {
			System.out.println(a + " is largest");
		} else if (b > a && b > c) {
			System.out.println(b + " is largest");
		} else {
			System.out.println(c + " is largest");
		}
	}
}
