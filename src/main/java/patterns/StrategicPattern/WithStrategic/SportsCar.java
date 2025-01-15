package main.java.patterns.StrategicPattern.WithStrategic;

import main.java.patterns.StrategicPattern.WithStrategic.Strategy.SpecialCapability;

public class SportsCar extends Vehicle {

    public SportsCar() {
        super( new SpecialCapability() );
    }
}
