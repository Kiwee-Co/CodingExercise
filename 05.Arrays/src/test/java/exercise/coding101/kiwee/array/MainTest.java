package exercise.coding101.kiwee.array;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void invalidAccess() {
        int[] numbers = new int[0];
        assertEquals(1, numbers.length);

        numbers = new int[2];
        assertEquals(1, numbers[0]);
    }

    @Test
    public void testArrayAccess() {
        int[] numbers = { 10, 20, 30, 40, 50 };
        assertEquals(30, numbers[0]);
    }

    @Test
    public void testArrayModification() {
        int[] numbers = { 10, 20, 30, 40, 50 };
        numbers[1] = 25;
        assertEquals(20, numbers[1]);
    }

    @Test
    public void testArrayListAddition() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        assertEquals("apple", fruits.get(0));
    }

    @Test
    public void testArrayListRemoval() {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.remove(1);
        assertEquals("Banana", fruits.get(0));
        assertEquals(1, fruits.size());
    }

    @Test
    void testArrayListRemove() {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange");
        assertTrue(fruits.remove("Banana"));

        fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        assertTrue(fruits.remove("Banana"));

        assertEquals("Apple", fruits.remove(0));
    }
}
