package com.company;

        import java.util.Scanner;

public class AddThirteen {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        int num1 = myScanner.nextInt();

        int sum = num1 + 13;

        System.out.println(sum);
    }
}
