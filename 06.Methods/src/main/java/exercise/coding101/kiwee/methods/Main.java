package exercise.coding101.kiwee.methods;

public class Main {

    public static void main(String[] args) {
        getDressed();

        setTable();

        int result = plus(5, 3);
        System.out.println("The result of 5 + 3 is: " + result);

        drawCircle();
        drawSquare();
        drawTriangle();

        System.out.println("\nNow here's my morning routine:");
        morningRoutine();

    }

    public static void getDressed() {
        System.out.println("Getting Dressed");
        System.out.println("\tPut on a shirt.");
        System.out.println("\tWear pants.");
        System.out.println("\tPut on socks.");
        System.out.println("\tWear shoes.");
    }

    public static void setTable() {
        System.out.println("1. Place plates on the table.");
        System.out.println("2. Put forks, knives, and spoons in their places.");
        System.out.println("3. Add glasses for drinks.");
    }

    public static int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static void drawCircle() {
        System.out.println("Drawing a circle: O");
    }

    public static void drawSquare() {
        System.out.println("Drawing a square: []");
    }

    public static void drawTriangle() {
        System.out.println("Drawing a triangle: /\\");
    }

    public static void morningRoutine() {
        // Start the day
        wakeUp();

        brushTeeth();
        getDressed();
        haveBreakfast();
        grabBackpack();
        goToSchool();
    }

    public static void wakeUp() {
        System.out.println("Waking up from bed...");

        if (Math.random() > 0.5) {
            System.out.println("\tTrying.....");
            wakeUp();
            return;
        }

        System.out.println("\tAwake!");
    }

    public static void brushTeeth() {
        System.out.println("Brush your teeth.");
    }

    public static void haveBreakfast() {
        System.out.println("Have a healthy breakfast.");
    }

    public static void grabBackpack() {
        System.out.println("Grab your school backpack.");
    }

    public static void goToSchool() {
        System.out.println("Walk or ride to school.");

        if (Math.random() > 0.7) {
            System.out.println("\tForgot my backpack!");
            System.out.println("\tRun back home.  Mom is going nuts!");
            grabBackpack();
            goToSchool();
            return;
        }
    }

}
