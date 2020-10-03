package characterrace;

import utilities.*;

public class Elf extends CharacterRace implements Utilities {

    public Elf(){
        super();

        raceName = "Elf";
        subRaceName = "";
        speed = 30;

        abilityScores[DEX] += 2;

        traits.add(darkvision);
        traits.add(keenSenses);
        skills.add(PERCEPTION);
        traits.add(feyAncestry);
        traits.add(trance);
    }
}
