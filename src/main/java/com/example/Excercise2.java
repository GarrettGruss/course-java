package com.example;

public class Excercise2 {
    public static long toMilesPerHour (double kilometersPerHour) {
        double KILOMETERS_PER_MILE = 1.609;
        if (kilometersPerHour < 0) {
            return -1L;
        } else {
            return Math.round(kilometersPerHour / KILOMETERS_PER_MILE);
        }
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }
}
