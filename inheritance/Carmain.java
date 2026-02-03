package com.inheritance;

public class Carmain {

	public static void main(String[] args) {
		// create object of child class and we can acquired
// properties of child class and Parent class as well

		Bmw b1 = new Bmw();
		b1.start();
		String a = b1.color = "black"; // this variable belongs to Car class(Parent class)
		int b = b1.modelYear = 2021;
		int c = b1.maxSpeed = 150;
		System.out.println("Color of Car =" + a);
		System.out.println("Model year of car =" + b);
		System.out.println("Max Speed of Bmw car =" + c);
		b1.autoPark();
		b1.stop();
		System.err.println("-------------------------------");
		MgHector m1 = new MgHector();
		m1.start();
		String col = m1.color = "Blue";
		System.out.println("Color of car =" + col);
		int yr = m1.modelYear = 2023;
		System.out.println("Model  year of car =" + yr);
		String speed = m1.internetSpeed = "55 mbps";
		System.out.println("Internet Speed =" + speed);
		m1.stop();

	}

}
