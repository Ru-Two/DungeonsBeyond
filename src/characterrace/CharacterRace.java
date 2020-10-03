package characterrace;

import character.Skill;
import utilities.*;
import java.util.*;

public abstract class CharacterRace {

    protected String raceName;
    protected String subRaceName;
    protected int speed;
    protected ArrayList<Trait> traits;
    protected ArrayList<Integer> skills;
    protected int[] abilityScoreModifiers;

    public CharacterRace(){
        abilityScoreModifiers = new int[6];

        Arrays.fill(abilityScoreModifiers, 0);

        traits = new ArrayList<Trait>();
        skills = new ArrayList<Integer>();
    }

}
