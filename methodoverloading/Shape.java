package com.methodoverloading;

//2️⃣ Write a program to overload a method area()
//Find area of circle
//Find area of rectangle
public class Shape {
	// method 1
	public void area(double r) {
		double a = 3.142 * r * r;
		System.out.println("Area of circle  is " + a);
	}

//method 2
	public void area(int length, int breadth) {
		int b = length * breadth;
		System.out.println("Area of recatngle is " + b);
	}

	public static void main(String args[]) {
		Shape sh = new Shape();
		sh.area(5);
		sh.area(4, 7);
	}
}
