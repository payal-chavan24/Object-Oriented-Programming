package com.methodoverloading;

//6️⃣ Write a program where method display()
//Takes no argument
//Takes one argument
//Takes two arguments
public class Showing {
//method 1
	public void display() {
		System.out.println("This method takes no argument");
	}

	public int display(int a) {
		System.out.println("this method return  " + a + " " + "value");
		return a;

	}

	public String display(int a, String b) {
		System.out.println("thery are " + a + b);
		return a + b;
	}

	public static void main(String args[]) {
		Showing sho = new Showing();
		sho.display();
		sho.display(1);
		sho.display(2, " method");
	}

}
