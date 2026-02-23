package com.thiskeyword;

//🔥 Practice 1 – Fix the Bug
//Write a class Employee:
//Requirements:
//instance variables → id, name, salary
//constructor with same parameter names
//use this to initialize variables
//create object in main method and print values
public class Emplyoee {
	// using this keyword we can initialize variable and if instance and global have
	// same name so we can
	// using this keyword we can make differnce between both of them
	int id;
	String name;
	double salary;

	Emplyoee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Emplyoee e = new Emplyoee(24, "Payal", 50000);
		e.display();

	}

}
