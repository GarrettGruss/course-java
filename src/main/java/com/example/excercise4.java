package com.example;

public class Excercise4 {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if ((hourOfDay < 0) || (hourOfDay > 23)) {
            return false;
        } else if (barking && ((hourOfDay < 8) || (hourOfDay > 22))) {
            return true;
        } else {
            return false;
        }
    }
}
