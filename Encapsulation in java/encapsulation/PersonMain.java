package com.encapsulation;

public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.setName("Riya");
		p1.setAge(21);
		System.out.println("Name =" + p1.getName());
		System.out.println("Age =" + p1.getAge());
	}

}