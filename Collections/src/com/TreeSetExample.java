package com;

import java.util.*;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> treeSet = new TreeSet<>();

        treeSet.add("Banana");
        treeSet.add("Apple");
        treeSet.add("Orange");

        
        System.out.println("TreeSet (sorted): " + treeSet);

        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println("Fruit: " + iterator.next());
        }
    }
}
