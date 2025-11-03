package com;

public class StringConcat {
	public static void main(String[] args) {
        String full = "Java Programming";
        String sub = full.substring(5, 16); 
        String combined = sub + " is fun!";
        System.out.println("Substring: " + sub);
        System.out.println("Concatenated: " + combined);
    }

}
