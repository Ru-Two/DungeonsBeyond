package utilities;

public class Trait {
    private String name;
    private String description;

    public Trait(String n, String d){
        name = n;
        description = d;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public String toString(){
        return name + ": " + description;
    }
}
