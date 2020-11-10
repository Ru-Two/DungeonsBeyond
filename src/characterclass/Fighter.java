package characterclass;

import static utilities.Utilities.*;

public class Fighter extends CharacterClass {

    public Fighter(){
            super("Fighter", 10);

            savingThrows[0] = STR;
            savingThrows[0] = CON;

            features.get(fightingStyle.getLevel()).add(fightingStyle);
            features.get(secondWind.getLevel()).add(secondWind);
            features.get(actionSurge.getLevel()).add(actionSurge);
            features.get(martialArchetype.getLevel()).add(martialArchetype);
            features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
            features.get(extraAttack.getLevel()).add(extraAttack);
            features.get(Indomitable.getLevel()).add(Indomitable);

        }
}