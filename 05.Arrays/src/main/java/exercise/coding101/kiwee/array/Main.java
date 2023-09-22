package exercise.coding101.kiwee.array;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import org.apache.commons.io.FileUtils;

public class Main {

    public static void main(String[] args) {
        // now loading words from dictionary
        Set<String> dict = readDict();

        System.out.println(dict.size() + " German words loaded..\n");

        var scan = new Scanner(System.in);
        System.out.println("Enter your characters:");

        String original = scan.nextLine();

        System.out.println("Finding permutation of characters: " + original);

        Set<String> set = new TreeSet<>();
        permute(original, new char[original.length()], new boolean[original.length()], 0, set);

        System.out.println("finding possible results: " + set.size());
        // set.stream().forEach(w -> System.out.println(w));

        System.out.println("\nNow checking if any of these are German words:");

        var germanWords = set.parallelStream().filter(w -> dict.contains(w)).collect(Collectors.toSet());

        System.out.println(germanWords.size() + " possible words: ");
        germanWords.stream().forEach(w -> System.out.println(w));
    }

    private static void permute(String original, char[] chars, boolean[] taken, int current, Set<String> results) {
        if (current == chars.length) {
            results.add(String.valueOf(chars));
            return;
        }

        for (int i = 0; i < original.length(); i++) {
            if (!taken[i]) {
                chars[current] = original.charAt(i);
                taken[i] = true;
                permute(original, chars, taken, current + 1, results);
                taken[i] = false;
            }

        }

    }

    private static Set<String> readDict() {
        ClassLoader classLoader = Main.class.getClassLoader();

        try {
            return new TreeSet<>(FileUtils.readLines(new File(classLoader.getResource("words.txt").getFile()), "UTF-8"));
        } catch (IOException ioe) {
            ioe.printStackTrace();
            return Collections.emptySet();
        }
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
