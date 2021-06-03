/**
* This class creates a vehicle.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-03
*/
public abstract class Vehicle {
  private String colour;
  private int wheelNo;
  private int maxSpeed;
  private int speed; // KPH
  
  // Constructors
  
  /**
  * The Vehicle method constructs a vehicle.
  */
  public Vehicle(String startColour, int startWheelNo, int startMaxSpeed) {
    colour = startColour;
    wheelNo = startWheelNo;
    maxSpeed = startMaxSpeed;
    speed = 0;
  }
  
  // Getters
  
  public String getColour() {
    return this.colour;
  }
  
  public int getWheels() {
    return this.wheelNo;
  }
  
  public int getMaxSpeed() {
    return this.maxSpeed;
  }
  
  public int getSpeed() {
    return this.speed;
  }
  
  // Setters
  
  public void setColour(String newColour) {
    this.colour = newColour;
  }
  
  // Methods
  
  public void accelerate(int increment) {
    this.speed += increment;
  }
  
  public void applyBrake(int decrement) {
    this.speed -= decrement;
  }
  
  /**
  * The printVehicleInfo method outputs the vehicle info.
  */
  public final void printVehicleInfo() {
    System.out.print("\nColour: " + colour);
    System.out.print("\nMax. Speed: " + maxSpeed);
    System.out.print("\nCurrent Speed: " + speed);
  }
}