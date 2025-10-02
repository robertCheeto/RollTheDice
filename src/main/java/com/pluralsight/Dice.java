package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        // roll the dice 100 times
        // display the value of dice each time they are rolled
        // count how many times 2,4,6, and 7 are rolled and display the result
        int dice1 = 0, dice2 = 0;
        //int twoCounter, fourCounter, sixCounter, sevenCounter = 0;

        dice1.roll();


//        for (int i = 0; i < 100; i++){
//            dice1.roll();
//            dice2.roll();
//            int diceCount = dice1 + dice2;
//            System.out.printf("Roll %d: %d and %d | Roll Sum: %d\n", i + 1, dice1, dice2, diceCount);
//            i += 1;
//
//        }


    }

    public static void roll(){
        int maxValue = 6;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * maxValue) + minValue;
        System.out.println(randomNumber);
    }
}
