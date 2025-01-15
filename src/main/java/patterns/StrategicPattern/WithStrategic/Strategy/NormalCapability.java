package main.java.patterns.StrategicPattern.WithStrategic.Strategy;

public class NormalCapability implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Strategy");

    }
}
