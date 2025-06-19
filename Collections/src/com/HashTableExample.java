package com;

import java.util.*;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

      
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Orange");

        
        System.out.println("Hashtable: " + hashtable);

        
        System.out.println("Value for key 2: " + hashtable.get(2));

       
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
        System.out.println("Contains key 1? " + hashtable.containsKey(1));
        System.out.println("Contains value 'Orange'? " + hashtable.containsValue("Orange"));
    }
}
