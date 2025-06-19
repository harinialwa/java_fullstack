package com;

interface MyInterface {
    void show();

    default void print() {
        System.out.println("Default print method in interface");
    }
}

public class DefaultMethodExample implements MyInterface {
    public void show() {
        System.out.println("Show method");
    }

    public static void main(String[] args) {
        DefaultMethodExample obj = new DefaultMethodExample();
        obj.show();
        obj.print();
    }
}
