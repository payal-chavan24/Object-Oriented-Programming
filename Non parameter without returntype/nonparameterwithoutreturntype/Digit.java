package com.nonparameterwithoutreturntype;

//10. Write a method to count the number of digits in a number.
public class Digit {
	public void countDigit() {
		int num = 8975;
		int num2 = num;
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println("number of count in " + num2 + " Digit is " + count);
	}
}
