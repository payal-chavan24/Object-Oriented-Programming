package com.package2;

import com.package1.A;

public class C {
	public static void main(String args[]) {
		A obj = new A();
		// System.out.println(obj.privateVarriable);
		// System.out.println(obj.defaultVariable);
		// System.out.println(obj.proctectedVariable);
		System.out.println(obj.publicVarrible);// only can access public member
		obj.display();
	}
}
