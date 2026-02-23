package com.thiskeyword;

//🔥 Practice 3 – Constructor Chaining
//Create class Person:
//Default constructor → print "Person Created"
//Parameterized constructor → takes name
//Use this() to call default constructor
//Print name after that
public class Person {
	Person() {
		System.out.println("Person is created");
	}

	Person(String name) {
		this();
		System.out.println(name);// this is called constructor chaining
	}

	public static void main(String[] args) {
		new Person("Payal");

	}
}
