package items;

public abstract class Item {
    protected String name;
    protected int cost;
    protected int weight;

    public Item(){
        name = "null";
        cost = 0;
        weight = 0;
    }

    public Item(String n, int c, int w){
        name = n;
        cost = c;
        weight = w;
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
}
