package characterrace;

import utilities.*;

public class Halfling extends CharacterRace implements Utilities {

    public Halfling(){
        super();

        raceName = "Halfling";
        subRaceName = "";
        speed = 25;

        abilityScores[DEX] += 2;

        traits.add(lucky);
        traits.add(brave);
        traits.add(halflingNimbleness);
    }
}
