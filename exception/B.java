package com.exception;

import java.util.Scanner;

//Null String Handling
//Declare a string variable without initializing it.
//Try to call .length() on it.
//Catch NullPointerException and print a message
public class B {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("Enter a string");
		//String a = sc.nextLine();
		String b=null;
		try {
			int length = b.length();
			//
			System.out.println("Result =" + length);

		} catch (NullPointerException e) {
			System.out.println("can not get length of null string");
		}

	}

}
