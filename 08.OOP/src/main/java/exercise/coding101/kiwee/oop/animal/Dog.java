package exercise.coding101.kiwee.oop.animal;

public class Dog extends Animal {
    // Additional property
    private String breed;

    // Constructor
    Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Overriding makeSound method
    @Override
    public String makeSound() {
        return "Woof";
    }

    // Method specific to Dog
    public String getBreed() {
        return breed;
    }
}
