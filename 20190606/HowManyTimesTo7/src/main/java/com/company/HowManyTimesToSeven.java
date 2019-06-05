package com.company;

import java.util.Random;

public class HowManyTimesToSeven {
    public static void main(String[] args) {
        Random rand = new Random();

        int dice1 = 0;
        int dice2 = 0;
        int numberOfSevens = 0;


        for ( int i = 0; i < 100; i++) {
            dice1 = rand.nextInt(6) + 1;
            dice2 = rand.nextInt(6) + 1;
            int sum = dice1 + dice2;

            if (sum == 7 && numberOfSevens == 1) {
                System.out.println("it took " + i + " rolls to get to your first 7!");
                numberOfSevens++;
            } else if(sum == 7 && numberOfSevens != 1) {
                numberOfSevens++;
            }
        }
        System.out.println("You hit 7 " + numberOfSevens + " times!");
    }
}
