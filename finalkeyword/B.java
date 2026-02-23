package com.finalkeyword;

//Question 2
//Write a Java program where:
//A class has a final method.
//Another class tries to extend it.
//Try to override the final method.
class B {
	final void method() {// we can not override final method
		System.out.println("this is final method");
	}

	class C extends B {
//	final void method() {//it will give complie error
//		System.out.println("this is final method");
//	}
	}

}
