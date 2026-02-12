package com.methodoverride;

public class Circle extends Shape{
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public void area() {
		double area = 3.142 * radius * radius;
		System.out.println("Area of circle is " + area);
	}
}
