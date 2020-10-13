package character;

public class AbilityScore {
    private String name;
    private int constName;

    //private int total;
    //private int modifier;

    private int base;
    private int racialBonus;
    private int miscBonus;
    private int otherModifier;

    private int overrideScore;

    public AbilityScore(){
        name = "";
        constName = -1;

        base = 0;
        racialBonus = 0;
        miscBonus = 0;
        otherModifier = 0;

        overrideScore = 0;
    }

    public AbilityScore(String name, int constName){
        this();
        this.name = name;
        this.constName = constName;
    }

    public void setBase(int base){
        this.base = base;
    }

    public void setRacialBonus(int racialBonus) {
        this.racialBonus = racialBonus;
    }

    public void setMiscBonus(int miscBonus) {
        this.miscBonus = miscBonus;
    }

    public void setOtherModifier(int otherModifier) {
        this.otherModifier = otherModifier;
    }

    public String getName() {
        return name;
    }

    public int getConstName() {
        return constName;
    }

    public int getScore(){
        return base + racialBonus + miscBonus + otherModifier;
    }

    public int getModifier(){
        return (this.getScore() / 2) - 5;
    }
}
