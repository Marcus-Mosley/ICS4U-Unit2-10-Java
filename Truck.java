/**
* This class extends Vehicle to create a Truck.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-02
*/
public class Truck extends Vehicle {
  private String plateNo;
  
  // Constructors
  
  /**
  * The Truck method constructs a Truck.
  */
  public Truck(String startPlateNo, String startColour, int startMaxSpeed) {
    super(startColour, 18, startMaxSpeed);
    plateNo = startPlateNo;
  }
  
  // Getters
  
  public String getPlateNo() {
    return plateNo;
  }
  
  // Setters
  
  public void setPlateNo(String newPlateNo) {
    plateNo = newPlateNo;
  }
  
  // Methods
  
  /**
  * The provideAir method applies the Truck's Air Brakes.
  */
  public void provideAir(int amountOfAir) {
    super.applyBrake(amountOfAir);
  }
}