package com;

class MyObject {
	protected void finalize() {
		System.out.println("finalize() method called before object is destroyed");
	}
}

public class Finalize {
	public static void main(String[] args) {
		MyObject obj = new MyObject();
		obj = null;

		System.gc();
		System.out.println("Main method complete");
	}
}
