package com.finalkeyword;
//Question 1
//Write a Java program where:
//A class contains a final variable.
//Initialize it using a constructor.
//Print the value inside the main() method.
public class A {
final double pie;
A(double pie){
	this.pie=pie;
}
public void display() {
	System.out.println(pie);
}
public static void main(String[] args) {
	A a=new A(3.142);
	a.display();
	
	
	
}
}
