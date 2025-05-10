package com;
import java.util.Scanner;

public class IfStatements {
	
	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		
		if(num>90 && num <= 100) {
			System.out.println("Grade A");
		}
		
		else if (num > 70 && num <= 90) {
			System.out.println("Grade B");
		}
		
		else if (num >50 && num <= 70) {
			System.out.println("Grade C");
		}
		else if (num > 0 && num <= 50) {
			System.out.println("Fail");
		}
		else {
			System.out.println("Invalid");
		}
		sc.close();
		
	}

}
