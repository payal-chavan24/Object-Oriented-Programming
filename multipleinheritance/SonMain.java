package com.multipleinheritance;

public class SonMain {

	public static void main(String[] args) {
		Son s = new Son();// child class object cration 1 option
		s.care();
		s.money();
		// 2 option by refrence creation
		Father f = new Son();// here we can also crete refernce creation of mother interface
		f.money();
		// f.care(); not allowed because refernce creation of father
		Son s1 = (Son) f;
		s1.care();// down casting

	}

}
