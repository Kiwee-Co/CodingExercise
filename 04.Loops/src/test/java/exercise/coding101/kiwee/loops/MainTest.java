package exercise.coding101.kiwee.loops;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testCountingForLoop() {
        assertEquals("1 2 3 4 5 6 7 8 9 0", Main.countingForLoop());
    }

    @Test
    public void testPlayingGameWhileLoop() {
        assertEquals("You have 4 lives left.\n"
                + "You have 2 lives left.\n"
                + "You have 1 lives left.\n", Main.playingGameWhileLoop());
    }

    @Test
    public void testBreakStatement() {
        assertEquals("Number: 1\n"
                + "Number: 2\n"
                + "Number: 3\n"
                + "Found the number 3! Exiting loop.\n", Main.loopWithBreak());
    }

    @Test
    public void testContinueStatement() {
        assertEquals(
                "Current value of i: 1\n"
                + "Current value of i: 2\n"
                + "Skipping iteration for i = 3.\n"
                + "Current value of i: 4\n"
                + "Current value of i: 5\n",
                Main.loopWithContinue());
    }

    @Test
    public void testCountingApples() {
        assertEquals("", Main.countingApples());
    }

    @Test
    public void testSummationLoop() {
        assertEquals(50, Main.summationLoop());
    }

    @Test
    public void testIteratingFavoriteAnimals() {
        assertEquals(
                "One of my favorite animals: Dog\nOne of my favorite animals: Cat\nOne of my favorite animals: Elephant\nOne of my favorite animals: Giraffe\n",
                Main.iteratingFavoriteAnimals());
    }

}
