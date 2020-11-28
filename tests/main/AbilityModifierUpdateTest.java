package main;

import characterclass.*;
import characterrace.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utilities.Utilities.STR;

//testing of method by Andrew Ferasol
class AbilityModifierUpdateTest {
    CharacterRace cr = new Tiefling();
    CharacterClass cc = new Bard();
    CharacterSheet test = new CharacterSheet("testPlayer", "testCharacter", cr, cc, 0, 0, 0);


    @Test
    void pushToCharacter() {
        test.character.getAbilityScores()[STR].setScore(15);

        test.strength_as_bonus.setText("" + test.character.getMod(STR));


        assertEquals("2", test.strength_as_bonus.getText());
    }
}