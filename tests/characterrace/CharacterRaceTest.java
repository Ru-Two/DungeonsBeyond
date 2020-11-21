package characterrace;

import character.CharacterInfo;
import characterclass.Bard;
import org.junit.jupiter.api.Test;
import utilities.Trait;

import static org.junit.jupiter.api.Assertions.*;

class CharacterRaceTest {

    @Test
    void getTraitsAsArray() {
        CharacterRace temp = new ElfHigh();
        Trait[] xyz = temp.getTraitsAsArray();
        for(int i = 0; i < xyz.length; i++){
            System.out.println(xyz[i]);
        }
    }
}