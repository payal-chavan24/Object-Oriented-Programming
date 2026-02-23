package com.superkeyword;

//Question 1 – Access parent class variable
//Write a Java program where:
//Class Parent has an integer variable x = 10.
//Class Child extends Parent and has x = 20.
//Use super to print the parent class variable from child class.
public class Parent {
	int x = 10;
	Parent(){
		System.out.println("Parent constructor");
	}

	public void display() {
		System.out.println("Parent class method");
	}
	
}
