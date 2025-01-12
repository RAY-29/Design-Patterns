package main.java.patterns.StrategicPattern.WithoutObserver;

public class Main {

    public static void main(String[] args) {
        Vehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
//        Here code duplicate is done in both drive methods
//        of SportsCar and OffRoadVehicle
        Vehicle sportsVehicle = new SportsCar();
        sportsVehicle.drive();

        Vehicle offRoad = new OffRoadVehicle();
        offRoad.drive();

    }
}
