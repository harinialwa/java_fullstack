package com;

class Employee {
	private String name;
	private int age;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 18) {
			this.age = age;
		} else {
			System.out.println("Age must be greater than 18");
		}
	}
}

public class Encapsulation {
	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setName("Harini");
		emp.setAge(21);

		System.out.println("Employee Name: " + emp.getName());
		System.out.println("Employee Age: " + emp.getAge());

		emp.setAge(15);
	}
}
