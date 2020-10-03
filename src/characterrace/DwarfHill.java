package characterrace;

public class DwarfHill extends Dwarf {

    public DwarfHill(){
        super();
        subRaceName = "Hill Dwarf";
        abilityScoreModifiers[WIS] += 1;

        traits.add(dwarvenToughness);
    }
}
