package com.pluralsight;

public class Dice {
    private int dice1;

    public Dice() {
        this.dice1 = 0;
    }

    public int getDice1() {
        return dice1;
    }

    public void setDice1(int dice1) {
        this.dice1 = dice1;
    }

    public static int roll(){
        int maxValue = 6;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        return randomNumber;
    } // end of roll
}
