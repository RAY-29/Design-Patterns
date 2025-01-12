package main.java.patterns.StrategicPattern.WithObserver;

import main.java.patterns.StrategicPattern.WithObserver.Strategy.SpecialCapability;

public class SportsCar extends Vehicle {

    public SportsCar() {
        super( new SpecialCapability() );
    }
}
