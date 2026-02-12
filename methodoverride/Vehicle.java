package com.methodoverride;

public class Vehicle {

	void run() {
		System.out.println("Vehicle is running");
	}
}

class Bike extends Vehicle {
	void run() {
		System.out.println("Bike is running fast");
	}
}

class Car extends Vehicle {
	void run() {
		System.out.println("Car is running smoothly");
	}
}

class TestVehicle {
	public static void main(String[] args) {
		Vehicle v;

		v = new Bike();
		v.run(); // Bike run

		v = new Car();
		v.run(); // Car run
	}

}
