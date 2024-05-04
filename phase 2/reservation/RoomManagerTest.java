package reservation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RoomManagerTest {
    private RoomManager roomManager;
    private Room room1;
    private Room room2;

    @BeforeEach
    void setUp() {
        // Initialize Room objects and RoomManager before each test
        room1 = new Room(101, "Deluxe");
        room2 = new Room(102, "Standard");
        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        roomManager = new RoomManager(rooms);
    }

    @AfterEach
    void tearDown() {
        // Clean up after test
        roomManager = null;
    }

    @Test
    void getRooms() {
        // Test getter for rooms list
        List<Room> rooms = roomManager.getRooms();
        assertNotNull(rooms, "Rooms list should not be null");
        assertEquals(2, rooms.size(), "Rooms list should contain two rooms");
        assertTrue(rooms.contains(room1) && rooms.contains(room2), "Rooms list should contain the initialized rooms");
    }

    @Test
    void searchRoom() {
        // Test search for an available room of a specific type
        room1.setReserved(true); // Set the first room as reserved
        Room foundRoom = roomManager.searchRoom("Standard");
        assertNotNull(foundRoom, "Should find an available room of type 'Standard'");
        assertEquals(room2.getRoomId(), foundRoom.getRoomId(), "The room found should be the one that is not reserved");

        // Test when no available room of the type exists
        room2.setReserved(true); // Set the second room as reserved
        Room notFoundRoom = roomManager.searchRoom("Standard");
        assertNull(notFoundRoom, "Should not find an available room of type 'Standard' when all are reserved");
    }
}