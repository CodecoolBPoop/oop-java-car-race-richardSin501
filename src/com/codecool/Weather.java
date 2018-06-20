package com.codecool;

import java.util.Random;

public class Weather {

    private static boolean raining;
    private static Random random = new Random();

    public static boolean isRaining() {
        return raining;
    }

    public static void setRaining() {
        int chance = random.nextInt(100) + 1;
        if (chance <= 30) {
            raining = true;
        }
    }

}
