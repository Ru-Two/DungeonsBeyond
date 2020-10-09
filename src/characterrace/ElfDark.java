package characterrace;

import static utilities.Utilities.*;

public class ElfDark extends Elf {

    public ElfDark(){
        super();

        subRaceName = "Dark Elf (Drow)";
        abilityScores[CHA] += 1;

        traits.add(traits.indexOf(darkvision), superiorDarkvision);
        traits.remove(darkvision);
        traits.add(sunlightSensitivity);
        traits.add(drowMagic);
        traits.add(drowWeaponTraining);
    }
}
