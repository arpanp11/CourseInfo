package edu.ccsu.cs407.vehiclePrototypeFactory;

import edu.ccsu.cs407.vehicleFactoryMethod.*;
import edu.ccsu.cs407.vehicleAbstractFactory.*;

/**
 * Concrete class
 */
public class Bike extends VehicleBase{
  public Bike(){
    super(new HumanPowered());
  }
  
  @Override
  public double getVehicleSoundLevel() {
    return 0;
  }
  
  public Bike clone(){
    return new Bike();
  }
}
