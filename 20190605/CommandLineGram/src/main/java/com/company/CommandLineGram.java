package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CommandLineGram {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is your first name?");
        String firstName = myScanner.nextLine();

        System.out.println("What is your last name?");
        String lastName = myScanner.nextLine();

        System.out.println("What is your email?");
        String email = myScanner.nextLine();

        System.out.println("What is your Twitter Handle?");
        String twitterHandle = myScanner.nextLine();

        System.out.println("What is your age?");
        int age = myScanner.nextInt();
        myScanner.nextLine();

        System.out.println("What country are you from?");
        String country = myScanner.nextLine();

        System.out.println("What is your profession?");
        String profession = myScanner.nextLine();

        System.out.println("What is your favorite operating system?");
        String opSystem = myScanner.nextLine();

        System.out.println("What is your favorite programming language?");
        String language = myScanner.nextLine();

        System.out.println("What is your favorite Computer Scientist?");
        String scientist = myScanner.nextLine();

        System.out.println("What is your favorite keyboard shortcut?");
        String key = myScanner.nextLine();

        System.out.println("Have you ever built your own computer?");
        String comp = myScanner.nextLine();

        System.out.println("If you could be any superhero, who would it be?");
        String hero = myScanner.nextLine();

        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Twitter Handle: " + twitterHandle);
        System.out.println("Age: " + age);
        System.out.println("Country: " + country);
        System.out.println("profession: " + profession);
        System.out.println("Favorite Operating System: " + opSystem);
        System.out.println("Favorite Programming Language: " + language);
        System.out.println("Favorite Comp Scientist: " + scientist);
        System.out.println("Favorite Keyboard Shortcut: " + key);
        System.out.println("Built their own Computer: " + comp);
        System.out.println("SuperHero: " + hero);
    }
}
