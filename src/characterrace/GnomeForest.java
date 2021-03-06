package characterrace;

import static utilities.Utilities.*;

public class GnomeForest extends Gnome {

    public GnomeForest(){
        super();

        subRaceName = "Forest Gnome";
        abilityScores[DEX] += 1;

        traits.add(naturalIllusionist);
        traits.add(speakWithSmallBeasts);
    }
}
