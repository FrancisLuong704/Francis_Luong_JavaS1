package com.company;

import java.util.Random;
import java.util.Scanner;

public class HiLo {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random randomNumber = new Random();

        System.out.println("Welcome to Hi-Low!");

        String userName = myScanner.nextLine();

        System.out.println("Ok," + userName + ", here are the rules:");
        System.out.println("The computer will come up with a number between 1 and 100 (inclusive)");
        int rightNumber = randomNumber.nextInt(100) +1;
        System.out.println("Enter a Number");
        int userGuess = Integer.parseInt(myScanner.nextLine());
        int numberOfGuesses = 0;

        while (userGuess != rightNumber) {
            System.out.println("Enter a Number");
            userGuess = Integer.parseInt(myScanner.nextLine());


            if (userGuess > rightNumber) {
                System.out.println("oh its too high! Guess Again!");

            } else if (userGuess < rightNumber) {
                System.out.println("oh its too low! Guess Again!");

            } else {
                System.out.println("You Win!");
            }

        }
    }
}
