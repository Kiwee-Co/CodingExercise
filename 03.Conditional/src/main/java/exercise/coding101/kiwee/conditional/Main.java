package exercise.coding101.kiwee.conditional;

import static exercise.coding101.kiwee.conditional.Main.Status.Negative;
import static exercise.coding101.kiwee.conditional.Main.Status.Positive;
import static exercise.coding101.kiwee.conditional.Main.Status.Zero;

public class Main {

    public static void main(String[] args) {
        System.out.println(numberCheck(123));
        System.out.println(numberCheck(-2));

        System.out.println("is 2024 a leap year? " + leapYear(2024));
    }

    static Status numberStatusCheck(int num) {
        if (num > 0) {
            return Positive;
        }

        if (num < 0) {
            return Negative;
        }

        return Zero;

    }

    static String numberCheck(int number) {
        // if - else if - else; can we do better?

        if (number > 0) {
            return "The number " + number + " is positive.";
        } else if (number < 0) {
            return "The number " + number + " is negative.";
        } else {
            return "The number " + number + " is zero.";
        }
    }

    static boolean leapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static enum Status {
        Positive, Negative, Zero
    }

}
