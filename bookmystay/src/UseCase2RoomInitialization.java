/**
 * UseCase2RoomInitialization
 *
 * This class demonstrates basic room modeling using abstraction,
 * inheritance, and polymorphism in the Hotel Booking system.
 *
 * @author Shikhamohapatra
 * @version 2.0
 */

// -------- ABSTRACT CLASS --------
abstract class Room {
    String type;
    int beds;
    double price;

    // Constructor
    Room(String type, int beds, double price) {
        this.type = type;
        this.beds = beds;
        this.price = price;
    }

    // Abstract method
    abstract void displayDetails();
}

// -------- SINGLE ROOM --------
class SingleRoom extends Room {

    SingleRoom() {
        super("Single Room", 1, 1000);
    }

    void displayDetails() {
        System.out.println("Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

// -------- DOUBLE ROOM --------
class DoubleRoom extends Room {

    DoubleRoom() {
        super("Double Room", 2, 1800);
    }

    void displayDetails() {
        System.out.println("Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

// -------- SUITE ROOM --------
class SuiteRoom extends Room {

    SuiteRoom() {
        super("Suite Room", 3, 3000);
    }

    void displayDetails() {
        System.out.println("Type: " + type);
        System.out.println("Beds: " + beds);
        System.out.println("Price: ₹" + price);
    }
}

// -------- MAIN CLASS --------
public class UseCase2RoomInitialization {

    /**
     * Entry point of the application
     */
    public static void main(String[] args) {

        System.out.println("===================================");
        System.out.println("   Hotel Booking System - v2.0     ");
        System.out.println("===================================");

        // -------- ROOM OBJECTS (Polymorphism) --------
        Room r1 = new SingleRoom();
        Room r2 = new DoubleRoom();
        Room r3 = new SuiteRoom();

        // -------- STATIC AVAILABILITY --------
        int singleAvailable = 5;
        int doubleAvailable = 3;
        int suiteAvailable = 2;

        // -------- DISPLAY DETAILS --------
        System.out.println("\n--- Room Details ---");

        r1.displayDetails();
        System.out.println("Available: " + singleAvailable);

        System.out.println();

        r2.displayDetails();
        System.out.println("Available: " + doubleAvailable);

        System.out.println();

        r3.displayDetails();
        System.out.println("Available: " + suiteAvailable);

        System.out.println("\nApplication executed successfully!");
    }
}