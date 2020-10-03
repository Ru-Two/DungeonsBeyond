package characterrace;

import utilities.*;

public class Dwarf extends CharacterRace implements Utilities {

    public Dwarf(){
        super();

        raceName = "Dwarf";
        subRaceName = "";
        speed = 25;
        abilityScoreModifiers[CON] += 2;

        traits.add(darkvision);
        traits.add(dwarvenResilience);
        traits.add(toolProficiency);
        traits.add(stonecunning);
    }
}
