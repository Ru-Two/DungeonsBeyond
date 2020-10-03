package characterrace;

public class ElfHigh extends Elf {

    public ElfHigh(){
        super();

        subRaceName = "High Elf";
        abilityScores[INT] += 1;

        traits.add(elfWeaponTraining);
        traits.add(cantrip);
        traits.add(extraLanguage);
    }
}
