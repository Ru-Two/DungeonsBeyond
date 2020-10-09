package characterclass;

import static utilities.Utilities.*;

public class Barbarian extends CharacterClass {

    Barbarian(){
        super("Barbarian", 12);

        features.add(abilityScoreImprovement);
        features.add(rage);
        features.add(unarmoredDefense);
        features.add(recklessAttack);
        features.add(dangerSense);
        features.add(primalPath);
        features.add(extraAttack);
        features.add(fastMovement);
        features.add(feralInstinct);
        features.add(brutalCritical);
        features.add(relentlessRage);
        features.add(persistentRage);
        features.add(indomitableMight);
        features.add(primalChampion);

    }


}
