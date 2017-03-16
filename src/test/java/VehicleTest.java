import org.junit.*;
import static org.junit.Assert.*;

public class VehicleTest {

  @Test
  public void newVehicle_getsPrice_4120() {
    Vehicle newCar = new Vehicle(1955, "Ford", "Edsel", 500, 4120);
    assertEquals(4120, newCar.getPrice());
  }

}
