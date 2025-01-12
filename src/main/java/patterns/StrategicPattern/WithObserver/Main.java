package main.java.patterns.StrategicPattern.WithObserver;

public class Main {

    public static void main(String[] args) {

        Vehicle sportsVehicle = new SportsCar();
        sportsVehicle.drive();

        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
    }
}
