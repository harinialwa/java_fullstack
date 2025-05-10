package com;
import java.util.Scanner;

public class CalculatorApp {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter operation (+, -, *, /, %): ");
	        String op = sc.nextLine();

	        System.out.print("Enter first number: ");
	        Double num1 = sc.nextDouble();

	        System.out.print("Enter second number: ");
	        Double num2 = sc.nextDouble();

	        switch (op) {
	            case "+":
	                System.out.println("Result: " + (num1 + num2));
	                break;
	            case "-":
	                System.out.println("Result: " + (num1 - num2));
	                break;
	            case "*":
	                System.out.println("Result: " + (num1 * num2));
	                break;
	            case "/":
	                System.out.println("Result: " + (num1 / num2));
	                break;
	            case "%":
	                System.out.println("Result: " + (num1 % num2));
	                break;
	            default:
	                System.out.println("Invalid operation!");
	        }
	    }

}
