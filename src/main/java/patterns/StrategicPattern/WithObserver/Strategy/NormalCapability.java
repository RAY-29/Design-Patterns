package main.java.patterns.StrategicPattern.WithObserver.Strategy;

public class NormalCapability implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Strategy");

    }
}
