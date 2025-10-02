package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // roll the dice 100 times
        // display the value of dice each time they are rolled
        // count how many times 2,4,6, and 7 are rolled and display the result
        //int roll1 = dice.roll(), roll2 = dice.roll();
        Dice roll1 = new Dice();
        Dice roll2 = new Dice();
        //int twoCounter, fourCounter, sixCounter, sevenCounter = 0;

        for (int i = 0; i < 100; i++){
            int dice1 = roll1.roll();
            int dice2 = roll2.roll();
            int rollSum = dice1 + dice2;
            System.out.printf("Roll %d: %d and %d | Roll Sum: %d\n", i + 1, dice1, dice2, rollSum);
            i += 1;
        } // end of for loop
    }
}
