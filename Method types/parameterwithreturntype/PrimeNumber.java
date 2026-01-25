package com.parameterwithreturntype;

//8. Write a method to check if a number is prime or not.
public class PrimeNumber {
	public String checkPrime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			return num + " is prime number";
		} else {
			return num + " is not prime number";
		}
	}
}
