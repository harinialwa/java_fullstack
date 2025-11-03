package com;

import java.util.Scanner;

public class Multiples {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int num = sc.nextInt();
		
		int sum = 0;
		for(int i=3; i<=num; i+=3) {
			sum += i;
			}
		for (int i=5 ; i<=num ; i+=5)
		{
			sum += i;
		}
		System.out.println("Sum of multiples :"  + sum);
	}
}


