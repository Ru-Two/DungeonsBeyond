package characterclass;

import static utilities.Utilities.*;

public class Ranger extends CharacterClass{

    Ranger(){
        super("Ranger", 10 );
        spellcasterAbility = WIS;

        features.get(favoredEnemy.getLevel()).add(favoredEnemy);
        features.get(naturalExplorer.getLevel()).add(naturalExplorer);
        features.get(fightingStyle.getLevel()).add(fightingStyle);
        features.get(spellcastingRogue.getLevel()).add(spellcastingRogue);
        features.get(rangerArchetype.getLevel()).add(rangerArchetype);
        features.get(primevalAwareness.getLevel()).add(primevalAwareness);
        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(extraAttack.getLevel()).add(extraAttack);
        features.get(landsStride.getLevel()).add(landsStride);
        features.get(hideinplainSight.getLevel()).add(hideinplainSight);
        features.get(Vanish.getLevel()).add(Vanish);
        features.get(feralSenses.getLevel()).add(feralSenses);
        features.get(foeSlayer.getLevel()).add(foeSlayer);
    }
}
