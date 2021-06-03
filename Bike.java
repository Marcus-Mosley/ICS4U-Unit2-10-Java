/**
* This class extends Vehicle to create a Bike.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-02
*/
public class Bike extends Vehicle {
  private double cadence;
  
  // Constructors
  
  /**
  * The Bike method constructs a Bike.
  */
  public Bike(String startColour, int startMaxSpeed) {
    super(startColour, 2, startMaxSpeed);
    cadence = 0;
  }
  
  // Getters
  
  /**
  * The getCadence method calculates and returns the Bike's Cadence.
  */
  public double getCadence() {
    // Formula for Speed (KPH) to Cadence (RPM)
    cadence = (double) (super.getSpeed()) * 0.621371 / (27.56 * Math.PI * 60.0 / 63360.0);
    return cadence;
  }
  
  // Methods
  
  /**
  * The ringBell method rings the Bike's bell.
  */
  public void ringBell() {
    System.out.println("Ring! Ring!");
  }
}