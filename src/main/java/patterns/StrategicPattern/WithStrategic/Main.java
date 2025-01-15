package main.java.patterns.StrategicPattern.WithStrategic;

public class Main {

    public static void main(String[] args) {

        Vehicle sportsVehicle = new SportsCar();
        sportsVehicle.drive();

        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();
    }
}
