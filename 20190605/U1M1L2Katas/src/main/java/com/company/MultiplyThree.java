package com.company;

import java.util.Scanner;

public class MultiplyThree {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int num1 = Integer.parseInt(myScanner.nextLine());

        int num2 = Integer.parseInt(myScanner.nextLine());

        int num3 = Integer.parseInt(myScanner.nextLine());

        int total = num1 * num2 * num3;

        System.out.println(total);
    }
}