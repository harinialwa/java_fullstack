package com;

public class TernaryOperator {

	public static void main(String[] args) {
		 int marks = 96;
		 
		 String grade = (marks > 90 && marks <= 100) ? "A" :
             (marks > 70 && marks <= 90) ? "B" :
             (marks > 50 && marks <= 70) ? "C" :
             (marks > 0 && marks <= 50) ? "Fail": "Invalid";

		 System.out.println("Grade: " + grade);
	}
}
