package com.practice16feb;

public class PaymentGateway implements UPIPayment, CardPayment {

	@Override
	public void payUsingCard() {
		System.out.println("Payment done by card...!");

	}

	@Override
	public void payUsingUPI() {
		System.out.println("Payment done by upi...!");

	}

	public static void main(String[] args) {
		PaymentGateway p = new PaymentGateway();
		p.payUsingCard();
		p.payUsingUPI();
	}

}
