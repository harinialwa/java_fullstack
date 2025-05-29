package com;

class GrandFather{
	void generation1() {
		System.out.println("First Generation");
	}
}
class Father extends GrandFather{
	void generation2() {
		System.out.println("Second Generation");
	}
}
class Son extends Father{
	void generation3() {
		System.out.println("Third Generation");
	}
}
class Daughter extends Father{
	void generation4() {
		System.out.println("Fourth Generation");
	}
}
public class HybridInheritance {
	public static void main(String[] args) {
		Daughter d = new Daughter();
		Son s = new Son();
		d.generation1();
		d.generation2();
		d.generation4();
		s.generation3();
	}

}
