package com;
import java.util.Scanner;

public class TaxCalculator {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        double tax = 0;

        if (salary < 250000) {
            tax = 0;
        } else if (salary >= 250000 && salary < 500000) {
            tax = salary * 0.05;
        } else if (salary >= 500000 && salary < 1000000) {
            tax = salary * 0.20;
        } else {
            tax = salary * 0.30;
        }

        if (tax == 0)
            System.out.println("No tax");
        else
            System.out.println("Tax to be paid: " + tax);
    }

}
