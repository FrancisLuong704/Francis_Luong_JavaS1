package com.company;

import java.util.Scanner;

public class RectPavingCompany {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("What is the Width of the driveway in feet?");

        int width = myScanner.nextInt();

        System.out.println("What is the Length of the driveway in feet?");

        int length = myScanner.nextInt();

        int area = width * length;

        System.out.println("the area is " + area);

        int perimeter = width *2 + length *2;

        System.out.println("The perimeter is " + perimeter);

        float cement = 12.50f;

        float frame = 8.25f;

        float totalCement = cement * area;

        System.out.format("The cost of the cement is %.2f", totalCement);

        float totalFrame = frame * perimeter;

        System.out.format("The cost of the frame is %.2f", totalFrame);

        //TEST WORKS. GOING TO VERSION 2
        System.out.println("This is for Version 2");

        System.out.println("What is the cost of the cement?");

        float cementV2 = myScanner.nextFloat();

        System.out.println("What is the cost of the Frame?");

        float frameV2 = myScanner.nextFloat();

        float totalCementV2 = cementV2 * area;

        float totalFrameV2 = frameV2 * perimeter;

        System.out.format("The cost of the the version 2 cement is %.2f", totalCementV2);

        System.out.format("The cost of the the version 2 frame is %.2f", totalFrameV2);
    }
}
