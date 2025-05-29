package com;

interface Character {
	void attack();
}

interface Weapon {
	void use();
}

class Warrior implements Character, Weapon {
	public void attack() {
		System.out.println("Warrior attacks with a sword.");
	}

	public void use() {
		System.out.println("Warrior uses a sword.");
	}
}

class Mage implements Character, Weapon {
	public void attack() {
		System.out.println("Mage attacks with a wand.");
	}

	public void use() {
		System.out.println("Mage uses a wand.");
	}
}

public class MultipleInheritance {
	public static void main(String[] args) {
		Warrior warrior = new Warrior();
		Mage mage = new Mage();

		warrior.attack();
		warrior.use();

		mage.attack();
		mage.use();
	}
}