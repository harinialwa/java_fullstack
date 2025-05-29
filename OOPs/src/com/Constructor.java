package com;

class Student {
	String name;
	int age;

	Student() {
		name = "john";
		age = 0;
		System.out.println("Default Constructor");
	}

	Student(String n, int a) {
		name = n;
		age = a;
		System.out.println("Parametarized Constructor");
	}

	Student(String n) {
		name = n;
		age = 128;
		System.out.println("Constructor OverLoading");
	}

	void display() {
		System.out.println("Name: " + name + ", Age: " + age);
	}
}

public class Constructor {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.display();
		System.out.println();
		Student s2 = new Student("Harini", 21);
		s2.display();
		System.out.println();
		Student s3 = new Student("Ravi");
		s3.display();
	}

}
