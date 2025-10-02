package com.pluralsight;

public class Dice {
    private int dice1;
    private int dice2;

    public Dice() {
        this.dice1 = 0;
        this.dice2 = 0;
    }

    public int getDice1() {
        return dice1;
    }

    public int getDice2() {
        return dice2;
    }


    public static void roll(){
        int maxValue = 6;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        System.out.println(randomNumber);
    } // end of roll
}
