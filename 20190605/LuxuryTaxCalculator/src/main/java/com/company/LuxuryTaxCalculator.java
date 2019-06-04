package com.company;

import java.util.Scanner;

public class LuxuryTaxCalculator {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is Player 1's Salary");
        int p1 = Integer.parseInt(myScanner.nextLine());

        System.out.println("What is Player 2's Salary");
        int p2 = Integer.parseInt(myScanner.nextLine());

        System.out.println("What is Player 3's Salary");
        int p3 = Integer.parseInt(myScanner.nextLine());

        int sum = p1 + p2 + p3;
        System.out.println("The total of everyone's salary is: " + sum);

        if (sum > 40000000) {
            float tax = sum * .18f;

            System.out.format("The tax is: %.2f", tax);

            float left = sum - tax;

            System.out.format("The Amount leftover is: %.2f" ,left);

        }
    }
}
