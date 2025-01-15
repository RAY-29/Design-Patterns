package main.java.patterns.StrategicPattern.WithStrategic;

import main.java.patterns.StrategicPattern.WithStrategic.Strategy.DriveStrategy;

public class Vehicle {

    private final DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        this.driveStrategy.drive();
    }
}
