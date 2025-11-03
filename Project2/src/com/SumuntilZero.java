package com;
import java.util.Scanner;

public class SumuntilZero {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int sum = 0;
		int num= -1;
		
		while(true){
			System.out.print("Enter Numbers until 0:");
			num = sc.nextInt();
			if(num==0) {
				break;
			}
			sum += num;
		}
		System.out.println("Result" +sum);
	}
}
