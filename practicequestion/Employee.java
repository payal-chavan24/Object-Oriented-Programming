package com.practicequestion;

//create a class employee with private salary,
//and validation in setter:salary must be>0,otherwise print error,
public class Employee {
	private double salary;

	public void setSalary(double salary) {
		if (salary > 0) {
			this.salary += salary;
		} else {
			System.out.println("Error");
		}
	}

	public double getSalary() {
		return salary;
	}
}
