package com.package1;

public class B {
	public static void main(String args[]) {
		A obj = new A();
		// System.out.println(obj.privateVarriable);// because of variable is
		// as private so it can not accessed through in another class it only access by
		// in same class
		System.out.println(obj.defaultVarriable);
		System.out.println(obj.protectedVarrible);
		System.out.println(obj.publicVarrible);

	}
}
