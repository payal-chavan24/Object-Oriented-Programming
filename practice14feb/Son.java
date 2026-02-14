package com.practice14feb;

public class Son implements Mother, Father {

	@Override
	public void land() {
		System.out.println("Father properties");

	}

	@Override
	public void properties() {
		System.out.println("Mother properties");

	}

}
