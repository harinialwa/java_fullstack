package com;

import java.util.*;

class Employee {
    String name;
    int age;

    Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + ": " + age;
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("David", 45));
        employees.add(new Employee("Eve", 30));
        employees.add(new Employee("Frank", 50));

        employees.sort(Comparator.comparingInt(emp -> emp.age));

        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
