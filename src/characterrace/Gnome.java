package characterrace;

import utilities.*;

public class Gnome extends CharacterRace implements Utilities {

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
