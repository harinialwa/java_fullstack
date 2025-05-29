package com;

public class ThrowExample {
	public static void validateAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Age must be 18 or older.");
		} else {
			System.out.println("Valid age for voting.");
		}
	}

	public static void main(String[] args) {
		validateAge(16);
	}
}
