import java.util.*;
// -------- ROOM CLASS --------
class Room {
    String type;
    int beds;
    int size;
    double price;
    int available;

    Room(String type, int beds, int size, double price, int available) {
        this.type = type;
        this.beds = beds;
        this.size = size;
        this.price = price;
        this.available = available;
    }

    void display() {
        System.out.println(type + ":");
        System.out.println("Beds: " + beds);
        System.out.println("Size: " + size + " sqft");
        System.out.println("Price per night: " + price);
        System.out.println("Available Rooms: " + available);
        System.out.println();
    }
}

// -------- MAIN CLASS --------
public class UseCase3InventorySetup {

    public static void main(String[] args) {

        System.out.println("Hotel Room Inventory Status\n");

        // Using ArrayList instead of separate variables
        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room("Single Room", 1, 250, 1500, 5));
        rooms.add(new Room("Double Room", 2, 400, 2500, 3));
        rooms.add(new Room("Suite Room", 3, 750, 5000, 2));

        // Display all rooms
        for (Room r : rooms) {
            r.display();
        }
    }
}