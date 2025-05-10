package com;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number:");
		int num = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				evenSum += i;
			}
			else {
				oddSum += i;
			}
		}
		System.out.println("Even Numbers:" + evenSum);
		System.out.println("Odd Numbers:" + oddSum);
		
	}

}
