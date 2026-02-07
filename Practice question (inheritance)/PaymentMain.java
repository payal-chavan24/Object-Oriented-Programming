package com.practice5feb;

import java.util.Scanner;

public class PaymentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter bank name");
		String a = sc.nextLine();
		System.out.println("Enter amount");
		double b = sc.nextDouble();
		System.out.println("Enter UPI Id");
		int c = sc.nextInt();
		sc.nextLine();// clear buffering
		System.out.println("Enter payment Date");
		String d = sc.nextLine();
		// create child class object
		UpiPayment up = new UpiPayment(b, a, c, d);
		up.getValue();
		sc.close();
	}

}
