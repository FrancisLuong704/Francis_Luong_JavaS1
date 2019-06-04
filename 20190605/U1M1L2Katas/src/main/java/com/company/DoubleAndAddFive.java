package com.company;

        import java.util.Scanner;

public class DoubleAndAddFive {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int num1 = Integer.parseInt(myScanner.nextLine());

        int total = num1 * 2 + 5;

        System.out.println(total);
    }
}
