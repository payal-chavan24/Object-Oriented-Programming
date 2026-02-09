package com.practicequestion9feb;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Studeent Id");
		int id = sc.nextInt();
		sc.nextLine();// clear buffer
		System.out.println("Enter student name");
		String name = sc.nextLine();
		System.out.println("Enter Student age ");
		int age = sc.nextInt();
		// create object creation
		// Student s1 = new Student();
		Student s2 = new Student(id, name, age);
		System.out.println(s2.toString());
		sc.close();

	}

}
