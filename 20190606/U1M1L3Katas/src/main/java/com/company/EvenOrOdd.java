package com.company;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a number");
        int userNum = Integer.parseInt(scanner.nextLine());

        if (userNum%2 == 0) {
            System.out.println(userNum + " is an even number!");
        } else if (userNum%2 == 1) {
            System.out.println(userNum + " is an Odd number!");
        }
    }
}
