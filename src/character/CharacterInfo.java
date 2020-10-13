package character;

import characterrace.*;
import characterclass.*;
import java.util.*;
import utilities.*;
import static utilities.Utilities.*;

public class CharacterInfo {
    private String playerName;
    private String characterName;

    private int level;
    private int maxHp;
    private int tmpMaxHp;
    private int currHp;
    private int proficiencyBonus;
    private Dice hitDice;
    private boolean inspiration;

    private int armourClass;
    private int initiative;
    private int speed;

    private int[] abilityScores;
    private int[] abilityScoreBonuses;
    private boolean[] savingThrow;
    private int[] skillProficiency;

    private CharacterClass cclass;
    private CharacterRace race;

    private ArrayList<Trait> traits;
    private ArrayList<ArrayList<Feature>> features;
    private ArrayList<Integer> weaponProficiencies;
    private ArrayList<Integer> armourProficiencies;

    public CharacterInfo(){
        level = 1;
        proficiencyBonus = 2;
        inspiration = false;
        armourClass = 10;

        abilityScores = new int[6];
        Arrays.fill(abilityScores, 10);
        abilityScoreBonuses = new int[6];
        Arrays.fill(abilityScoreBonuses, 0);
        savingThrow = new boolean[6];
        Arrays.fill(savingThrow, false);
        skillProficiency = new int[18];
        Arrays.fill(skillProficiency, 0);

        traits = new ArrayList<Trait>();
        features = new ArrayList<ArrayList<Feature>>();
        weaponProficiencies = new ArrayList<Integer>();
        armourProficiencies = new ArrayList<Integer>();
    }

    public CharacterInfo(String playerName, String characterName, CharacterClass c, CharacterRace r){
        this();
        this.playerName = playerName;
        this.characterName = characterName;
        cclass = c;
        this.mergeClass();
        race = r;
        this.mergeRace();

    }

    public void mergeRace(){
        ArrayList<Integer> skills = race.getSkills();
        for(int i = 0; i < skills.size(); i++){
            skillProficiency[skills.get(i)] = 1;
        }
        traits.addAll(race.getTraits());
        speed = race.getSpeed();
        int[] abscores = race.getAbilityScores();
        for(int j = 0; j < abscores.length; j++){
            abilityScores[j] += abscores[j];
        }
    }

    public void mergeClass(){
        weaponProficiencies.addAll(cclass.getWeaponProficiencies());
        armourProficiencies.addAll(cclass.getArmourProficiencies());
        features.addAll(cclass.getFeatures());
        hitDice = cclass.getHitDie();
    }

    public int[] rollAbilityScores(){
        int[] tmpScores = new int[6];
        Arrays.fill(tmpScores, 0);
        int[] rolled;
        for (int i = 0; i < tmpScores.length; i++){
            rolled = d6.roll_GrabArr(4);
            Arrays.sort(rolled);
            for (int j = 0; j < 3; j++){
                tmpScores[i] += rolled[j];
            }
        }
        return tmpScores;
    }

    private void determineAbilityScoreBonuses(){
        for (int i = 0; i < abilityScores.length; i++){
            abilityScoreBonuses[i] = abilityScores[i] / 2  - 5;
        }
    }

}
