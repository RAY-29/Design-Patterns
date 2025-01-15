package main.java.patterns.StrategicPattern.WithStrategic;

import main.java.patterns.StrategicPattern.WithStrategic.Strategy.SpecialCapability;

public class OffRoadVehicle extends Vehicle {

   public OffRoadVehicle(){
       super( new SpecialCapability() );
   }
}
