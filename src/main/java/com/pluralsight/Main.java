package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        // roll the dice 100 times
        // display the value of dice each time they are rolled
        // count how many times 2,4,6, and 7 are rolled and display the result
        //int roll1 = dice.roll(), roll2 = dice.roll();
        Dice roll1 = new Dice();
        Dice roll2 = new Dice();
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for (int i = 1; i < 101; i++){
            int dice1 = roll1.roll();
            int dice2 = roll2.roll();
            int rollSum = dice1 + dice2;
            System.out.printf("Roll %d: %d and %d | Roll Sum: %d\n", i, dice1, dice2, rollSum);
            i += 1;
            switch(rollSum) {
                case 2:
                    twoCounter += 1;
                    break;
                case 4:
                    fourCounter += 1;
                    break;
                case 6:
                    sixCounter += 1;
                    break;
                case 7:
                    sevenCounter += 1;
                    break;
            }
        } // end of for loop
        System.out.printf("\n*** Special Roll Counter ***\n2 Counter: %d\n4 Counter: %d\n6 Counter: %d\n7 Counter: %d", twoCounter, fourCounter, sixCounter, sevenCounter);

    }
}
