package com;


interface Payment {
	void makePayment(double amount);
}


abstract class OnlinePayment {
	String transactionId;

	
	OnlinePayment() {
		this.transactionId = generateTransactionId();
	}

	
	void showTransactionId() {
		System.out.println("Transaction ID: " + transactionId);
	}

	
	String generateTransactionId() {
		return "TXN" + System.currentTimeMillis();
	}
}


class CreditCardPayment extends OnlinePayment implements Payment {
	public void makePayment(double amount) {
		System.out.println("Paid ₹" + amount + " using Credit Card.");
		showTransactionId();
	}
}


class UPIPayment extends OnlinePayment implements Payment {
	public void makePayment(double amount) {
		System.out.println("Paid ₹" + amount + " using UPI.");
		showTransactionId();
	}
}

public class Abstraction {
	public static void main(String[] args) {
		Payment payment1 = new CreditCardPayment();
		payment1.makePayment(1500.00);

		System.out.println();

		Payment payment2 = new UPIPayment();
		payment2.makePayment(999.99);
	}
}
