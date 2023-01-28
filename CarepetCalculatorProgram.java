
package assignment8;

 import java.util.Scanner;

public class CarepetCalculatorProgram {

    public static void main(String[] args) {
        
        
    final double CARPET_PER_SQUARE = 8.0;

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Display intro.
    System.out.println("This program will display the "
            + "carpet cost of a room." + "\nPlease enter the room's "
            + "dimension in feet.");

    // Get the length of the room.
    System.out.print("Enter the length of room: ");
    double length = keyboard.nextDouble();

    // Get the width of the room.
    System.out.print("Enter the width of room: ");
    double width = keyboard.nextDouble();

    // Create RoomDimension and RoomCarpet objects.
    
    
    RoomDimension dimensions = new RoomDimension(length,
            width);
    RoomCarpet roomCarpet = new RoomCarpet(dimensions,
            CARPET_PER_SQUARE);

    // Print the object calling the toString
    System.out.println(roomCarpet);

    }
    
}
