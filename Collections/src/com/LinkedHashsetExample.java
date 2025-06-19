package com;

import java.util.*;

public class LinkedHashsetExample {
    public static void main(String[] args) {
        Set<String> linkedHashSet = new LinkedHashSet<>();

        // Adding elements
        linkedHashSet.add("Banana");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana"); 

        System.out.println("LinkedHashSet: " + linkedHashSet);

     
        for (String fruit : linkedHashSet) {
            System.out.println("Fruit: " + fruit);
        }
    }
}

