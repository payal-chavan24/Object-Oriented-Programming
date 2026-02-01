package com.practicequestion;

public class PersonMain {

	public static void main(String[] args) {
		Person p1=new Person(22,"Payal");
		p1.displayInfo();
		Person p2=new Person(p1);
		p2.displayInfo();
	}

}
