package com.methodoverloading;

//4️⃣ Write a program to overload constructor in a class Student
//Default constructor
//Parameterized constructor
public class Student {
	String name;

	// Default constructor
	Student() {
		System.out.println("This is default constructor of student class");
	}

	Student(String name) {
		this.name = name;
		System.out.println("Student name is " + this.name);

	}

	public static void main(String args[]) {
		Student s = new Student();
		Student s1 = new Student("Payal chavan");

	}
}
