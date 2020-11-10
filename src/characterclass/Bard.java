package characterclass;

import static utilities.Utilities.*;
public class Bard extends CharacterClass{
    public Bard(){
        super("Bard", 8);
        spellcasterAbility = CHA;

        savingThrows[0] = DEX;
        savingThrows[1] = CHA;

        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(spellcastingBard.getLevel()).add(spellcastingBard);
        features.get(bardicInspiration.getLevel()).add(bardicInspiration);
        features.get(jackOfAllTrades.getLevel()).add(jackOfAllTrades);
        features.get(songOfRest.getLevel()).add(songOfRest);
        features.get(bardCollege.getLevel()).add(bardCollege);
        features.get(expertise.getLevel()).add(expertise);
        features.get(fontOfInspiration.getLevel()).add(fontOfInspiration);
        features.get(coutercharm.getLevel()).add(coutercharm);
        features.get(magicalSecrets.getLevel()).add(magicalSecrets);
        features.get(superiorInspiration.getLevel()).add(superiorInspiration);
    }
}
