package exercise.coding101.kiwee.types;

public class Main {

    public static void main(String[] args) {
        declareAndAssign();
    }

    static void declareAndAssign() {
        // Declare an integer variable
        int age;

        // Declare a double variable
        double price;

        // Declare a boolean variable
        boolean isTrue;

        // Declare a string variable
        String name;

        /*
         * now assignment
         */

        // Assign a value to the age variable
        age = 10;

        // Assign a value to the price variable
        price = 19.99;

        // Assign a value to the isTrue variable
        isTrue = true;

        // Assign a value to the name variable
        name = "John Doe";

        // s formats strings.
        // d formats decimal integers.
        // f formats floating-point numbers.

        System.out.printf("age:     %s %d \n", age, age);
        System.out.printf("price:   %s %f \n", price, price);
        System.out.printf("isTrue:  %s\n", isTrue);
        System.out.printf("name:    %s\n", name);

        doublePrecision();

        overflow();
    }

    // IEEE 754: https://en.wikipedia.org/wiki/IEEE_754
    private static void doublePrecision() {
        System.out.printf("double precision error: %s\n", difference(1.0, 0.9));

        System.out.println("doubles: ");
        System.out.println(0.1 + 0.2);
        System.out.println(1.1 + 1.2);
        System.out.println(0.1f + 0.2f);

    }

    private static void overflow() {
        System.out.println("overflow: ");
        System.out.printf("max +1: %s", maxValue());
    }

    static int maxValue() {
        return Integer.MAX_VALUE + 1;
    }

    static double getPI() {
        double pi = Math.PI;
        return 1234.56;
    }

    static double difference(double a, double b) {
        return a - b;
    }

    static double difference(double a, int b) {
        return a - b;
    }

    static boolean isPI(double pi) {
        return false;
    }
}
