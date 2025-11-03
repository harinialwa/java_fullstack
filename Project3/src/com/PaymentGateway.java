package com;

import java.util.Scanner;

public class PaymentGateway {

    public void makePayment() {
        System.out.println("You selected: Cash on Delivery");
        System.out.println("Payment will be collected at the time of delivery.");
    }

    public void makePayment(String cardNumber, String name, String expiry, int cvv) {
        System.out.println("You selected: Card Payment");
        System.out.println("Processing card for " + name);
        System.out.println("Payment successful using Card.");
    }

    public void makePayment(String upiId) {
        System.out.println("You selected: UPI");
        System.out.println("Processing UPI ID: " + upiId);
        System.out.println("Payment successful using UPI.");
    }

    public void makePayment(String bankName, String username, String password) {
        System.out.println("You selected: Net Banking");
        System.out.println("Logged into " + bankName + " as " + username);
        System.out.println("Payment successful using Net Banking.");
    }

    public void makePayment(String walletName, double amount) {
        System.out.println("You selected: Wallet");
        System.out.println("Paid ₹" + amount + " using " + walletName + " wallet.");
        System.out.println("Payment successful using Wallet.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PaymentGateway pg = new PaymentGateway();

        System.out.println("Choose a payment method:");
        System.out.println("1. Cash on Delivery (COD)");
        System.out.println("2. Card");
        System.out.println("3. UPI");
        System.out.println("4. Net Banking");
        System.out.println("5. Wallet");
        System.out.print("Enter your choice (1-5): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                pg.makePayment();
                break;
            case 2:
                scanner.nextLine(); 
                System.out.print("Enter Card Number: ");
                String card = scanner.nextLine();
                System.out.print("Enter Cardholder Name: ");
                String name = scanner.nextLine();
                System.out.print("Enter Expiry (MM/YY): ");
                String expiry = scanner.nextLine();
                System.out.print("Enter CVV: ");
                int cvv = scanner.nextInt();
                pg.makePayment(card, name, expiry, cvv);
                break;
            case 3:
                scanner.nextLine();
                System.out.print("Enter UPI ID: ");
                String upi = scanner.nextLine();
                pg.makePayment(upi);
                break;
            case 4:
                scanner.nextLine();
                System.out.print("Enter Bank Name: ");
                String bank = scanner.nextLine();
                System.out.print("Enter Username: ");
                String user = scanner.nextLine();
                System.out.print("Enter Password: ");
                String pass = scanner.nextLine();
                pg.makePayment(bank, user, pass);
                break;
            case 5:
                scanner.nextLine();
                System.out.print("Enter Wallet Name: ");
                String wallet = scanner.nextLine();
                System.out.print("Enter Amount: ");
                double amt = scanner.nextDouble();
                pg.makePayment(wallet, amt);
                break;
            default:
                System.out.println("Invalid choice!");
        }

        scanner.close();
    }
}

