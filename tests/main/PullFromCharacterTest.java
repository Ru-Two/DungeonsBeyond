package main;

import character.CharacterInfo;
import characterclass.Barbarian;
import characterclass.CharacterClass;
import characterrace.CharacterRace;
import characterrace.Dragonborn;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PullFromCharacterTest {
    //testing method by Andrew Ferasol

    CharacterRace cr = new Dragonborn();
    CharacterClass cc = new Barbarian();
    CharacterSheet test = new CharacterSheet("testPlayer", "testCharacter", cr, cc,0,0,0);

    @Test
    void pullFromCharacter() {
        //pulling from the back-end to set values for the front-end
        test.player_name.setText(test.character.getPlayerName());
        test.character_name.setText(test.character.getCharacterName());
        test.class_level.setText(test.character.getClassName());
        test.race_name.setText(test.character.getRaceName());


        assertEquals(test.character.getPlayerName(), test.player_name.getText());
        assertEquals(test.character.getCharacterName(), test.character_name.getText());
        assertEquals(test.character.getClassName(), test.class_level.getText());
        assertEquals(test.character.getRaceName(), test.race_name.getText());

    }
}