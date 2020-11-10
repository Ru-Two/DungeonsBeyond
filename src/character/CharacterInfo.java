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
    private boolean[][] deathSaves;

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
    private ArrayList<Feature> currentFeatures;
    private ArrayList<Integer> weaponProficiencies;
    private ArrayList<Integer> armourProficiencies;

    private ArrayList<Item> items;

    public CharacterInfo(){
        playerName = "";
        characterName = "";

        level = 1;
        maxHp = 10; //temporary
        resetHp();
        proficiencyBonus = 2;
        hitDice = new Dice(10); //temporary
        inspiration = false;
        shield = false;
        equipArmour(new Armour("No Armour", 10, NO_ARMOUR, false, 0, 0)); //temporary

        deathSaves = new boolean[2][3];
        resetDeathSaves();

        initiative = 0; //temporary
        speed = 30; //temporary

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
        currentFeatures = new ArrayList<Feature>();
        weaponProficiencies = new ArrayList<Integer>();
        armourProficiencies = new ArrayList<Integer>();
    }

    public CharacterInfo(String characterName){
        this();
        this.characterName = characterName;
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
    
    public void setProfSavingThrows(CharacterClass c){
        int[] temp = c.getSavingThrows();
        int prof1 = temp[0];
        int prof2 = temp[1];
        savingThrows[prof1] = true;
        savingThrows[prof2] = true;
    }
    public boolean[] getProfSavingThrows(){
        return savingThrows;
    }
    
    public void setRaceAndClass(CharacterRace r, CharacterClass c){
        race = r;
        cclass = c;

        mergeRace();
        mergeClass();
    }

    public void refresh(){

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
        for (int i = 1; i <= level; i++) currentFeatures.addAll(features.get(i));

        hitDice = cclass.getHitDie();

        for (int s:cclass.getSavingThrows()){ savingThrows[s] = true; }
        for (int sp:cclass.getSkillProficiencies()){ skills[sp].setProficient(PROFICIENT); }

        maxHp = cclass.getStartingHealth() + getMod(CON);
        resetHp();
    }

    //Levels up your character
    public void levelUp(){
        levelUpTo(level+1);
    }

    public void levelUpTo(int targetLevel){
        int i = level;
        for (; i < targetLevel; i++) {
            level++;
            maxHp += hitDice.roll();
            resetHp();
            updateProficiency();
            currentFeatures.addAll(features.get(level));
            // TODO: ability score improvement on level up check and perform, as well as any features that modify stats
        }
    }

    public void resetHp(){
        currHp = maxHp;
        tmpMaxHp = maxHp;
    }

    public void resetDeathSaves(){
        Arrays.fill(deathSaves[SUCCESS], false);
        Arrays.fill(deathSaves[FAILURE], false);
    }

    //marks one death save as failed and returns if character is still alive or not as boolean
    public boolean failDeathSave(){
        if (deathSaves[FAILURE][0] == false){
            deathSaves[FAILURE][0] = true;
            return false;
        }
        else if (deathSaves[FAILURE][1] == false){
            deathSaves[FAILURE][1] = true;
            return false;
        }
        else if (deathSaves[FAILURE][2] == false){
            deathSaves[FAILURE][2] = true;
            return true;
        }
        return false;
    }

    //marks one death save as succeeded and returns if player is back up from being unconscious or not as boolean
    public boolean succedDeathSave(){
        if (deathSaves[SUCCESS][0] == false){
            deathSaves[SUCCESS][0] = true;
            return false;
        }
        else if (deathSaves[SUCCESS][1] == false){
            deathSaves[SUCCESS][1] = true;
            return false;
        }
        else if (deathSaves[SUCCESS][2] == false){
            deathSaves[SUCCESS][2] = true;
            currHp = 1;
            return true;
        }
        return false;
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

    public void setBaseAbilityScores(int str, int dex, int con, int int_, int wis, int cha){
        abilityScores[STR].setBase(str);
        abilityScores[DEX].setBase(dex);
        abilityScores[CON].setBase(con);
        abilityScores[INT].setBase(int_);
        abilityScores[WIS].setBase(wis);
        abilityScores[CHA].setBase(cha);
    }

    public void setBaseAbilityScores(int [] scores){
        abilityScores[STR].setBase(scores[STR]);
        abilityScores[DEX].setBase(scores[DEX]);
        abilityScores[CON].setBase(scores[CON]);
        abilityScores[INT].setBase(scores[INT]);
        abilityScores[WIS].setBase(scores[WIS]);
        abilityScores[CHA].setBase(scores[CHA]);
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
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

    public void updateProficiency(){
        proficiencyBonus = (int)((level - 1)/4) + 2;
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

    public String getClassName(){
        return cclass.getClassName();
    }

    public CharacterRace getRace() {
        return race;
    }

    public String getRaceName(){
        return race.getRaceName();
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

    public ArrayList<Feature> getCurrentFeatures() {
        return currentFeatures;
    }
}
