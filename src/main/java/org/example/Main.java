package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner myObj = new Scanner(System.in);
        double width = myObj.nextDouble();
        double height = myObj.nextDouble();
        double alan = area(width, height);

        double radius = myObj.nextDouble();
        myObj.close();
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        if (isBarking && (clock < 8 || clock > 20)) {
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge <= 19 && firstAge >= 13) || (secondAge <= 19 && secondAge >= 13) || (thirdAge <= 19 && thirdAge >= 13);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return (temp <= 45 && temp >= 25);
        } else {
            return (temp <= 35 && temp >= 25);
        }
    }


    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        } else {
            return width * height;
        }
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        } else {
            return radius*radius*Math.PI;
        }
    }
}
