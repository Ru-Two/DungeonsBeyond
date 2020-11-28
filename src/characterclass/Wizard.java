package characterclass;

import static utilities.Utilities.*;

public class Wizard extends CharacterClass {
    public Wizard(){
        super("Wizard", 8);

        savingThrows[0] = INT;
        savingThrows[1] = WIS;

        spellcasterAbility = INT;
        
        features.get(spellcastingWizard.getLevel()).add(spellcastingWizard);
        features.get(arcaneRecovery.getLevel()).add(arcaneRecovery);
        features.get(arcaneTradition.getLevel()).add(arcaneTradition);
        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(spellMastery.getLevel()).add(spellMastery);
        features.get(signatureSpells.getLevel()).add(signatureSpells);
        
    }
 }
