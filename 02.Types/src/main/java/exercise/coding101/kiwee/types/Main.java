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
    }

    static double getPI() {
        double pi = Math.PI;
        return 1234.56;
    }

    static double difference(double a, int b) {
        return a - b;
    }

    static boolean isPI(double pi) {
        return false;
    }
}
