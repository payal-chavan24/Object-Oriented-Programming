package com.practicequestion;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		b1.deposit(1000);
		b1.withdraw(600);
		System.out.println("total balance " + b1.getBalance());
	}

}
