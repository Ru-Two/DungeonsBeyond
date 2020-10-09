package characterclass;

import utilities.Utilities;

public class Barbarian extends CharacterClass implements Utilities {
    Barbarian(){
        super();

        className = "Barbarian";
        startingHealth = 12 + CON;
        hitDie = 12;
        weaponProficiencies.add("");
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
