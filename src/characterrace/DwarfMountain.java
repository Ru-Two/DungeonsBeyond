package characterrace;

public class DwarfMountain extends Dwarf {

    public DwarfMountain(){
        super();
        subRaceName = "Mountain Dwarf";
        abilityScoreModifiers[STR] += 2;
    }
}
