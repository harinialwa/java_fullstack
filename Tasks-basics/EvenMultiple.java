package com;
import java.util.Scanner;

public class EvenMultiple {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            if (num % 5 == 0)
                System.out.println("Number is Even and Divisible by 5");
            else
                System.out.println("Number is Even But Not Divisible by 5");
        } else {
            System.out.println("Number is Odd");
        }
    }

}
