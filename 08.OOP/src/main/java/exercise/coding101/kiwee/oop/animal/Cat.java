package exercise.coding101.kiwee.oop.animal;

public class Cat extends Animal {
    // Additional property
    private String breed;

    // Constructor
    Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Overriding makeSound method
    @Override
    public String makeSound() {
        return "Meow";
    }

    // Method specific to Cat
    public String getBreed() {
        return breed;
    }
}
