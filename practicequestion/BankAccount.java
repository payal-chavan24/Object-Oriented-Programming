package com.practicequestion;

//create a BankAccount using encapsulation with private balance 
//and method: deposit(),withdraw(),getBalance(). and perform opertion in main.
public class BankAccount {
	private double balance;

	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
		} else {
			System.out.println("Invalid");
		}
	}

	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
		} else {
			System.out.println("insuffcient balance");
		}
	}

	public double getBalance() {
		return balance;
	}
}
