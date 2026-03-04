package com.exception;

import java.util.Scanner;

//Question: Division with Exception Handling
//Write a Java program that:
//Reads two integers from the user.
//Tries to divide the first number by the second number.
//Handles any possible exceptions that may occur (like dividing by zero or invalid input) using only try and catch.
//Prints the result if no exception occurs.
//Prints a meaningful message if an exception occurs.
public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		int a = sc.nextInt();
		System.out.println("Enter second number");
		int b = sc.nextInt();
		try {
			int c = a / b;
			System.out.println("Ans =" + c);
		} catch (Exception e) {
			System.out.println("divide by 0 is not allowed in java...!");
		} finally {
			System.out.println("Always executed...! ");
		}
		sc.close();

	}

}
