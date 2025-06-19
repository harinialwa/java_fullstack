package com;

import java.time.*;

public class DateTimeExample {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println("Current Date: " + date);
        System.out.println("Current Time: " + time);
        System.out.println("Current DateTime: " + dateTime);
    }
}
