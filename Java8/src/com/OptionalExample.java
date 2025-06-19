package com;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.ofNullable("Hello");

        
        optional.ifPresent(val -> System.out.println("Value: " + val));

       
        System.out.println("OrElse: " + optional.orElse("Default"));
    }
}

