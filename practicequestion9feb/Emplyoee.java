package com.practicequestion9feb;

public class Emplyoee {
	int empId;
	String empName;
	private Emplyoee() {
		System.out.println("This is private constructor....!");
	}
	public  static Emplyoee objectCreation() {
		return new Emplyoee();//indirectly it is also work as copy constructor
	}

}
