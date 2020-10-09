package characterrace;

import static utilities.Utilities.*;

public class Halfling extends CharacterRace {

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
