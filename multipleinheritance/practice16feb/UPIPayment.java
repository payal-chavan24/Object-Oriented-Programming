package com.practice16feb;

//2. Online Payment System
//Create two interfaces:
//UPIPayment â†’ method payUsingUPI()
//CardPayment â†’ method payUsingCard()
//Create a class PaymentGateway that implements both interfaces.
public interface UPIPayment {
	public abstract void payUsingUPI();
}
