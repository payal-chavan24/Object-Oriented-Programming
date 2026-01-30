package com.encapsulation;

//1️ Create a class Student
//Private variables: name, marks
//Create public getter and setter methods
//In setter, marks should not be negative
//Print details in main method
public class Student {
	private String name;
	private int marks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {// condition marks should not be negative
		// this.marks=marks;
		if (marks >= 0) {
			this.marks = marks;
		} else {
			System.out.println("Marks can not be negative");
		}
	}
}
