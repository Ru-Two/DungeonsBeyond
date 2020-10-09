package characterclass;

import utilities.*;

import java.util.ArrayList;
import java.util.Random;

public abstract class CharacterClass {
    protected String className;
    protected int startingHealth;
    protected int hitDie;
    protected String[] savingThrows;


    //change
    protected ArrayList<Feature> features;
    protected ArrayList<String> tools;


    protected ArrayList<String> weaponProficiencies;
    protected ArrayList<String> armorProficiencies;
    protected ArrayList<String> skillProficiencies;

    public CharacterClass(){
        savingThrows = new String[2];

    }




}
