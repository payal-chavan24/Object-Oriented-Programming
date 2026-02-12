package com.methodoverloading;

//1️⃣ Write a Java program to overload a method add()
//Add two integers
//Add three integers
public class Calculator {
//method 1
	public int add(int a, int b) {
		return a + b;
	}

	// method 2
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String args[]) {
		Calculator c1 = new Calculator();
		int a = c1.add(1, 4);
		int b = c1.add(6, 9, 10);
		System.out.println("Additing of two integer =" + a);
		System.out.println("Adding of three integer =" + b);
	}
}
