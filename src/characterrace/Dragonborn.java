package characterrace;

import static utilities.Utilities.*;

public class Dragonborn extends CharacterRace {

    public Dragonborn(){
        super();

        raceName = "Dragonborn";
        subRaceName = "";
        speed = 30;

        abilityScores[STR] += 2;
        abilityScores[CHA] += 1;

        traits.add(draconicAncestryTable);
        traits.add(draconicAncestry);
        traits.add(breathWeapon);
        traits.add(damageResistance);
    }
}
