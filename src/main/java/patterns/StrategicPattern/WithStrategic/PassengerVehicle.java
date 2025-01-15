package main.java.patterns.StrategicPattern.WithStrategic;

import main.java.patterns.StrategicPattern.WithStrategic.Strategy.NormalCapability;

public class PassengerVehicle extends Vehicle {

    public PassengerVehicle(){
        super( new NormalCapability() );
    }

}
