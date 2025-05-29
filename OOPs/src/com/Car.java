package com;

public class Car {
	int speed;
	String brand;
	
	Car(int speed, String brand){
		this.speed = speed;
		this.brand = brand;
	}
	void displayInfo() {
		System.out.println("Brand: " + brand + ", Speed: " + speed);
	}
	
	public static void main(String[] args) {
		Car c1 = new Car(200, "BMW");
		c1.displayInfo();
	}

}
