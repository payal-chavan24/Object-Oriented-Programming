package com.thiskeyword;

//🔥 Practice 4 – Use this to Return Current Object
//Create class Demo:
//Method setValue(int x)
//Return current object using this
//In main, use method chaining like:
public class Demo {
	int x;

	public void setValue(int x) {
		this.x = x;
		this.getValue();
	}

	public void getValue() {
		System.out.println(x);
	}

	public static void main(String[] args) {
		Demo d = new Demo();
		d.setValue(8);
	}
}
