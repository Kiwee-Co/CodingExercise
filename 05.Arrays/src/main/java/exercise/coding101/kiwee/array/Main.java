package exercise.coding101.kiwee.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Array examples");

        int[] num = arraysExample();
        System.out.println(num);
        System.out.println(Arrays.toString(arraysExample()));

        System.out.println("\nArrayList example");
        List<String> arrayList = arrayListExample();
        System.out.println(arrayList);

    }

    private static int[] arraysExample() {
        // Creating an array of integers
        int[] numbers = { 10, 20, 30, 40, 50 };

        // Accessing elements in the array
        int thirdNumber = numbers[2]; // thirdNumber will be 30

        // Modifying an element in the array
        numbers[1] = 25; // Changes the second element to 25

        return numbers;
    }

    private static List<String> arrayListExample() {
        // Creating an ArrayList of strings
        List<String> fruits = new ArrayList<>();

        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Removing an element from the ArrayList
        fruits.remove(1); // Removes "Banana"

        // Accessing an element in the ArrayList
        String firstFruit = fruits.get(0); // firstFruit will be "Apple"

        return fruits;
    }
}
