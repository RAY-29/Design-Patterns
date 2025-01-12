package main.java.patterns.StrategicPattern.WithObserver.Strategy;

public class SpecialCapability implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Special Strategy");

    }
}
