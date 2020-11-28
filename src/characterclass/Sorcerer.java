package characterclass;

import static utilities.Utilities.*;

public class Sorcerer extends CharacterClass {
	public Sorcerer() {
		super("Sorcerer", 8);

		savingThrows[0] = CON;
		savingThrows[1] = CHA;

		spellcasterAbility = CHA;

		features.get(spellcastingSourcerer.getLevel()).add(spellcastingSourcerer);
		features.get(abilityScoreImprovement.getLevel()).add(abilityScoreImprovement);
		features.get(sorcerousOrgin.getLevel()).add(sorcerousOrgin);
		features.get(fontOfMagic.getLevel()).add(fontOfMagic);
		features.get(metamagic.getLevel()).add(metamagic);
		features.get(sorcerousRestoration.getLevel()).add(sorcerousRestoration);
	}
}
