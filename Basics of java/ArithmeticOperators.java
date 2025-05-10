package com;

public class ArithmeticOperators {
	
	public static void main(String[] args) {
		
		int a = 5;
		int b = 20;
		float c = 4.5f;
		float d = 2.7f;
		
		System.out.println(a + "+" + b + "->" + (a+b));
		System.out.println(a + "-" + b + "->" + (a-b));
		System.out.println(a + "*" + b + "->" + (a*b));
		System.out.println(a + "/" + b + "->" + (a/b));
		System.out.println(a + "%" + b + "->" + (a%b));
		
		System.out.println(a + "+" + c + "->" + (a+c));
		System.out.println(b + "-" + d + "->" + (b-d));
		System.out.println(a + "*" + d + "->" + (a*d));
		System.out.println(b + "/" + c + "->" + (b/c));
		System.out.println(a + "%" + d + "->" + (a%d));
	}

}
