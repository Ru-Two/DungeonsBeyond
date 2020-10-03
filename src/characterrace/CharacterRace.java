package characterrace;

import utilities.*;
import java.util.*;

public abstract class CharacterRace {

    protected String raceName;
    protected String subRaceName;
    protected int speed;
    protected ArrayList<String> traits;
    protected int[] abilityScoreModifiers;
    protected int[] additionalAbilityScoreModifiers;

    public CharacterRace(){
        abilityScoreModifiers = new int[6];
        additionalAbilityScoreModifiers = new int[6];
        traits = new ArrayList<String>();
    }

}
