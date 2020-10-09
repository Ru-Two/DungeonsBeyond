package characterrace;

import static utilities.Utilities.*;

public class Human extends CharacterRace {

    public Human(){
        super();

        raceName = "Human";
        subRaceName = "";
        speed = 30;

        for (int i = 0; i < abilityScores.length; i++){ abilityScores[i] += 1; }

        //add option for variant human?
    }
}
