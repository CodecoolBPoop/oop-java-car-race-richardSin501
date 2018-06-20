package com.codecool;

public class Motorcycle extends Vehicle {

    static int nameNumber = 1;

    public Motorcycle() {
        super();
        this.name = "Motorcycle " + Motorcycle.nameNumber;
        Motorcycle.nameNumber++;
    }

    @Override
    public void moveForAnHour(Race race) {
        distanceTraveled += this.speed;
        if (race.isItRaining()) {
            distanceTraveled -= getRandomNumberBetween(5, 50);
        }
    }
}
