package com.company;

import java.util.Scanner;

public class PrimeFinder {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int i = 0;
        int x = 0;
        boolean primeNum = true;

        System.out.println("input a number");
        int userNumber = Integer.parseInt(myScanner.nextLine());

        for (i = 2; i <= userNumber; i++) {
            for (x = 2; x < i; x++) {
                if (i % x == 0) {
                    primeNum = false;
                    break;
                }
            primeNum = true;
                }
            if (primeNum) {
                System.out.println(i + "\r");
            }
        }
    }
}
