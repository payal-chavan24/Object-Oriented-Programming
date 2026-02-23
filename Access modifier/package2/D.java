package com.package2;

import com.package1.A;

public class D extends A {
	public static void main(String[] args) {
		// by making this class as child class
		D obj = new D();
		obj.display();
		// System.out.println(obj.privateVariable);
		// System.out.println(obj.defaultVariable);
		System.out.println(obj.protectedVarrible);// only possible by making child class
		System.out.println(obj.publicVarrible);

	}
}
