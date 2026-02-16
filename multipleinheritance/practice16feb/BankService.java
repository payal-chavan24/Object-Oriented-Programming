package com.practice16feb;

public class BankService implements LoanService, InsuranceService {

	@Override
	public void insuranceService() {
		System.out.println("Insurance service");

	}

	@Override
	public void applyLoan() {
		System.out.println("Applying loan..!");

	}

	public static void main(String[] args) {
		BankService b = new BankService();
		b.applyLoan();
		b.insuranceService();
	}

}
