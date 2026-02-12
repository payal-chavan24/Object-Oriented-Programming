package com.methodoverride;

public class ShapeMain {

	public static void main(String[] args) {
		Shape a;
		a = new Circle(2.3);
		a.area();
		a = new Rectangle(2.3, 2.2);
		a.area();
	}

}
