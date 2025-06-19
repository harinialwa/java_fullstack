package com;

public class FunctionalInterfaceExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("Runnable running...");
        runnable.run();
    }
}
