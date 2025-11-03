package com;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number:");
		int n = sc.nextInt();
		System.out.println("Prime Numbers are:");
		for(int i=2; i<=n; i++) {
			boolean isPrime = true;
			
			for(int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					isPrime = false;
					break;
			}
			}
			if(isPrime) {
				System.out.print(i + " ");
			}
		}
	}

}
