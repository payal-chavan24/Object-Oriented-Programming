package com.practice16feb;

public class SmartWatch implements HeartRateMonitour, StepCounter {

	@Override
	public void countSteps() {
		System.out.println("counting setps..!");

	}

	@Override
	public void measureHeartRate() {
		System.out.println("Measuring heart rate...! ");

	}

	public static void main(String[] args) {
		SmartWatch s = new SmartWatch();
		s.countSteps();
		s.measureHeartRate();
	}

}
