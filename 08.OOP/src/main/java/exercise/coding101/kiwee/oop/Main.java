package exercise.coding101.kiwee.oop;

import exercise.coding101.kiwee.oop.animal.Kiwee;
import exercise.coding101.kiwee.oop.car.Car;
import exercise.coding101.kiwee.oop.car.SportsCar;

public class Main {

    public static void main(String[] args) {
        Car car = new SportsCar("red", 2024, true);

        // which car info?
        System.out.println(car.carInfo());
        System.out.println(new SportsCar("red", 2024, true).carInfo());

        Kiwee kiwee = new Kiwee(2);

        System.out.println(kiwee.makeSound());

    }

}
