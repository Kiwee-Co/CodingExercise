package exercise.coding101.kiwee.types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void testIsPI() {
        assertTrue(Main.isPI(Math.PI));
    }

    @Test
    void testGetPI() {
        assertEquals(Math.PI, Main.getPI());
    }

    @Test
    void testDifference() {
        assertEquals(-1, Main.difference(1, 2));
    }

    @Test
    public void testArithmeticOperations() {
        int sum = 5 + 3;
        assertEquals(8, sum);

        int difference = 10 - 7;
        assertEquals(3, difference);

        double product = 2.5f * 4;
        assertEquals(10, product, 0.01);

        double quotient = 10 / 3.0;
        assertEquals(3.33, quotient, 0.01);
    }

    @Test
    public void testStringConcatenation() {
        String firstName = "Kiwee";
        String lastName = "Yang";
        String fullName = firstName + " " + lastName;
        assertEquals("Kiwee Yang", fullName);
    }

    @Test
    public void testComparisonOperators() {
        int x = 5;
        int y = 10;

        y = 5;
        boolean isEqual = x == y;
        assertTrue(isEqual);

        x = 10;
        boolean isGreaterThan = x > y;
        assertTrue(isGreaterThan);

        y = 10;
        boolean isLessThanOrEqual = x <= y;
        assertTrue(isLessThanOrEqual);
    }

    @Test
    public void testDoublePrecision() {
        assertEquals(0.1f, (float) Main.difference(0.9, 0.8));
        assertEquals(0.1f, (float) Main.difference(1.0, 0.9));
    }

}
