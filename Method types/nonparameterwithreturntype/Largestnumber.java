package com.nonparameterwithreturntype;

//9. Write a method to return the largest of three numbers.
public class Largestnumber {
	public String printLargetsNum() {
		int a = 4, b = 98, c = 199;
		if (a > b && a > c) {
			return a + " Is largest";
		} else if (b > a && b > c) {
			return b + " Is largest";
		} else {
			return c + " Is largest";
		}

	}
}
