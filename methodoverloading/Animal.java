package com.methodoverloading;

public class Animal {
	// method 1
	public void eat() {
		System.out.println("Animal consume food to be alive..!");
	}

	// method 2 (Overloading)
	public void eat(String type) {
		System.out.println(type + " is a animal");
	}

	public static void main(String args[]) {
		Animal a = new Animal();
		a.eat();
		a.eat("dog");

	}
}