package com;

public class FinalExample {
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.length()); 
		} catch (NullPointerException e) {
			System.out.println("Caught a NullPointerException.");
		} finally {
			System.out.println("This block always executes.");
		}
	}
}
