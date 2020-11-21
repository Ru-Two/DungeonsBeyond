package characterrace;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ElfDarkTest {

    @Test
    void getSubRaceName() {
        CharacterRace temp = new ElfDark();
        assertEquals("Dark Elf (Drow)", temp.getSubRaceName());
    }

    @Test
    void getSpeed() {
        CharacterRace temp = new ElfDark();
        assertEquals(30, temp.getSpeed());
    }
}