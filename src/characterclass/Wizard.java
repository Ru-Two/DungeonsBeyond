import static utilities.Utilities.*;
public class Wizard extends CharacterClass{
	Wizard(){
        super("Wizard", 8);
        spellcasterAbility = INT;
        
        features.get(spellcastingWizard.getLevel()).add(spellcastingWizard);
        features.get(arcaneRecovery.getLevel()).add(arcaneRecovery);
        features.get(arcaneTraditon.getLevel()).add(arcaneTraditon);
        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(spellMastery.getLevel()).add(spellMastery);
        features.get(signatureSpell.getLevel()).add(signatureSpell);
        
    }
 }

}
