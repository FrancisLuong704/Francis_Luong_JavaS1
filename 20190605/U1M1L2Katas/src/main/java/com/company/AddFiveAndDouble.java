package com.company;

import java.util.Scanner;

public class AddFiveAndDouble {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        int num1 = myScanner.nextInt();

        int num2 = num1 + 5;

        int answer = num2 * 2;

        System.out.println(answer);
    }
}
