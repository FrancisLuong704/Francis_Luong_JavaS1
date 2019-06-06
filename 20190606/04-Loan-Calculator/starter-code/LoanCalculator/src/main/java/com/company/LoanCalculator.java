package com.company;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What's your mortgage?");
        int mortgage = Integer.parseInt(scanner.nextLine());

        System.out.println("How many months is your term?");
        int months = Integer.parseInt(scanner.nextLine());

        System.out.println("What is the annual interest rate of the mortgage?");
        double rate = (scanner.nextFloat()/100)/12;

        double rateOne = rate + 1;

        double apr = (mortgage * (rate * (Math.pow(rateOne, months))) / (Math.pow(rateOne, months) -1));

        System.out.println("Mortgage: " + mortgage);
        System.out.println("Term: " + months + " months");
        System.out.println("apr: " + apr);

    }
}
