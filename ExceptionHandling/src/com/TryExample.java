package com;

public class TryExample {
	public static void main(String[] args) {
		try {
			int a = 10, b = 0;
			int result = a / b; // This will throw ArithmeticException
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Cannot divide by zero.");
		}
	}
}
