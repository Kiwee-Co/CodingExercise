package exercise.coding101.kiwee.oop.car;

import exercise.coding101.kiwee.oop.Sounding;

public class Car implements Sounding {
    // Instance variables
    String color;
    int year;

    // Constructor
    Car(String c, int y) {
        color = c;
        year = y;
    }

    // Method to display car information
    public String carInfo() {
        return "Car color: " + color + ", Year: " + year;
    }

    @Override
    public String makeSound() {
        return "bubu";
    }
}
