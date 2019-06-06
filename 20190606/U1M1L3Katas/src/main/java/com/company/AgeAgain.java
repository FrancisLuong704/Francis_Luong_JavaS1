package com.company;

import java.util.Scanner;

public class AgeAgain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = Integer.parseInt(scanner.nextLine());

        if (age < 14) {
            System.out.println("What grade are you in?");
            String grade = scanner.nextLine();
            System.out.println("Wow! " + grade + " grade - that sounds exciting!");

        } else if (age >= 14 && age <= 18) {
            System.out.println("Are you going to college? yes or no");
            String college = scanner.nextLine();

            if (college == "yes") {
                System.out.println("what college?");
                String colName = scanner.nextLine();
                System.out.println(colName + " is a great school!");

            } else if (college == "no") {
                System.out.println("What do you want to do after high school?");
                String afterHS = scanner.nextLine();
                System.out.println("Wow, " + afterHS + " sounds like a plan!");
            }
        } else if (age > 18) {
            System.out.println("What is your job?");
            String job = scanner.nextLine();
            System.out.println(job + " sounds like a great job!");
        }
    }
}
