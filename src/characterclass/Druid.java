package characterclass;

import static utilities.Utilities.*;
public class Druid extends CharacterClass{
    public Druid() {
        super("Druid", 8);

        savingThrows[0] = INT;
        savingThrows[1] = WIS;

        spellcasterAbility = WIS;
        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(getSpellcastingDruid.getLevel()).add(getSpellcastingDruid);
        features.get(wildShape.getLevel()).add(wildShape);
        features.get(druidCircle.getLevel()).add(druidCircle);
        features.get(timelessBody.getLevel()).add(timelessBody);
        features.get(beastSpells.getLevel()).add(beastSpells);
        features.get(archdruid.getLevel()).add(archdruid);
    }
}
