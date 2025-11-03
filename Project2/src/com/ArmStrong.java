package com;
import java.util.Scanner;

public class ArmStrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int oNum = num;
		int digits = 0;
		int sum = 0;
		
		int temp = num;
		while(temp != 0) {
			temp = temp/10;
			digits++;
		}
		temp = num;
		while(temp != 0) {
			int digit = temp % 10;
			int power =1;
			for (int i=0;i<digits;i++) {
				power= power * digit;
			}
			sum = sum + power;
			temp = temp/10;
		}
	if (sum == oNum) {
		System.out.println("Arm Strong");
	}
	else {
		System.out.println("Not Arm Strong");
	}
	}
}
