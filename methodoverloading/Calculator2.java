package com.methodoverloading;

//5️⃣ Create a class Calculator
//Overload method multiply()
//Multiply two numbers
//Multiply three numbers
public class Calculator2 {
	public int multiply(int a, int b) {
		return a * b;
	}

	public int multiply(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String args[]) {
		Calculator2 c2 = new Calculator2();
		int a = c2.multiply(2, 2);
		System.out.println("Multiply of two number is " + a);
		int b = c2.multiply(2, 2, 2);
		System.out.println("Multiply of three number is " + b);
	}
}
