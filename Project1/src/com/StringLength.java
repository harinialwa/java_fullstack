package com;

public class StringLength {
    public static void main(String[] args) {
        String name = "Java Full Stack";
        System.out.println("Length: " + name.length());
        System.out.println("First character: " + name.charAt(0));
        System.out.println("Last character: " + name.charAt(name.length() - 1));
    }
}
