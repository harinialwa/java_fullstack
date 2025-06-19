package com;

import java.util.*;

public class LambdaExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C", "D");

       
        list.forEach(item -> System.out.println("Item: " + item));
    }
}
