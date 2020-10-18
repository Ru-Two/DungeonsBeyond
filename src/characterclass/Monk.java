package characterclass;

import static utilities.Utilities.*;

public class Monk extends CharacterClass{

    Monk(){
        super("Monk", 8);

        features.get(unarmoredDefense.getLevel()).add(unarmoredDefense);
        features.get(martialArts.getLevel()).add(martialArts);
        features.get(Ki.getLevel()).add(Ki);
        features.get(unarmoredMovement.getLevel()).add(unarmoredMovement);
        features.get(monasticTradition.getLevel()).add(monasticTradition);
        features.get(deflectMissiles.getLevel()).add(deflectMissiles);
        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(slowFall.getLevel()).add(slowFall);
        features.get(extraAttack.getLevel()).add(extraAttack);
        features.get(stunningStrike.getLevel()).add(stunningStrike);
        features.get(kiempoweredStrikes.getLevel()).add(kiempoweredStrikes);
        features.get(Evasion.getLevel()).add(Evasion);
        features.get(stillnessofMind.getLevel()).add(stillnessofMind);
        features.get(purityofBody.getLevel()).add(purityofBody);
        features.get(tongueofthesunandMoon.getLevel()).add(tongueofthesunandMoon);
        features.get(timelessBody.getLevel()).add(timelessBody);
        features.get(emptyBody.getLevel()).add(emptyBody);
        features.get(perfectSelf.getLevel()).add(perfectSelf);


    }
}
