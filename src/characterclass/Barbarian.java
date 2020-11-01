package characterclass;

import static utilities.Utilities.*;

public class Barbarian extends CharacterClass {

    public Barbarian(){
        super("Barbarian", 12);

        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(rage.getLevel()).add(rage);
        features.get(unarmoredDefense.getLevel()).add(unarmoredDefense);
        features.get(recklessAttack.getLevel()).add(recklessAttack);
        features.get(dangerSense.getLevel()).add(dangerSense);
        //features.get(primalPath.getLevel()).add(primalPath);      //have not implemented player input yet
        features.get(extraAttack.getLevel()).add(extraAttack);
        features.get(fastMovement.getLevel()).add(fastMovement);
        features.get(feralInstinct.getLevel()).add(feralInstinct);
        features.get(brutalCritical.getLevel()).add(brutalCritical);
        features.get(relentlessRage.getLevel()).add(relentlessRage);
        features.get(persistentRage.getLevel()).add(persistentRage);
        features.get(indomitableMight.getLevel()).add(indomitableMight);
        features.get(primalChampion.getLevel()).add(primalChampion);
    }

    
}
