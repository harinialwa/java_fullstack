package com;

import java.util.*;

class Student implements Comparable<Student> {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public int compareTo(Student other) {
        return this.marks - other.marks;
    }

    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparableExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 75));
        students.add(new Student("Charlie", 90));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
