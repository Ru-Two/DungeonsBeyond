package characterrace;

import utilities.*;
import static utilities.Utilities.*;
import java.util.*;

public abstract class CharacterRace {

    protected String raceName;
    protected String subRaceName;
    protected int speed;
    protected int[] abilityScores;
    protected ArrayList<Trait> traits;
    protected ArrayList<Integer> skills;

    public CharacterRace(){
        abilityScores = new int[6];

        Arrays.fill(abilityScores, 0);

        traits = new ArrayList<Trait>();
        skills = new ArrayList<Integer>();
    }

    public int[] getAbilityScores(){
        return abilityScores;
    }

    public ArrayList<Trait> getTraits() {
        return traits;
    }

    public Trait[] getTraitsAsArray(){
        Trait[] ret = new Trait[traits.size()];
        return traits.toArray(ret);
    }

    public ArrayList<Integer> getSkills() {
        return skills;
    }

    public Integer[] getSkillsAsArray(){
        Integer[] ret = new Integer[skills.size()];
        return skills.toArray(ret);
    }
}
