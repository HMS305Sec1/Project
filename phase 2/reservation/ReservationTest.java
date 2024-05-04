package reservation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReservationTest {
    private Reservation reservation;
    private Room room;

    @BeforeEach
    void setUp() {
        // Initialize Room and Reservation objects before each test
        room = new Room(101, "Deluxe");
        reservation = new Reservation(1, room, "John Doe");
    }

    @AfterEach
    void tearDown() {
        // Clean up after test
        reservation = null;
        room = null;
    }

    @Test
    void getReservationId() {
        // Test getter for reservationId
        assertEquals(1, reservation.getReservationId(), "Reservation ID should match the ID supplied in constructor");
    }

    @Test
    void getRoom() {
        // Test getter for room
        assertSame(room, reservation.getRoom(), "Room object should be the same as the one supplied in constructor");
    }

    @Test
    void getGuestName() {
        // Test getter for guestName
        assertEquals("John Doe", reservation.getGuestName(), "Guest name should match the name supplied in constructor");
    }
}
