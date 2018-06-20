package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Car extends Vehicle {

    final int MINSPEED = 80;
    final int MAXSPEED = 110;
    List<String> carNames = new ArrayList<>(
        Arrays.asList("Alabaster", "Aurora", "Chase", "Empyrean", "Eternity", "Fragment",
            "Gallop", "Guerilla", "Instinct", "Magic", "Pinnacle", "Ranger", "Realm", "Reflect",
            "Shadow", "Thunder", "Tradition", "Trailblazer", "Utopia", "Viper"));

    Car() {
        super();
        this.speed = getRandomNumberBetween(MINSPEED, MAXSPEED);
        this.name = getRandomName();
    }

    @Override
    public void moveForAnHour(Race race) {
        if(race.isThereABrokenTruck()) {
            distanceTraveled += 75;
        }
        else {
            distanceTraveled += speed;
        }
    }

    String getRandomName() {
        int index = random.nextInt(carNames.size());
        return carNames.get(index);
    }


}
