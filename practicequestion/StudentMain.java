package com.practicequestion;

public class StudentMain {

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setId(89);
		s1.setId("Payal");
		System.out.println("Student id =" + s1.getId());
		System.out.println("Student Name =" + s1.getName());

	}

}
