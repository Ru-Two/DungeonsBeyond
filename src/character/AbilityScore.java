package character;

public class AbilityScore {
    private String name;
    private int constName;

    private int total;
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
        recalculate();
    }

    public void setRacialBonus(int racialBonus) {
        this.racialBonus = racialBonus;
        recalculate();
    }

    public void setMiscBonus(int miscBonus) {
        this.miscBonus = miscBonus;
        recalculate();
    }

    public void setOtherModifier(int otherModifier) {
        this.otherModifier = otherModifier;
        recalculate();
    }

    public String getName() {
        return name;
    }

    public int getConstName() {
        return constName;
    }

    private void recalculate(){
        total = (base + racialBonus + miscBonus + otherModifier);
    }

    public int getScore(){
        return total <= 20 ? total : 20;
    }

    public <T> void setScore(T num){
        try {
            total = (int) num;
        }
        catch(Exception e){
            System.out.println("Invalid Input");
        }
    }

    public int getModifier(){
        return (total / 2) - 5;
    }
}
