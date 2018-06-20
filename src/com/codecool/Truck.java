package com.codecool;

public class Truck extends Vehicle {


    int breakdownTurnsLeft = 0;

    public Truck() {
        super();
        name = Integer.toString(getRandomNumberBetween(0, 1000));
    }

    @Override
    public void moveForAnHour(Race race) {
        if (breakdownTurnsLeft > 0) {
            breakdownTurnsLeft--;
        }
        else {
            breakingDown();
            if (breakdownTurnsLeft == 0) {
                distanceTraveled+=this.speed;
            }
        }
    }

    void breakingDown() {
        int chance = getRandomNumberBetween(1, 100);
        if (chance <= 5) {
            breakdownTurnsLeft = 2;
        }
    }

    public int getBreakdownTurnsLeft() {
        return breakdownTurnsLeft;
    }
}
