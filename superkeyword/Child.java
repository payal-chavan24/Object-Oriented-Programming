package com.superkeyword;

public class Child extends Parent {
	int x = 67;

	Child() {
		super();// by default it will call and if there is arugment constructor is there
		// then explicit we should call and it should first statement in constructor
		System.out.println("Child constructor");
	}

	public void method1() {
		System.out.println("Parent variable =" + super.x);// we can parent method by using super keyword
		System.out.println("Child variable =" + x);
	}

	public void method2() {
		System.out.println("Child method");
	}

	public void callMethod() {
		method2();
		super.display();// we can call parents method using super.
	}

	public static void main(String[] args) {
		Child c = new Child();
		c.method1();
		c.callMethod();
	}

}
