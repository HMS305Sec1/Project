package reservation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    Room room;

    @BeforeEach
    void setUp() {
        // Initialize Room object before each test
        room = new Room(101, "Deluxe");
    }

    @AfterEach
    void tearDown() {
        // Clean up after test
        room = null;
    }

    @Test
    void getRoomId() {
        // Test getter for roomId
        assertEquals(101, room.getRoomId(), "Room ID should match the ID supplied in constructor");
    }

    @Test
    void getRoomType() {
        // Test getter for roomType
        assertEquals("Deluxe", room.getRoomType(), "Room type should match the type supplied in constructor");
    }

    @Test
    void isReserved() {
        // Test initial reservation status
        assertFalse(room.isReserved(), "New room should not be reserved");
    }

    @Test
    void setReserved() {
        // Test setter for isReserved
        room.setReserved(true);
        assertTrue(room.isReserved(), "Room reservation status should be updated to true");
    }
}
