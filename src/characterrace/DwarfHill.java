package characterrace;

import static utilities.Utilities.*;

public class DwarfHill extends Dwarf {

    public DwarfHill(){
        super();
        subRaceName = "Hill Dwarf";
        abilityScores[WIS] += 1;

        traits.add(dwarvenToughness);
    }
}
