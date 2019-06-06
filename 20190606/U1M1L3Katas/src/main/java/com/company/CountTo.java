package com.company;

import java.util.Scanner;

public class CountTo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        System.out.println("enter a number!");

        int userNum = Integer.parseInt(scanner.nextLine());

        while (i <= userNum) {
            System.out.println(i + "\r");
            i++;
        }
    }
}
