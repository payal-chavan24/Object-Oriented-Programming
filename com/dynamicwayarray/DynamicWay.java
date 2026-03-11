package com.dynamicwayarray;

import java.util.*;

public class DynamicWay {
	public static void main(String[] args) {
		// dynamic way
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter int value");
		int[] arr1 = new int[5];
		for (int i = 0; i < arr1.length - 1; i++) {
			arr1[i] = sc.nextInt();
		}

		System.out.println("After taking input from users");
		for (int i = 0; i <= arr1.length - 1; i++) {
			System.out.println(arr1[i]);

		}
		// for string
		System.out.println("Enter String value");
		String[] arr2 = new String[4];
		for (int i = 0; i < arr2.length - 1; i++) {
			arr2[i] = sc.nextLine();
		}

		System.out.println("After taking input from users");
		for (int i = 0; i <= arr2.length - 1; i++) {
			System.out.println(arr2[i]);

		}
		// for char
		char[] arr3 = new char[5];
		System.out.println("Enter characters");

		for (int i = 0; i <= arr3.length - 1; i++) {
			arr3[i] = sc.next().charAt(0);
		}

		System.out.println("After taking input from users");
		for (int i = 0; i <= arr3.length - 1; i++) {
			System.out.println(arr3[i]);

		}
		sc.close();
	}
}
