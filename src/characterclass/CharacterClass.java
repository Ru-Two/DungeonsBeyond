package characterclass;

import utilities.*;

import java.util.*;

public abstract class CharacterClass {
    protected String className;
    protected int startingHealth;
    protected Dice hitDie;
    protected int spellcasterAbility;

    protected int[] savingThrows;
    protected ArrayList<ArrayList<Feature>> features;
    protected ArrayList<Integer> weaponProficiencies;
    protected ArrayList<Integer> armourProficiencies;
    protected ArrayList<Integer> skillProficiencies;

    public CharacterClass(){
        savingThrows = new int[2];

        features = new ArrayList<ArrayList<Feature>>();
        for (int i = 0; i <= 20; i++){ features.add(new ArrayList<Feature>()); }

        weaponProficiencies = new ArrayList<Integer>();
        armourProficiencies = new ArrayList<Integer>();
        skillProficiencies = new ArrayList<Integer>();
    }

    public CharacterClass(String className, Dice hitDie){
        this();
        this.className = className;
        this.hitDie = hitDie;
        this.startingHealth = hitDie.getSides();
    }

    public CharacterClass(String className, String hitDie){
        this();
        this.className = className;
        this.hitDie = new Dice(hitDie);
        startingHealth = this.hitDie.getSides();
    }

    public CharacterClass(String className, int hitDie){
        this();
        this.className = className;
        this.hitDie = new Dice(hitDie);
        startingHealth = hitDie;
    }

    public String getClassName() {
        return className;
    }

    public int getStartingHealth() {
        return startingHealth;
    }

    public Dice getHitDie() {
        return hitDie;
    }

    public int[] getSavingThrows() {
        return savingThrows;
    }

    public ArrayList<ArrayList<Feature>> getFeatures() {
        return features;
    }

    public ArrayList<Feature> getFeatures(int lvl){
        return features.get(lvl);
    }

    public ArrayList<Integer> getArmourProficiencies() {
        return armourProficiencies;
    }

    public ArrayList<Integer> getSkillProficiencies() {
        return skillProficiencies;
    }

    public ArrayList<Integer> getWeaponProficiencies() {
        return weaponProficiencies;
    }
}
