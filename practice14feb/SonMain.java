package com.practice14feb;

public class SonMain {

	public static void main(String[] args) {
		// using class reference
		Son s = new Son();
		s.land();
		s.properties();
		// using interface reference
		Father f;
		f = new Son();
		f.land();
		//f.properties();--not possible
		// using interface reference
		Mother m;
		m = new Son();
		m.properties();
		//m.land---not possible

	}

}
