package com;

public class UnaryOperator {
	
	public static void main(String[] args) {
		
		short a = 3;
		short b = -5;
		
		int posA = +a;
		System.out.println(posA);
		
		int negB = -b;
		System.out.println(negB);
		
		boolean val = true;
		System.out.println(!val);
		
		int poincrement = a++;
		System.out.println(poincrement);
		
		int podecrement = b--;
		System.out.println(podecrement);
		
		int princrement = ++a;
		System.out.println(princrement);
		
		int prdecrement = --b;
		System.out.println(prdecrement);
		
	}

}
