package characterrace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DwarfTest {

    @org.junit.jupiter.api.Test
    void getRaceName() {
        CharacterRace temp = new Dwarf();
        assertEquals("Dwarf", temp.getRaceName());
    }

    @Test
    void getSpeed() {
        CharacterRace temp = new Dwarf();
        assertEquals(25, temp.getSpeed());
    }
}