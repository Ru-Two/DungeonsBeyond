package characterrace;

public class ElfWood extends Elf {

    public ElfWood(){
        super();

        subRaceName = "Wood Elf";
        abilityScores[WIS] += 1;

        traits.add(elfWeaponTraining);
        traits.add(fleetOfFoot);
        speed = 35;
        traits.add(maskOfTheWild);
    }
}
