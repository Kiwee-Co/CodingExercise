package exercise.coding101.kiwee.intro;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void testPrint() {
        assertDoesNotThrow(() -> Main.print());
    }

    @Test
    void testMain() {
        assertDoesNotThrow(() -> Main.main(null));
    }
}
