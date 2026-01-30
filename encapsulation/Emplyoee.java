package com.encapsulation;

//2️ Create a class Employee
//Private variables: empId, salary
//Salary should not be less than 10,000
//If invalid salary is given, print "Invalid Salary"
public class Emplyoee {
	private int empId;
	private double salary;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		if (salary < 10000) {
			System.out.println("Invalid salary");
		} else {
			this.salary = salary;
		}

	}

	@Override
	public String toString() {
		return "Emplyoee [EmpId =" + getEmpId() + ", Salary =" + getSalary() + "]";
	}
	

}
