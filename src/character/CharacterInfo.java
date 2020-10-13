package character;

import characterrace.*;
import characterclass.*;

import java.util.*;

import items.*;
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
    private Armour currentArmour;
    private boolean shield;
    private int initiative;
    private int speed;

    private AbilityScore[] abilityScores;
    private boolean[] savingThrows;
    private Skill[] skills;

    private CharacterClass cclass;
    private CharacterRace race;

    private ArrayList<Trait> traits;
    private ArrayList<ArrayList<Feature>> features;
    private ArrayList<Integer> weaponProficiencies;
    private ArrayList<Integer> armourProficiencies;

    private ArrayList<Item> items;

    public CharacterInfo(){
        level = 1;
        proficiencyBonus = 2;
        inspiration = false;
        armourClass = 10; //temporary
        shield = false;

        //ability scores and saving throws
        abilityScores = new AbilityScore[6];
        abilityScores[STR] = new AbilityScore("Strength", STR);
        abilityScores[DEX] = new AbilityScore("Dexterity", DEX);
        abilityScores[CON] = new AbilityScore("Constitution", CON);
        abilityScores[INT] = new AbilityScore("Intelligence", INT);
        abilityScores[WIS] = new AbilityScore("Wisdom", WIS);
        abilityScores[CHA] = new AbilityScore("Charisma", CHA);

        savingThrows = new boolean[6];
        Arrays.fill(savingThrows, false);

        //skills and skill proficiencies
        skills = new Skill[18];

        skills[ACROBATICS] = new Skill("Acrobatics", DEX, ACROBATICS);
        skills[ANIMAL_HANDLING] = new Skill("Animal Handling", WIS, ANIMAL_HANDLING);
        skills[ARCANA] = new Skill("Arcana", INT, ARCANA);
        skills[ATHLETICS] = new Skill("Athletics", STR, ATHLETICS);
        skills[DECEPTION] = new Skill("Deception", CHA, DECEPTION);
        skills[HISTORY] = new Skill("History", INT, HISTORY);
        skills[INSIGHT] = new Skill("Insight", WIS, INSIGHT);
        skills[INTIMIDATION] = new Skill("Intimidation", CHA, INTIMIDATION);
        skills[INVESTIGATION] = new Skill("Investigation", INT, INVESTIGATION);
        skills[MEDICINE] = new Skill("Medicine", WIS, MEDICINE);
        skills[NATURE] = new Skill("Nature", INT, NATURE);
        skills[PERCEPTION] = new Skill("Perception", WIS, PERCEPTION);
        skills[PERFORMANCE] = new Skill("Performance", CHA, PERFORMANCE);
        skills[PERSUASION] = new Skill("Persuasion", CHA, PERSUASION);
        skills[RELIGION] = new Skill("Religion", INT, RELIGION);
        skills[SLEIGHT_OF_HAND] = new Skill("Sleight of Hand", DEX, SLEIGHT_OF_HAND);
        skills[STEALTH] = new Skill("Stealth", DEX, STEALTH);
        skills[SURVIVAL] = new Skill("Survival", WIS, SURVIVAL);

        //character info, other proficiencies
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
        race = r;
        // TODO: User's choice on what ability scores they want. 4 options - predetermined set, rolled set, point buy, manual input
        this.mergeClass();
        this.mergeRace();
        initiative = getMod(DEX);
    }

    // Pulls information from current race in class and merges the info over to character
    private void mergeRace(){
        for(int rs:race.getSkillsAsArray()){
            skills[rs].setProficient(PROFICIENT);
        }

        traits.addAll(race.getTraits());
        speed = race.getSpeed();

        int[] abscores = race.getAbilityScores();
        for(int j = 0; j < abscores.length; j++){
            abilityScores[j].setRacialBonus(abscores[j]);
        }
    }

    // Pulls information from current characterClass in this class and merges the info over to character
    private void mergeClass(){
        weaponProficiencies.addAll(cclass.getWeaponProficiencies());
        armourProficiencies.addAll(cclass.getArmourProficiencies());
        features.addAll(cclass.getFeatures());
        hitDice = cclass.getHitDie();

        for (int s:cclass.getSavingThrows()){ savingThrows[s] = true; }
        for (int sp:cclass.getSkillProficiencies()){ skills[sp].setProficient(PROFICIENT); }

        // TODO: Starting health after determining CON ability score
        maxHp = cclass.getStartingHealth() + getMod(CON);
        tmpMaxHp = maxHp;
        currHp = maxHp;
    }

    public static int[] rollAbilityScores(){
        int[] tmpScores = new int[6];
        Arrays.fill(tmpScores, 0);
        int[] rolled;
        for (int i = 0; i < tmpScores.length; i++){
            rolled = d6.roll_GrabArr(4);
            Arrays.sort(rolled);//sorts in ascending so we access 1,2,3 instead of 0,1,2
            for (int j = 1; j <= 3; j++){
                tmpScores[i] += rolled[j];
            }
        }
        return tmpScores;
    }

    public int getMod(int type){
        return abilityScores[type].getModifier();
    }

    public String getPlayerName(){
        return playerName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public int getLevel() {
        return level;
    }

    public int getInitiative() {
        return initiative;
    }

    public int getSpeed() {
        return speed;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public int getTmpMaxHp() {
        return tmpMaxHp;
    }

    public int getCurrHp() {
        return currHp;
    }

    public void setShield(boolean s){
        shield = s;
        equipArmour(currentArmour);
    }

    public void equipArmour(Armour a){
        currentArmour = a;

        int tmpType = a.getArmourType();

        armourClass = currentArmour.getAc();

        if (tmpType == LIGHT_ARMOUR) { armourClass += getMod(DEX); }
        if (tmpType == MEDIUM_ARMOUR) { armourClass += getMod(DEX) <= 2 ? getMod(DEX) : 2; }
        if (shield) { armourClass += 2; }
    }

    public int getArmourClass() {
        return armourClass;
    }

    public boolean hasInspiration() {
        return inspiration;
    }

    public Dice getHitDice() {
        return hitDice;
    }

    public CharacterClass getCharacterClass() {
        return cclass;
    }

    public CharacterRace getRace() {
        return race;
    }

    public AbilityScore[] getAbilityScores() {
        return abilityScores;
    }

    public Skill[] getSkills() {
        return skills;
    }

    public ArrayList<Trait> getTraits() {
        return traits;
    }

    public ArrayList<ArrayList<Feature>> getFeatures() {
        return features;
    }


}
