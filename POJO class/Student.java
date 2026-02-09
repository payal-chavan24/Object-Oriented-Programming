package com.practicequestion9feb;

//Pojo class
public class Student {
//variables
	private int studentId;
	private String studentName;
	private int age;

	// default constructor (if complier is avoided)
	public Student() {
		System.out.println("This is default constructor");
	}

	// Parameterized constructor
	public Student(int studentId, String studentName, int age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;

	}

	// getter and setter method
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setStudentAge(int age) {
		this.age = age;
	}

	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public int getStudentAge() {
		return age;
	}
	// to string method

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + age + "]";
	}

}
