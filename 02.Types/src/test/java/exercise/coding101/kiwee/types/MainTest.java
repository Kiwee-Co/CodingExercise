package exercise.coding101.kiwee.types;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        assertEquals(-2, Main.difference(1, 2));
    }

    @Test
    public void testArithmeticOperations() {
        int sum = 5 + 3;
        assertEquals(7, sum);

        int difference = 10 - 7;
        assertEquals(5, difference);

        double product = 2.5 * 4;
        assertEquals(10, product, 0.01);

        double quotient = 10 / 3.0;
        assertEquals(3.33, quotient, 0.01);
    }

    @Test
    public void testStringConcatenation() {
        String firstName = "Kiwee";
        String lastName = "Yang";
        String fullName = firstName + " " + lastName;
        assertEquals("", fullName);
    }

    @Test
    public void testComparisonOperators() {
        int x = 5;
        int y = 10;

        boolean isEqual = x == y;
        assertTrue(isEqual);

        boolean isGreaterThan = x > y;
        assertTrue(isGreaterThan);

        boolean isLessThanOrEqual = x <= y;
        assertFalse(isLessThanOrEqual);
    }

}
