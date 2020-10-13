package character;

import utilities.*;
import static utilities.Utilities.*;

public class Skill {

    private String name;
    private int proficient;
    private int modifier;
    private int constName;

    public Skill(String n, int p, int m, int c){
        name = n;
        proficient = p;
        modifier = m;
        constName = c;
    }

    public Skill(String n, int m, int c){
        name = n;
        proficient = NOT_PROFICIENT;
        modifier = m;
        constName = c;
    }

    public void setProficient(int p) {
        proficient = p;
    }

    public String getName() {
        return name;
    }

    public int isProficient() {
        return proficient;
    }

    public int getModifier() {
        return modifier;
    }

    public int getConstName() {
        return constName;
    }
}
