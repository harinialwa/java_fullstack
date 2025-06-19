package com;

import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Apple", "Banana", "Orange");

        
        List<String> result = list.stream()
                                  .filter(s -> s.startsWith("A"))
                                  .map(String::toUpperCase)
                                  .collect(Collectors.toList());

        System.out.println("Filtered and mapped list: " + result);
    }
}

