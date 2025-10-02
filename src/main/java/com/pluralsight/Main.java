package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        Dice roll1 = new Dice();
        Dice roll2 = new Dice();
        int twoCounter = 0, fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        for (int i = 0; i < 100; i++) {
            int dice1 = roll1.roll();
            int dice2 = roll2.roll();
            int rollSum = dice1 + dice2;

            System.out.printf("Roll %d: %d and %d | Roll Sum: %d\n", i + 1, dice1, dice2, rollSum);

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
            } // end of switch statement
        } // end of for loop
        System.out.printf("\n*** Special Roll Counter ***\n2 Counter: %d\n4 Counter: %d\n6 Counter: %d\n7 Counter: %d", twoCounter, fourCounter, sixCounter, sevenCounter);
    } // end of main()
}
