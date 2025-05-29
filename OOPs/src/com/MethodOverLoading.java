package com;

class Calculation{
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return a+b;
	}
}
public class MethodOverLoading {
	public static void main(String[] args) {
		Calculation c = new Calculation();
		System.out.println(c.add(2, 5));
		System.out.println(c.add(2.5, 5.0));
	}

}
