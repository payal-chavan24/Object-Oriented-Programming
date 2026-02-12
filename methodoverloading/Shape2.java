package com.methodoverloading;

//9️⃣ Create a class Shape
//Overload method draw()
//Draw circle
//Draw square
//(Use different parameters)
public class Shape2 {
//method 1
	public void draw(int radius) {
		System.out.println("draw a circle with radius " + radius);
	}

//method 2
	public void draw(double side) {
		System.out.println("draw a square with sides " + side);
	}

	// main method
	public static void main(String args[]) {
		Shape2 sh = new Shape2();
		sh.draw(5);
		sh.draw(4.5);
	}
}
