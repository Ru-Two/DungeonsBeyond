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

    //rolls dice n times
    public int roll(int n){
        int sum = 0;
        for (int i = 0; i < numOfDice*n; i++){
            sum += rand(1,sides);
        }
        return sum;
    }

    //rolls dice and returns result
    public int roll(){
        return roll(1);
    }

    //returns array of rolled die n times
    public int[] roll_GrabArr(int n){
        int [] arr = new int[numOfDice*n];
        for (int i = 0; i < numOfDice*n; i++){
            arr[i] = rand(1,sides);
        }
        return arr;
    }

    //rolls dice and provides an array containing each die's result
    public int[] roll_GrabArr(){
        return roll_GrabArr(1);
    }

    public int rand(int min, int max){
        return (int)(Math.random() * (max-min+1)) + min;
    }

    public int getSides() {
        return sides;
    }

    public int getNumOfDice() {
        return numOfDice;
    }

    public String toString(){
        return "" + numOfDice + "d" + sides;
    }
}
