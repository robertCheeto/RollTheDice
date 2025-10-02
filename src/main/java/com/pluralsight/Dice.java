package com.pluralsight;

public class Dice {
    private int dice1;

    public Dice() {
        this.dice1 = 0;
    }

    public int roll(){
        int maxValue = 6;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return randomNumber;
    } // end of roll
}
