package exercise.coding101.kiwee.oop.car;

public class SportsCar extends Car {
    // Additional property
    boolean isConvertible;

    // Constructor
    public SportsCar(String c, int y, boolean iC) {
        super(c, y); // calling the constructor of the superclass
        isConvertible = iC;
    }

    // Overriding the carInfo method
    @Override
    public String carInfo() {
        String baseInfo = super.carInfo(); // calling the superclass method
        return baseInfo + ", Convertible: " + isConvertible;
    }

}
