package main;

import character.CharacterInfo;
import characterclass.Barbarian;
import characterclass.CharacterClass;
import characterrace.CharacterRace;
import characterrace.Dragonborn;
import characterrace.Human;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelUpTest {
    //testing implementation by Andrew Ferasol
    CharacterRace cr = new Dragonborn();
    CharacterClass cc = new Barbarian();
    CharacterInfo character = new CharacterInfo("testPlayer", "testCharacter", cc, cr);


    @Test
    void levelUp() {
        //this should imitate what would happen if a user inputs a level above max (20)
        character.levelUpTo(21);
    }
}