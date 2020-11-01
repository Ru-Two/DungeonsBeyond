package characterclass;

import static utilities.Utilities.*;
public class Cleric extends CharacterClass{
    public Cleric() {
        super("Cleric", 8);
        spellcasterAbility = WIS;

        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(spellcastingCleric.getLevel()).add(spellcastingCleric);
        //features.get(divineDomain.getLevel()).add(divineDomain);
        features.get(channelDivinity.getLevel()).add(channelDivinity);
        features.get(destroyUndead.getLevel()).add(destroyUndead);
        features.get(divineIntervention.getLevel()).add(divineIntervention);
    }
}
