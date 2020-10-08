package items;

public class Weapon extends Item{
    private String dmgType;
    private String properties;
    // add Dice class and make dmgType of that class
    public Weapon(String n, String dmgType, String properties, int c, int w){
        super(n,c,w);
        this.dmgType = dmgType;
        this.properties = properties;
    }

}
