// Write a method to check if a number is prime or not.
package com.number;

public class PrimeNumber {
public void checkprime() {
	
	int num=7;
	int count=0;
	for(int i=1;i<=num;i++) {
		if (num % i==0) {
			count++;	
		}
	}
		if(count==2) {
			System.out.println(num+"is Prime number");
		}else {
			System.out.println(num+"is not Prime number");
		}
		
	
}
}
