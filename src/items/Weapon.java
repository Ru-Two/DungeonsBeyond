package items;

import utilities.Dice;

public class Weapon extends Item{
    private Dice dmg;
    private String dmgType;
    private String properties;

    // add Dice class and make dmgType of that class
    public Weapon(String n, Dice dmg, String dmgType, String properties, int c, int w){
        super(n,c,w);
        this.dmg = dmg;
        this.dmgType = dmgType;
        this.properties = properties;
    }

    public Weapon(String n, String dmgDice, String dmgType, String properties, int c, int w){
        super(n,c,w);
        dmg = new Dice(dmgDice);
        this.dmgType = dmgType;
        this.properties = properties;
    }

    public Dice getDmg(){
        return dmg;
    }

    public String getDmgType() {
        return dmgType;
    }

    public String getProperties() {
        return properties;
    }

}
