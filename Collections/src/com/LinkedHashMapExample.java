package com;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();

        
        linkedHashMap.put(3, "Orange");
        linkedHashMap.put(1, "Apple");
        linkedHashMap.put(2, "Banana");
        linkedHashMap.put(4, "Grapes");

        
        System.out.println("LinkedHashMap (insertion order): " + linkedHashMap);

       
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

       
        System.out.println("Value for key 2: " + linkedHashMap.get(2));

       
        System.out.println("Contains key 3? " + linkedHashMap.containsKey(3));
        System.out.println("Contains value 'Apple'? " + linkedHashMap.containsValue("Apple"));
    }
}
