package com.encapsulation;

public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount();
		acc.deposit(1000);
		acc.withdrow(500);
		System.out.println("Total Balance  =" + acc.getBalance()+" Rupees");
	}

}
