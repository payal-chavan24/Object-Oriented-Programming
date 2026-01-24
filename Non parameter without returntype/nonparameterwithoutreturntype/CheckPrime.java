package com.nonparameterwithoutreturntype;

//8. Write a method to check if a number is prime or not.
public class CheckPrime {
	public void printPrime() {
		int num = 11;
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(num + " is prime number");
		} else {
			System.out.println(num + " is not prime number");
		}
	}
}
