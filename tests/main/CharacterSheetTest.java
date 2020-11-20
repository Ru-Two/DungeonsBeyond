package main;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.*;

class CharacterSheetTest {

    //Testing of method by Ruturaj Darji
    @Test
    void getRelativeBounds() {
        CharacterSheet test = new CharacterSheet();
        Rectangle test_bounds = test.getRelativeBounds(0,0,100,100);

        //doing the math by hand, the dimensions should be shifted to (0,0,46,46). So just check one random value, say width, to test case
        assertEquals(46, (int)test_bounds.getWidth());
    }
}