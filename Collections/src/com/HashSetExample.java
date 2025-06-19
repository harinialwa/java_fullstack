package com;

import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Banana"); 

       
        System.out.println("HashSet: " + hashSet);

        
        for (String fruit : hashSet) {
            System.out.println("Fruit: " + fruit);
        }
    }
}

