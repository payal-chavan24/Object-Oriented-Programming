package com.practice14feb;

public class Student implements Studies, Sport {

	@Override
	public void play() {
		System.out.println("Student are playing");

	}

	@Override
	public void study() {
		System.out.println("Students are studying java");

	}

}
