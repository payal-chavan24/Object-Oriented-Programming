package com.multipleinheritance;

public class Son implements Father, Mother {

	@Override
	public void care() {
		System.out.println("Mother caring nature");

	}

	@Override
	public void money() {
		System.out.println("Father's money");

	}

}
