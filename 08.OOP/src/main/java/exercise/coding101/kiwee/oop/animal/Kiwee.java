package exercise.coding101.kiwee.oop.animal;

public class Kiwee extends Dog {

    public Kiwee(int age) {
        super("kiwee", age, "maltipoo");
    }

    @Override
    public String makeSound() {
        return getName() + "says meow meow woof!";
    }
}
