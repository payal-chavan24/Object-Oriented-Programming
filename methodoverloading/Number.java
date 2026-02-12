package com.methodoverloading;

//8️⃣ Write a program to overload method max()
//Find maximum of two numbers
//Find maximum of three numbers
public class Number {
//method 1
	public void maximum(int a, int b) {
		if (a > b) {
			System.out.println(a + " is maximum");
		} else {
			System.out.println(b + " is maximum");
		}
	}

	// method 2
	public void maximum(int a, int b, int c) {
		if (a > b && a > c) {
			System.out.println(a + " is maximum");
		} else if (b > a && b > c) {
			System.out.println(b + " is maximum");
		} else {
			System.out.println(c + " is maximum");
		}
	}

	// main method
	public static void main(String args[]) {
		Number num = new Number();
		num.maximum(4, 8);
		num.maximum(8, 9, 10);
	}

}
