package characterclass;

import static utilities.Utilities.*;

public class Paladin extends CharacterClass{

    public Paladin(){
        super("Paladin", 10);
        spellcasterAbility = CHA;

        features.get(divineSense.getLevel()).add(divineSense);
        features.get(layonHands.getLevel()).add(layonHands);
        features.get(fightingStyle.getLevel()).add(fightingStyle);
        features.get(spellcastingPaladin.getLevel()).add(spellcastingPaladin);
        features.get(divineSmite.getLevel()).add(divineSmite);
        features.get(divineHealth.getLevel()).add(divineHealth);
        features.get(sacredOath.getLevel()).add(sacredOath);
        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(extraAttack.getLevel()).add(extraAttack);
        features.get(auraofProtection.getLevel()).add(auraofProtection);
        features.get(auraofCourage.getLevel()).add(auraofCourage);
        features.get(improveddivineSmite.getLevel()).add(improveddivineSmite);
        features.get(cleansingTouch.getLevel()).add(cleansingTouch);
    }
}
