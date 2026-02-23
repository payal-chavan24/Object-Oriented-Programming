package com.thiskeyword;

//🔥 Practice 2 – Method Calling Using this
//Create a class Calculator:
//Method add(int a, int b)
//Method displayResult()
//Inside add(), call displayResult() using this
//Store result in instance variable
//👉 Print result using display method.
public class Calculator {
	int a;
	int b;

	public void add(int a, int b) {
		this.a = a;
		this.b = b;
		this.displayResult();

	}

	public void displayResult() {
		int sum = a + b;
		System.out.println("Sum = " + sum);
	}

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.add(7, 9);

	}

}
