package exercise.coding101.kiwee.oop.car;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CarTest {
    @Test
    void testCarInfo() {
        Car car = new SportsCar("Blue", 2023, true);
        assertEquals("Car color: Red, Year: 2022", car.carInfo());
    }

    @Test
    void testSportsCarInfo() {
        SportsCar sportsCar = new SportsCar("Blue", 2023, true);
        assertEquals("Car color: Red, Year: 2022", sportsCar.carInfo());
    }

    @Test
    void testSound() {
        SportsCar sportsCar = new SportsCar("Blue", 2023, true);
        assertEquals("Zoom!", sportsCar.makeSound());
    }
}
