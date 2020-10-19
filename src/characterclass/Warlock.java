import static utilities.Utilities.*;
public class Warlock extends CharacterClass{
	Warlock(){
        super("Warlock", 8);
        
        features.get(otherworldlyPatron.getLevel()).add(otherworldlyPatron);
        features.get(pactMagic.getLevel()).add(pactMagic);
        features.get(eldritchInvocations.getLevel()).add(eldritchInvocations);
        features.get(pactBoon.getLevel()).add(pactBoon);
        features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
        features.get(mysticArcanum.getLevel()).add(mysticArcanum);
        features.get(eldritchMaster.getLevel()).add(eldritchMaster);
        
    }
 }

}
