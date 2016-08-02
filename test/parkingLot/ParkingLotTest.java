package parkingLot;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ParkingLotTest {

  private Vehicle vehicle;

  @Before
  public void setUp() throws Exception {
    vehicle = new Vehicle();
  }

  @Test
  public void shouldBeAbleToPark(){
    ParkingLot parkingLot = new ParkingLot(20);
    assertTrue(parkingLot.park(vehicle));
  }
  @Test
  public void shouldNotBeAbleToPark(){
    ParkingLot parkingLot = new ParkingLot(0);
    assertFalse(parkingLot.park(vehicle));
  }

  @Test
  public void shouldBeAbleToUnparkWhenVehicleIsParkedInParkingLot(){
    ParkingLot parkingLot = new ParkingLot(20);
    parkingLot.park(vehicle);
    assertEquals(vehicle, parkingLot.unPark(vehicle));
  }
  @Test
  public void shouldNotBeAbleToUnparkWhenVehicleIsNotParkedInParkingLot(){
    ParkingLot parkingLot = new ParkingLot(20);
    assertNotEquals(vehicle,parkingLot.unPark(vehicle));
  }

}
