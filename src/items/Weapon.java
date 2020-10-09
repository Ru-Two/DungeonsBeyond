package items;

import utilities.*;

import utilities.*;
import static utilities.Utilities.*;

public class Weapon extends Item{
    private Dice dmgDice;
    private String dmgType;
    private String properties;
    private int weaponType;
    private int dmgModifer;

    // add Dice class and make dmgType of that class
    public Weapon(String n, int weaponType, Dice dmgDice, String dmgType, String properties, int c, int w){
        super(n,c,w);
        this.weaponType = weaponType;
        this.dmgDice = dmgDice;
        this.dmgType = dmgType;
        this.properties = properties;

        if (weaponType == SIMPLE_RANGED || weaponType == MARTIAL_RANGED) { dmgModifer = DEX; }
        if (weaponType == SIMPLE_MELEE || weaponType == MARTIAL_MELEE) { dmgModifer = STR; }

    }

    public Weapon(String n, int weaponType, String dmgDice, String dmgType, String properties, int c, int w){
        super(n,c,w);
        this.weaponType = weaponType;
        this.dmgDice = new Dice(dmgDice);
        this.dmgType = dmgType;
        this.properties = properties;
        
        if (weaponType == SIMPLE_RANGED || weaponType == MARTIAL_RANGED) { dmgModifer = DEX; }
        if (weaponType == SIMPLE_MELEE || weaponType == MARTIAL_MELEE) { dmgModifer = STR; }
    }

    public void setDmgModifer(int mod){
        dmgModifer = mod;
    }

    public int dealBaseDamage(){
        return dmgDice.roll();
    }

    public int[] dealBaseDamage_GrabArr(){
        return dmgDice.roll_GrabArr();
    }

    public Dice getDmgDice(){
        return dmgDice;
    }

    public String getDmgType() {
        return dmgType;
    }

    public String getProperties() {
        return properties;
    }

    public int getWeaponType(){
       return weaponType;
    }

    public String toString(){
        return name + " - " + dmgDice + " " + dmgType;
    }

}
