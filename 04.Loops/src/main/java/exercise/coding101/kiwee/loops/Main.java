package exercise.coding101.kiwee.loops;

public class Main {

    public static void main(String[] args) {
        // Using a for loop to count from 1 to 5
        System.out.println("Counting from 1 to 5 using a for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println(); // Print a newline

        // Using a while loop to play a game with lives
        System.out.println("\nPlaying a game with lives using a while loop:");
        int lives = 3;
        while (lives > 0) {
            System.out.println("You have " + lives + " lives left.");
            lives--;
        }

        // Using a break statement to exit a loop early
        System.out.println("\nUsing a break statement to exit a loop early:");
        for (int num = 1; num <= 10; num++) {
            if (num == 6) {
                System.out.println("Found the number 6! Exiting loop.");
                break;
            }
            System.out.println("Number: " + num);
        }

        // Using a continue statement to skip an iteration
        System.out.println("\nUsing a continue statement to skip an iteration:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping iteration for i = 3.");
                continue;
            }
            System.out.println("Current value of i: " + i);
        }

        // Solving a problem using a loop: Counting apples
        System.out.println("\nSolving a problem using a loop: Counting apples in a basket:");
        int applesInBasket = 8;
        for (int count = 1; count <= applesInBasket; count++) {
            System.out.println("Counted " + count + " apple(s) in the basket.");
        }

        // Solving a problem using a loop: Summation
        System.out.println("\nSolving a problem using a loop: Summing numbers from 1 to 10:");
        int sum = 0;
        for (int num = 1; num <= 10; num++) {
            sum += num;
        }
        System.out.println("Sum of numbers from 1 to 10: " + sum);

        // Iterating over a list of favorite animals
        System.out.println("\nIterating over a list of favorite animals:");
        String[] favoriteAnimals = { "Dog", "Cat", "Elephant", "Giraffe", "Kiwee" };
        for (String animal : favoriteAnimals) {
            System.out.println("One of my favorite animals: " + animal);
        }
    }

    static String countingForLoop() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            result.append(i).append(" ");
        }
        return result.toString();
    }

    static String playingGameWhileLoop() {
        StringBuilder result = new StringBuilder();
        int lives = 3;
        while (lives > 0) {
            result.append("You have ").append(lives).append(" lives left.\n");
            lives--;
        }
        return result.toString();
    }

    static String loopWithBreak() {
        StringBuilder result = new StringBuilder();
        for (int num = 1; num <= 10; num++) {
            result.append("Number: ").append(num).append("\n");
            if (num == 3) {
                result.append("Found the number 3! Exiting loop.\n");
                break;
            }
        }
        return result.toString();
    }

    static String loopWithContinue() {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                result.append("Skipping iteration for i = 3.\n");
                continue;
            }
            result.append("Current value of i: ").append(i).append("\n");
        }
        return result.toString();
    }

    static String countingApples() {
        StringBuilder result = new StringBuilder();
        int applesInBasket = 8;
        for (int count = 1; count <= applesInBasket; count++) {
            result.append("Counted ").append(count).append(" apple(s) in the basket.\n");
        }
        return result.toString();
    }

    static int summationLoop() {
        int sum = 0;
        for (int num = 1; num <= 10; num++) {
            sum += num;
        }
        return sum;
    }

    static String iteratingFavoriteAnimals() {
        StringBuilder result = new StringBuilder();
        String[] favoriteAnimals = { "Dog", "Cat", "Elephant", "Giraffe", "Kiwee" };
        for (String animal : favoriteAnimals) {
            result.append("One of my favorite animals: ").append(animal).append("\n");
        }
        return result.toString();
    }

}
