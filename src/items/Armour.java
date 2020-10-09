package items;

import static utilities.Utilities.*;

public class Armour extends Item{
    private int ac; //base armour class
    private int str; //min strength required to wear
    private boolean stealthDis; //stealth disadvantage
    private int armourType;

    //do NOT use Armour class to make a shield
    public Armour(String n, int base_ac, int armourType, int Strength, boolean stealthDis, int c, int w){
        super(n,c,w);
        ac = base_ac;
        str = Strength;
        this.stealthDis = stealthDis;

        this.armourType = armourType;
    }

    public Armour(String n, int base_ac, int armourType, boolean stealthDis, int c, int w){
        this(n, base_ac, armourType, 0, stealthDis, c, w);
    }

    public int getAc() {
        return ac;
    }

    public int getArmourType() {
        return armourType;
    }

    public int getStrength() {
        return str;
    }

    public boolean hasStealthDis() {
        return stealthDis;
    }
}
