package characterrace;

import static utilities.Utilities.*;

public class Tiefling extends CharacterRace {

    public Tiefling(){
        super();

        raceName = "Tiefling";
        subRaceName = "";
        speed = 30;

        abilityScores[CHA] += 2;
        abilityScores[INT] += 1;

        traits.add(darkvision);
        traits.add(hellishResistance);
        traits.add(infernalLegacy);
    }
}
