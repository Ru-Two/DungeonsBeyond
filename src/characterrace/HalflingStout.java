package characterrace;

import static utilities.Utilities.*;

public class HalflingStout extends Halfling {

    public HalflingStout(){
        super();

        subRaceName = "Stout Halfling";
        abilityScores[CON] += 1;

        traits.add(stoutResilience);
    }
}
