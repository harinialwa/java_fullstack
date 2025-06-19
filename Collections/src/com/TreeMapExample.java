package com;

import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();

        
        treeMap.put(3, "Orange");
        treeMap.put(1, "Apple");
        treeMap.put(2, "Banana");
        treeMap.put(4, "Grapes");

       
        System.out.println("TreeMap (sorted by keys): " + treeMap);

        
        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        
        System.out.println("First key: " + ((TreeMap<Integer, String>) treeMap).firstKey());
        System.out.println("Last key: " + ((TreeMap<Integer, String>) treeMap).lastKey());
    }
}

