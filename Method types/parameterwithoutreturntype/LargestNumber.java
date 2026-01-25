package com.parameterwithoutreturntype;

//9. Write a method to return the largest of three numbers.
public class LargestNumber {
	public void displayLargestNum(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " is largest");
		} else if (b > a && b > c) {
			System.out.println(b + " is largest");
		} else {
			System.out.println(c + " is largest");
		}
	}
}
