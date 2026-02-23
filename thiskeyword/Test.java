package com.thiskeyword;

//🔥 Practice 5 – Confusion Test
//Write a class Test:
//instance variable x = 100
//constructor Test(int x)
//Print both:
//local variable
//instance variable
//👉 Use this properly.
public class Test {
	int x = 100;

	Test(int x) {
		System.out.println("Local variable =" + x);
		System.out.println("Instance variable =" + this.x);

	}

	public static void main(String[] args) {
		new Test(12);

	}

}
