package com.nonparameterwithreturntype;
//10. Write a method to count the number of digits in a number.

public class Digit {
	public int countSigit() {
		int num = 1678467;
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;
	}
}
