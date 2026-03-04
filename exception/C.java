package com.exception;

import java.util.Scanner;

//imple Login Validation
//Predefine a username and password.
//Take user input for username and password.
//If input is empty (""), throw a NullPointerException in try block.
//Catch it and print a message like “Input cannot be empty.”
public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String userName = sc.nextLine();
		System.out.println("Enter password");
		String password = sc.nextLine();
		try {
			char a = userName.charAt(0);
			char b = password.charAt(0);
			System.out.println("Login Succesful");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Input cannot be empty");

		}
        sc.close();
	}
}
