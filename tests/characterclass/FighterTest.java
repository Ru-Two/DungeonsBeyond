package characterclass;

import org.junit.jupiter.api.Test;
import utilities.Dice;
import utilities.Feature;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FighterTest {

    @Test
    void getClassName() {
        CharacterClass Test = new Fighter();
        String name = Test.getClassName();

        assertEquals("Fighter", name);
    }

    @Test
    void getFeatureName() {
        CharacterClass Test = new Fighter();
        ArrayList<ArrayList<Feature>> features = new ArrayList<>();
        features = Test.getFeatures();
        String featureTest = features.get(1).get(0).getName();
        assertEquals("Fighting Style", featureTest);
    }

    @Test
    void getSavingThrows() {
        CharacterClass test = new Fighter();
        int[] savingthrows = new int[2];
        savingthrows = test.getSavingThrows();
        int first = savingthrows[0];
        int second = savingthrows[1];
        assertEquals(first, 0);
        assertEquals(second, 2);

    }

    @Test
    void getHitDie(){
        CharacterClass test = new Fighter();
        Dice hitDie;
        hitDie = test.getHitDie();
        assertEquals(10, hitDie.getSides());
    }
}
