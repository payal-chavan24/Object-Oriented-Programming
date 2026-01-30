package com.encapsulation;

//3️⃣ Create a class BankAccount
//Private variable: balance
//Methods:
//deposit(double amount) → amount must be > 0
//withdraw(double amount) → cannot withdraw more than balance
//getBalance()
//Test all cases in main method
public class BankAccount {
	private double balance;

	public void deposit(double amount) {
		if (amount > 0) {
			this.balance += amount;
		} else {
			System.out.println("invalid deposit amount");
		}
	}

	public void withdrow(double amount) {
		if (amount>0&&amount<=balance) {
			this.balance -= amount;
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public double getBalance() {
		return balance;
	}

}
