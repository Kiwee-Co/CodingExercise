package exercise.coding101.kiwee.oop.animal;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AnimalTest {
    @Test
    void testAnimal() {
        Animal animal = new Cat("Generic Animal", 5, "Catty");
        assertEquals("Generic Animal", animal.getName());
        assertEquals(5, animal.getAge());
        assertEquals("Some sound", animal.makeSound());
    }

    @Test
    void testCat() {
        Cat cat = new Cat("Whiskers", 3, "Siamese");
        assertEquals("Whiskers", cat.getName());
        assertEquals(3, cat.getAge());
        assertEquals("Meow", cat.makeSound());
        assertEquals("Siamese", cat.getBreed());
    }

    @Test
    void testDog() {
        Dog dog = new Dog("Buddy", 4, "Labrador");
        assertEquals("Buddy", dog.getName());
        assertEquals(4, dog.getAge());
        assertEquals("Woof", dog.makeSound());
        assertEquals("Labrador", dog.getBreed());
    }

    @Test
    void testKiwee() {
        Dog dog = new Kiwee(2);
        assertEquals("Buddy", dog.getName());
        assertEquals(4, dog.getAge());
        assertEquals("Woof", dog.makeSound());
        assertEquals("Labrador", dog.getBreed());
    }

}
