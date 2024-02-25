package org.example;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Car blank = new Car();
        Car bmw = new Car("BMW", "X5", 2003, 24500);
        Car skoda = new Car("Skoda", "Superb III", 2020, 36500);
        Car toyota = new Car("Toyota", "Yaris", 2016, 20500);

        //  LocalDate today = LocalDate.now();
        int todayYear = LocalDate.now().getYear();
        System.out.println("The years of the car are: " + Car.calculateAge(todayYear, skoda.year));
        System.out.printf("The tax is %.2f. %n",Car.calculateTax(todayYear, skoda.year, skoda.price));

    }
}
