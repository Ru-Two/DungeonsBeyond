package characterclass;

import utilities.*;

import java.util.ArrayList;

public abstract class CharacterClass {
    protected String className;
    protected int startingHealth;
    protected Dice hitDie;

    protected String[] savingThrows;
    protected ArrayList<Feature> features;
    protected ArrayList<Integer> weaponProficiencies;
    protected ArrayList<Integer> armourProficiencies;
    protected ArrayList<Integer> skillProficiencies;

    public CharacterClass(){
        savingThrows = new String[2];

        features = new ArrayList<Feature>();
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

    public String[] getSavingThrows() {
        return savingThrows;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
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
