package reservation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PresentationLayer {
    private RoomManager roomManager;
    private ReservationManager reservationManager;

    public PresentationLayer(RoomManager roomManager, ReservationManager reservationManager) {
        this.roomManager = roomManager;
        this.reservationManager = reservationManager;
    }

    // Method to handle room search
    public void searchRoom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room type to search: (Single/Double/Suite)");
        String roomType = scanner.nextLine();

        if (!roomType.equals("Single") && !roomType.equals("Double") && !roomType.equals("Suite")) {
            System.out.println("Invalid room type. Please enter Single, Double, or Suite.");
            return;
        }

        Room availableRoom = roomManager.searchRoom(roomType);
        if (availableRoom != null) {
            System.out.println("Room found! Room ID: " + availableRoom.getRoomId());
        } else {
            System.out.println("No available room of type " + roomType + " found.");
        }
    }

    // Method to handle reservation
    public void makeReservation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter room ID: ");
        int roomId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Room room = null;
        for (Room r : roomManager.getRooms()) {
            if (r.getRoomId() == roomId) {
                room = r;
                break;
            }
        }
        if (room == null || room.isReserved()) {
            System.out.println("Invalid room ID or room already reserved.");
            return;
        }

        System.out.println("Enter guest name: ");
        String guestName = scanner.nextLine();
        boolean success = reservationManager.makeReservation(room, guestName);
        if (success) {
            System.out.println("Reservation successful!");
        } else {
            System.out.println("Failed to make reservation. Room is already reserved.");
        }
    }

    public void viewReservations() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter guest name: ");
        String guestName = scanner.nextLine();
        List<Reservation> reservations = reservationManager.getReservationsByGuestName(guestName);
        if (reservations.isEmpty()) {
            System.out.println("No reservations found for guest " + guestName);
        } else {
            System.out.println("Reservations for guest " + guestName + ":");
            for (Reservation reservation : reservations) {
                System.out.println("Room ID: " + reservation.getRoom().getRoomId() + ", Room Type: " + reservation.getRoom().getRoomType());
            }
        }
    }

    // Method to initialize rooms
    public static List<Room> initializeRooms() {
        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room(1, "Single"));
        rooms.add(new Room(2, "Double"));
        rooms.add(new Room(3, "Suite"));
        rooms.add(new Room(4, "Single"));
        rooms.add(new Room(5, "Double"));
        rooms.add(new Room(6, "Suite"));
        return rooms;
    }

    // Method to initialize reservations
    public static List<Reservation> initializeReservations() {
        return new ArrayList<>(); // Initially no reservations
    }

    // Method to run the application
    public void run() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Search Room");
            System.out.println("2. Make Reservation");
            System.out.println("3. View Reservations");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    searchRoom();
                    break;
                case 2:
                    makeReservation();
                    break;
                case 3:
                    viewReservations();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }

    public static void main(String[] args) {
        // Initialize rooms and reservations
        List<Room> rooms = initializeRooms();
        List<Reservation> reservations = initializeReservations();

        // Initialize managers
        RoomManager roomManager = new RoomManager(rooms);
        ReservationManager reservationManager = new ReservationManager(reservations);

        // Initialize presentation layer
        PresentationLayer presentationLayer = new PresentationLayer(roomManager, reservationManager);

        // Run the application
        presentationLayer.run();
    }
}
