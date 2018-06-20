package com.codecool;


import java.util.ArrayList;
import java.util.List;

public class Race {

    private List<Vehicle> vehicles = new ArrayList<>(30);

    public Race() {
        createVehicles();
    }

    void createVehicles() {
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Car());
        }
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Motorcycle());
        }
        for (int i = 0; i < 10; i++) {
            vehicles.add(new Truck());
        }
    }

    boolean isThereABrokenTruck() {
        for (Vehicle vehicle : vehicles) {
            if (vehicle instanceof Truck) {
                if (((Truck) vehicle).getBreakdownTurnsLeft() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    boolean isItRaining() {
        Weather.setRaining();
        return Weather.isRaining();
    }

    void simulateRace() {
        for (int i = 0; i < 50; i++) {
            for (Vehicle vehicle : vehicles) {
                vehicle.moveForAnHour(this);
            }
        }
    }

    void printRaceResults() {
        for (Vehicle vehicle : vehicles) {
            System.out.println(
                vehicle.getName() + " " + vehicle.getDistanceTraveled() + " " + vehicle.getClass());
        }
    }

    public static void main(String[] args) {
        Race race1 = new Race();
        race1.simulateRace();
        race1.printRaceResults();

    }
}
