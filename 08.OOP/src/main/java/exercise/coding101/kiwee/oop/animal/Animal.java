package exercise.coding101.kiwee.oop.animal;

import exercise.coding101.kiwee.oop.Sounding;

abstract class Animal implements Sounding {
    // Instance variables
    private String name;
    private int age;

    // Constructor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods for name and age
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Method to make sound
    @Override
    public String makeSound() {
        return "Some sound";
    }
}
