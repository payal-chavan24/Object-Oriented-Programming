package com.parameterwithreturntype;

//10. Write a method to count the number of digits in a number.
public class Digitcount {
	public int countDigit(int num) {
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		return count;

	}
}
