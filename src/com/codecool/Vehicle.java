package com.codecool;

import java.util.Random;

public abstract class Vehicle {


    String name;
    int speed;
    int distanceTraveled;
    Random random = new Random();

    public Vehicle() {
        speed = 100;
        distanceTraveled = 0;
    }

    public abstract void moveForAnHour(Race race);

    public String getName() {
        return name;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public int getRandomNumberBetween(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}
