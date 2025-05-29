package com;

public class CatchExample {
	public static void main(String[] args) {
		try {
			int[] arr = new int[3];
			arr[5] = 50; 
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Error occurred.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is out of bounds.");
		}
	}
}
