package com;

class Animal2{
	void eat() {
		System.out.println("Eating...");
	}
}
class Dog2 extends Animal2{
	void bark() {
		System.out.println("Barking...");
	}
}
class Cat extends Animal2{
	void meow() {
		System.out.println("meowing...");
	}
}
public class HierarchicalInheritance {
	public static void main(String[] args) {
		Cat c = new Cat();
		Dog2 d = new Dog2();
		c.eat();
		d.bark();
		c.meow();
	}

}
