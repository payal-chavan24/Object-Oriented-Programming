package com.practicequestion;

//write a program for copy constructor in class person
public class Person {
	int age;
	String name;

	Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	Person(Person p) {// Syntax of copy constructor
		this.age = p.age;
		this.name = p.name;
	}

	public void displayInfo() {
		System.out.println("age =" + age);
		System.out.println("Name =" + name);
	}

}
