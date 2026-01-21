// Write a method to count the number of digits in a number.
package com.number;

public class CountingDigits {

	public void printcount() {
		int num = 1256;
		int count = 0;
		while (num > 0) {
			count++;
			num = num / 10;
		}
		System.out.println("Total count =" + count);

	}

}
