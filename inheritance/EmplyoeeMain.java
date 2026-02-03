package com.inheritance;

public class EmplyoeeMain {

	public static void main(String[] args) {
		Manger em = new Manger();
		String name = em.name = "Suresh Sharma";
		System.out.println("Emplyoee Name =" + name);
		double sal = em.salary = 56000;
		System.out.println("Emplyoee salary =" + sal);
		em.department();

	}

}
