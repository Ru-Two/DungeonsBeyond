package utilities;

import java.lang.*;

public class Dice {
    private int sides;
    private int numOfDice;

    public Dice(int sides){
        this.sides = sides;
        numOfDice = 1;
    }

    public Dice(int numOfDice, int sides){
        this.sides = sides;
        this.numOfDice = numOfDice;
    }

    // d can be "1d6" or "2d12" etc
    public Dice(String d){
        String[] nums = d.split("d");
        sides = Integer.parseInt(nums[0]);
        numOfDice = Integer.parseInt(nums[1]);
    }

    //rolls dice and returns result
    public int roll(){
        int sum = 0;
        for (int i = 0; i < numOfDice; i++){
            sum += rand(1,sides);
        }
        return sum;
    }

    //rolls dice and provides an array containing each die's result
    public int[] roll_GrabArr(){
        int [] arr = new int[numOfDice];
        for (int i = 0; i < numOfDice; i++){
            arr[i] = rand(1,sides);
        }
        return arr;
    }

    public int rand(int min, int max){
        return (int)(Math.random() * (max-min+1)) + min;
    }

    public String toString(){
        return "" + numOfDice + "d" + sides;
    }
}
