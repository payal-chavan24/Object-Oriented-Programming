package com.encapsulation;

public class EmplyoeeMain {

	public static void main(String[] args) {
		Emplyoee e1=new Emplyoee();
		e1.setEmpId(98);
		e1.setSalary(34000.0);
//		System.out.println("Emplyoee Id ="+e1.getEmpId());
//		System.out.println("Emplyoee Salary ="+e1.getsalary());
		System.out.println(e1);//we get output because we have use toString() method
	}

}
