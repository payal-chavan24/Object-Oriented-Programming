package com.methodoverride;

public class Rectangle extends Shape {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public void area() {
		double a = length * width;
		System.out.println("Area of rectangle is " + a);
	}
}
