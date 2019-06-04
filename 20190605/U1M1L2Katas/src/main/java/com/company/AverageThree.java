package com.company;

import java.util.Scanner;

public class AverageThree {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        double num1 = myScanner.nextDouble();
        double num2 = myScanner.nextDouble();
        double num3 = myScanner.nextDouble();

        double sum = (num1 + num2 + num3) /3;

        System.out.format("%.2f", sum);
    }
}
