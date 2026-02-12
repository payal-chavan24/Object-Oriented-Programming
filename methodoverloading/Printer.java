package com.methodoverloading;

//3️⃣ Create a class Printer with overloaded method print()
//Print an integer
//Print a string
//Print a double
public class Printer {
	// method 1
	public int print(int a) {
		System.out.println("integer =" + a);
		return a;
	}

	// method 2
	public String print(String a) {
		System.out.println("String =" + a);
		return a;

	}

	// method 3
	public double print(double a) {
		System.out.println("double =" + a);
		return a;
	}

	public static void main(String args[]) {
		Printer p1 = new Printer();
		p1.print(8);
		p1.print("Rahul");
		p1.print(345.98);

	}
}
