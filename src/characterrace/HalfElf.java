package characterrace;

import static utilities.Utilities.*;

public class HalfElf extends CharacterRace {

    public HalfElf(){
        super();

        raceName = "Half-Elf";
        subRaceName = "";
        speed = 30;

        abilityScores[CHA] += 2;
        // TO DO: two other by player's choice increase by 1

        traits.add(darkvision);
        traits.add(feyAncestry);
        traits.add(skillVersatility);
        // TO DO: two more skills of player's choice

    }
}
