package characterrace;

public class DwarfHill extends Dwarf {

    public DwarfHill(){
        super();
        subRaceName = "Hill Dwarf";
        abilityScores[WIS] += 1;

        traits.add(dwarvenToughness);
    }
}
