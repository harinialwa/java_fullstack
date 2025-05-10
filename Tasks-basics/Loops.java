package com;
import java.util.Scanner;

public class Loops {
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter String:");
		String text = sc.nextLine();
		
		for(int i=0; i<text.length(); i++) {
			System.out.println(text.charAt(i));
		}
		
	}

}
