package com.methodoverloading;

//7️⃣ Create a class Bank
//Overload method deposit()
//Deposit int amount
//Deposit double amount
public class Bank {
//method 1
	public int deposit(int a) {
		System.out.println("this method return " + a);
		return a;
	}

	// method 2
	public double deposit(double a) {
		System.out.println("this method return " + a);
		return a;
	}

	public static void main(String args[]) {
		Bank b1 = new Bank();
		b1.deposit(500);
		b1.deposit(500.98);
	}
}
