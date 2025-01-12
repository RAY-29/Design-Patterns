package main.java.patterns.StrategicPattern.WithObserver;

import main.java.patterns.StrategicPattern.WithObserver.Strategy.NormalCapability;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super( new NormalCapability() );
    }

}
