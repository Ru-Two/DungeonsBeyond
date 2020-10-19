package characterclass;

import static utilities.Utilities.*;

public class Rogue extends CharacterClass{
    Rogue(){
        super("Rogue", 8);
        //spellcasterAbility = INT; only applicable when rogue archetype is "Arcane Trickster"
        
        features.get(rogueExpertise.getLevel()).add(rogueExpertise);
        features.get(sneakAttack.getLevel()).add(sneakAttack);
        features.get(theivesCant.getLevel()).add(theivesCant);
        features.get(cunningAction.getLevel()).add(cunningAction);
        features.get(roguishArchetype.getLevel()).add(roguishArchetype);
        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(uncannyDodge.getLevel()).add(uncannyDodge);
        features.get(evasion.getLevel()).add(evasion);
        features.get(reliableTalent.getLevel()).add(reliableTalent);
        features.get(blindsense.getLevel()).add(blindsense);
        features.get(slipperyMind.getLevel()).add(slipperyMind);
        features.get(elusive.getLevel()).add(elusive);
        features.get(strokeOfLuck.getLevel()).add(strokeOfLuck);  
    
    }
}
