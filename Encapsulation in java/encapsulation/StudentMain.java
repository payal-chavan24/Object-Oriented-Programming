package com.encapsulation;

public class StudentMain {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.setName("rahul");
		s1.setMarks(-6);//as we have printing statements in else block 
		//if condition is false so else block will execute it print first on console
		System.out.println("Studeent name ="+s1.getName());
		System.out.println("Student marks ="+s1.getMarks());//as condition 
	}

}
