package com.corejavaproject;
import java.util.Scanner;

public class BankMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Account Holder Name:");
        String accountHolderName = sc.nextLine();

        System.out.println("Enter Account Number:");
        int accountNumber = sc.nextInt();

        System.out.println("Enter Initial Balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter Interest Rate:");
        double interestRate = sc.nextDouble();

        SavingsAccount s1 = new SavingsAccount(accountHolderName, accountNumber, balance, interestRate);

        System.out.println("\n--- Account Details ---");
        s1.display();

        System.out.println("\nEnter Deposit Amount:");
        double amount = sc.nextDouble();
        s1.deposit(amount);

        s1.addInterest();

        System.out.println("\n--- Updated Details ---");
        s1.display();

        sc.close();
    }
}

