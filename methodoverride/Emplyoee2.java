package com.methodoverride;

class Employee {
	void work() {
		System.out.println("Employee is working");
	}
}

class Manager extends Employee {
	void work() {
		System.out.println("Manager is managing");
	}
}

class Developer extends Employee {
	void work() {
		System.out.println("Developer is coding....!");
	}
}

class TestEmployee {
	public static void main(String[] args) {
		Employee e;

		e = new Manager();
		e.work(); // Manager is managing

		e = new Developer();
		e.work(); // Developer is coding
	}
}
