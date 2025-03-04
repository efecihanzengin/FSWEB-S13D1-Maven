package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        return (clock < 24 && clock >= 16 && isBarking) || (clock >= 0 && clock < 8 && isBarking);
        }



    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return ((firstAge >= 13) && (firstAge <= 19)) || ((secondAge >= 13) && (secondAge <= 19)) || ((thirdAge >= 13) && (thirdAge <= 19));
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp < 45;

        }
        else return temp >= 25 && temp <= 35;
    }

    public static double area(double width, double height) {
        if (width > 0 && height > 0) {
            return width * height;
        } else {
            return -1;
        }
    }

    public static double area(double radius) {
        if (radius > 0) {
            double v = radius * radius * Math.PI;
            return v;
        } else {
            return -1;
        }
    }
}
