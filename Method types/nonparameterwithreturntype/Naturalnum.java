package com.nonparameterwithreturntype;

//5. Write a method to print the first 10 natural numbers.
public class Naturalnum {
	public int displayNum() {
		int last = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			last = i;
		}
		return last;
	}
}
