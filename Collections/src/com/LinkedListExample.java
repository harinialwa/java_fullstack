package com;

import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.addFirst("Start");
        linkedList.addLast("End");

        System.out.println("LinkedList: " + linkedList);


        System.out.println("First Element: " + linkedList.getFirst());
        System.out.println("Last Element: " + linkedList.getLast());

       
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.remove("B");

        System.out.println("LinkedList after removals: " + linkedList);

        
        Iterator<String> iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("Element: " + iterator.next());
        }
    }
}
