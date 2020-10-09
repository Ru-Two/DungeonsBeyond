package characterrace;

import static utilities.Utilities.*;

public class Dwarf extends CharacterRace {

    public Dwarf(){
        super();

        raceName = "Dwarf";
        subRaceName = "";
        speed = 25;

        abilityScores[CON] += 2;

        traits.add(darkvision);
        traits.add(dwarvenResilience);
        traits.add(dwarvenCombatTraining);
        traits.add(toolProficiency);
        traits.add(stonecunning);
    }
}
