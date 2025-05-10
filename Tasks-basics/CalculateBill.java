package com;
import java.util.Scanner;

public class CalculateBill {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of products: ");
        int products = sc.nextInt();

        System.out.println("Is premium user (true/false): ");
        boolean isPremium = sc.nextBoolean();

        int costPerProduct = 1000;
        int discountPerProduct = isPremium ? 100 : 0;

        int totalCost = products * costPerProduct;
        int totalDiscount = products * discountPerProduct;

        int finalBill = totalCost - totalDiscount;

        System.out.println("Final Bill: " + finalBill);
    }

}
