import java.util.Scanner;

/**
* This class uses the Vehicle.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-06-02
*/
public class Main {
  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    Bike abike = new Bike("Navy Blue", 40);
    Truck atruck = new Truck("L0NGHAU1", "Pearl White", 180);
    
    System.out.println("How many wheels are on each vehicle?");
    System.out.println("\nThe Bike has " + abike.getWheels() + " wheels");
    System.out.println("The Truck has " + atruck.getWheels() + " wheels");
    
    System.out.println("\nSpeed up by 20 on the Bike and 60 on the Truck.");
    abike.accelerate(20);
    atruck.accelerate(60);
    System.out.println("\nThe current speed on the Bike is: "
        + abike.getSpeed() + " (" + abike.getCadence() + " RPM)");
    System.out.println("The current speed on the Truck is: " + atruck.getSpeed());
    
    System.out.println("\nApply the Brake on the Bike with value 5." 
        + " Provide Air on the Truck with value 13.");
    abike.applyBrake(5);
    atruck.provideAir(13);
    System.out.println("\nThe new speed on the Bike is: " 
        + abike.getSpeed() + " (" + abike.getCadence() + " RPM)");
    System.out.println("The new speed on the Truck is: " + atruck.getSpeed());

    System.out.println("Paint the Bike Ruby Red, and the Truck Chrome.");
    abike.setColour("Ruby Red");
    atruck.setColour("Chrome");
    System.out.println("\nThe new colour of the Bike is: " + abike.getColour());
    System.out.println("The new colour of the Truck is: " + atruck.getColour());
    
    System.out.println("\nRing the Bike's Bell.");
    abike.ringBell();
    
    System.out.println("\nDone.");
  }
}