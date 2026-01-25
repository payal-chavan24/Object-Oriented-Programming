package com.parameterwithoutreturntype;

//10. Write a method to count the number of digits in a number.
public class Digitcount {
	public void printCountDigit(int num) {
		int num1=num;
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println("Number of digit in " + num1 + " is " + count);
	}
}
