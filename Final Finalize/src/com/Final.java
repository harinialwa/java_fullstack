package com;

final class Bike {
    final int speedLimit = 100;

    final void run() {
        System.out.println("Running at speed " + speedLimit);
    }
}



public class Final {
    public static void main(String[] args) {
        Bike b = new Bike();
        b.run();

        
    }
}