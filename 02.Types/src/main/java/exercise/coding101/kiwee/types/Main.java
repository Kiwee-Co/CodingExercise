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
