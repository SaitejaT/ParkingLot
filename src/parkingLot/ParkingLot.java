package parkingLot;

import java.util.HashSet;
import java.util.Set;

// Models a place to park vehicles in real life
public class ParkingLot {

  private int capacity;
  private Set<Vehicle> parkedVehicles = new HashSet<>();

  public ParkingLot(int capacity) {
    this.capacity = capacity;
  }

  public boolean park(Vehicle vehicle) {
    if(parkedVehicles.size()<capacity){
      parkedVehicles.add(vehicle);
      return true;
    }
    return false;
  }

  public Vehicle unPark(Vehicle vehicle) {
    if(parkedVehicles.contains(vehicle)) {
      parkedVehicles.remove(vehicle);
      return vehicle;
    }
    return null;
  }
}
