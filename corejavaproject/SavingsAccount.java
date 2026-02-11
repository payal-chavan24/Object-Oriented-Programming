package com.corejavaproject;

public class SavingsAccount extends Account {

    private double interestRate;

    // Constructor 
    public SavingsAccount(String accountHolderName, int accountNumber, double balance, double interestRate) {
        super(accountHolderName, accountNumber, balance);
        this.interestRate = interestRate;
    }

    // Add Interest Method
    public void addInterest() {
        double interest = balance * interestRate / 100;
        balance = balance + interest;
        System.out.println("Interest Added Successfully!");
    }
}

