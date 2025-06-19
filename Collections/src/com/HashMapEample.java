package com;

import java.util.*;

public class HashMapEample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

       
        hashMap.put(1, "Apple");
        hashMap.put(2, "Banana");
        hashMap.put(3, "Orange");

  
        hashMap.put(2, "Grapes");

        
        System.out.println("HashMap: " + hashMap);

        
        System.out.println("Value for key 1: " + hashMap.get(1));

        
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
        System.out.println("Contains key 3? " + hashMap.containsKey(3));
        System.out.println("Contains value 'Banana'? " + hashMap.containsValue("Banana"));
    }
}
