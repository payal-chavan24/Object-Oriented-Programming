package com.practice16feb;

public class HybridCar implements ElectriVehicle, FuelVehicle {

	@Override
	public void fuelVehicle() {
		System.out.println("fuel is full in vehicle");

	}

	@Override
	public void chargeBattery() {
		System.out.println("Battery is charging");

	}

	public static void main(String[] args) {
		HybridCar h = new HybridCar();
		h.chargeBattery();
		h.fuelVehicle();
	}

}
