package main.java.patterns.StrategicPattern.WithoutObserver;

public class OffRoadVehicle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Special Capability");
    }
}
