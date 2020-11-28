package main;

import characterclass.*;
import characterrace.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static utilities.Utilities.STR;

class PushToCharacterTest {
    //testing method by Andrew Ferasol
    CharacterRace cr = new Human();
    CharacterClass cc = new Ranger();
    CharacterSheet test = new CharacterSheet("testPlayer", "testCharacter", cr, cc,0,0,0);


    @Test
    void pushToCharacter() {
        test.strength_as.setText("20");

        test.character.getAbilityScores()[STR].setScore(Integer.parseInt(test.strength_as.getText()));


        assertEquals(20, test.character.getAbilityScores()[STR].getScore());



    }
}