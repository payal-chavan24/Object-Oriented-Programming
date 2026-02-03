package com.inheritance;

public class Circle extends Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;
	}

	public void area() {
		System.out.println("Are of circle =" + 3.142 * radius * radius);
	}

}
