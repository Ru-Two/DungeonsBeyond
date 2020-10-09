package characterrace;

import static utilities.Utilities.*;

public class Gnome extends CharacterRace {

    public Gnome(){
        super();

        raceName = "Gnome";
        subRaceName = "";
        speed = 25;

        abilityScores[INT] += 2;

        traits.add(darkvision);
        traits.add(gnomeCunning);
    }
}
