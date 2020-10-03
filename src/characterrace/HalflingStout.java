package characterrace;

public class HalflingStout extends Halfling {

    public HalflingStout(){
        super();

        subRaceName = "Stout Halfling";
        abilityScores[CON] += 1;

        traits.add(stoutResilience);
    }
}
