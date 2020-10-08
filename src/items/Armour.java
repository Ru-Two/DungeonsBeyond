package items;

public class Armour extends Item{
    private int ac;
    private int str;
    private int modifier;
    private boolean stl;
    public Armour(String n, int base_ac, int mod, int Strength, Boolean Stealth, int c, int w){
        super(n,c,w);
        ac = base_ac;
        str = Strength;
        modifier = mod;
        stl = Stealth;

    }

    public int getAc() {
        return ac;
    }

    public int getModifier() {
        return modifier;
    }

    public int getStr() {
        return str;
    }

    public boolean StealthDisAdv() {
        return stl;
    }
}
