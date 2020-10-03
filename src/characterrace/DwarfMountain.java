package characterrace;

public class DwarfMountain extends Dwarf {

    public DwarfMountain(){
        super();
        subRaceName = "Mountain Dwarf";
        abilityScores[STR] += 2;

        traits.add(dwarvenArmourTraining);
    }
}
