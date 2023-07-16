package exercise.coding101.kiwee.finalproject;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    void testPlayer() {
        Player player = new Player("say my name");

        assertEquals("say my name", player.getName());
    }

}
