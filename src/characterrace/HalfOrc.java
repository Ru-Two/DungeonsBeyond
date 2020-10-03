package characterrace;

import utilities.*;

public class HalfOrc extends CharacterRace implements Utilities {

    public HalfOrc(){
        super();

        raceName = "Half-Orc";
        subRaceName = "";
        speed = 30;

        abilityScores[STR] += 2;
        abilityScores[CON] += 1;

        traits.add(darkvision);
        traits.add(menacing);
        skills.add(INTIMIDATION);
        traits.add(relentlessEndurance);
        traits.add(savageAttacks);

    }
}
