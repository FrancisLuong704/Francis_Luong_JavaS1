package com.company;

import java.util.Scanner;

public class SubtractTwo {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int num1 = myScanner.nextInt();

        int num2 = myScanner.nextInt();

        int sum = num1 - num2;

        System.out.println(sum);
    }
}
