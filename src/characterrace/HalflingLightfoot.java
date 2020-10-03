package characterrace;

public class HalflingLightfoot extends Halfling{

    public HalflingLightfoot(){
        super();

        subRaceName = "Lightfoot Halfling";
        abilityScores[CHA] += 1;

        traits.add(naturallyStealthy);
    }
}
