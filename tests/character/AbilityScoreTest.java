package character;

import static utilities.Utilities.*;

import org.junit.jupiter.api.Test;
import character.AbilityScore;

import static org.junit.jupiter.api.Assertions.*;

class AbilityScoreTest {

    //Testing of object by Ruturaj Darji
    @Test
    void ASTest(){
        AbilityScore test = new AbilityScore("Strength", STR);
        test.setBase(12);
        test.setRacialBonus(2);

        //this should be 14, since 12 + 2 = 14
        assertEquals(14, test.getScore());
    }

}