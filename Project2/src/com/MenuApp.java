package com;
import java.util.Scanner;

public class MenuApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Menu:");
        System.out.println("1. Chicken 65");
        System.out.println("2. Paneer");
        System.out.println("3. Biryani");
        System.out.println("4. Dosa");
        System.out.println("5. Pizza");
        
        System.out.print("Enter your option: ");
        int option = sc.nextInt();

        if (option == 1)
            System.out.println("Your Chicken 65 order placed successfully.");
        else if (option == 2)
            System.out.println("Your Paneer order placed successfully.");
        else if (option == 3)
            System.out.println("Your Biryani order placed successfully.");
        else if (option == 4)
            System.out.println("Your Dosa order placed successfully.");
        else if (option == 5)
            System.out.println("Your Pizza order placed successfully.");
        else
            System.out.println("Invalid option!");
		
			
	}
	

}
