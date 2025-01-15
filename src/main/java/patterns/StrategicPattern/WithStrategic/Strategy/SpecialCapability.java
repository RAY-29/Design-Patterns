package main.java.patterns.StrategicPattern.WithStrategic.Strategy;

public class SpecialCapability implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Special Strategy");

    }
}
