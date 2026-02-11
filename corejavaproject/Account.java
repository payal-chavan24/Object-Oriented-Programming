package com.corejavaproject;

public class Account {
	// create variables (private)
	private String accountHoldeerName;
	private int accountNumber;
	protected double balance;

	// create constructor
	public Account(String accountHoldeerName, int accountNumber, double balance) {
		this.accountHoldeerName = accountHoldeerName;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	// deposit method
	public void deposit(double amount) {
		if (amount > 0) {
			balance = balance + amount;
			System.out.println("deposit successful....!");
		} else {
			System.out.println("invalid amount");
		}

	}

	// display method
	public void display() {
		System.out.println("Name =" + accountHoldeerName);
		System.out.println("Acount number =" + accountNumber);
		System.out.println("Balance =" + balance);
	}

}