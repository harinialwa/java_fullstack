package com;
import java.util.Scanner;

public class MaxDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int maxDigit = 0;
		
		while(num >0) {
			int digit = num % 10;
			if(digit > maxDigit) {
				maxDigit = digit;
				
			}
			num = num/10;
		}
		System.out.println("Largest number: " + maxDigit);
		
	}

}
