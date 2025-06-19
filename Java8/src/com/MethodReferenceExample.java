package com;

import java.util.*;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("X", "Y", "Z");

      
        list.forEach(System.out::println);
    }
}
