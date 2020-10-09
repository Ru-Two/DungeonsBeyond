package utilities;

public class Feature {
    private final String name;
    private final String description;
    private final int level;

    Feature(int level, String name, String description){
        this.level = level;
        this.name = name;
        this.description = description;
    }

    public int getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String toString(){
        return name + ": \n" + description;
    }
}
