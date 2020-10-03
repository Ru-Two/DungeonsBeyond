package character;

import utilities.*;

public class Skill {
    private String name;
    private boolean proficient;
    private int modifier;
    private int constName;

    public Skill(String n, boolean p, int m, int c){
        name = n;
        proficient = p;
        modifier = m;
        constName = c;
    }

    public Skill(String n, int m, int c){
        name = n;
        proficient = false;
        modifier = m;
        constName = c;
    }

    public void setProficient(boolean p) {
        proficient = p;
    }

    public String getName() {
        return name;
    }

    public boolean isProficient() {
        return proficient;
    }

    public int getModifier() {
        return modifier;
    }

    public int getConstName() {
        return constName;
    }
}
