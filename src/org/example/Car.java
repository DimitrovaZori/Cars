package org.example;

public class Car {

    private String brand;
    private String model;
    public int year;
    public double price;

    public Car() {
        this.brand = "Not filled";
        this.model = "Not filled";
        this.year = 0;
        this.price = 0;
    }

    public Car(String brand, String model, int year, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
    }


    public static int calculateAge(int todayYear, int year) {
        return todayYear - year;
    }

    public static double calculateTax(int todayYear, int year, double price) {
        if ((todayYear - year) < 5) {
            return price * 0.05;
        } else {
            return 0;
        }

    }
}



