package com.practicequestion;
//Create a class rectangle with parameterized constructor that calculate area

public class Rectangle {
	double length;
	double width;

	Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
		System.out.println("Area =" + this.length * this.width);
	}
}
