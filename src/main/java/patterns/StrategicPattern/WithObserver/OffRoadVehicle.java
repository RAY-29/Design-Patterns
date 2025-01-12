package main.java.patterns.StrategicPattern.WithObserver;

import main.java.patterns.StrategicPattern.WithObserver.Strategy.SpecialCapability;

public class OffRoadVehicle extends Vehicle {

   public OffRoadVehicle(){
       super( new SpecialCapability() );
   }
}
