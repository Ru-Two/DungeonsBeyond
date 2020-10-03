package characterrace;

import utilities.*;

public class Tiefling extends CharacterRace implements Utilities {

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
