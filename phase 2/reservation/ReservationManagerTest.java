package reservation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ReservationManagerTest {
    private ReservationManager reservationManager;
    private Room room1;
    private Room room2;
    private List<Reservation> reservations;

    @BeforeEach
    void setUp() {
        room1 = new Room(101, "Deluxe");
        room2 = new Room(102, "Standard");
        reservations = new ArrayList<>();
        reservationManager = new ReservationManager(reservations);
    }

    @AfterEach
    void tearDown() {
        reservationManager = null;
    }

    @Test
    void makeReservation() {
        // Test making a reservation when room is not reserved
        boolean result = reservationManager.makeReservation(room1, "John Doe");
        assertTrue(result, "Reservation should be successful for an unreserved room");
        assertTrue(room1.isReserved(), "Room should be marked as reserved after reservation");
        assertEquals(1, reservations.size(), "Reservations list should have one reservation after making a reservation");

        // Verify details of the created reservation
        Reservation reservation = reservations.get(0);
        assertEquals(1, reservation.getReservationId(), "The reservation ID should be 1");
        assertEquals("John Doe", reservation.getGuestName(), "The guest name should be 'John Doe'");
        assertEquals(room1, reservation.getRoom(), "The reserved room should be room1");

        // Test making a reservation when room is already reserved
        boolean secondResult = reservationManager.makeReservation(room1, "Jane Smith");
        assertFalse(secondResult, "Reservation should fail for a room that is already reserved");
        assertEquals(1, reservations.size(), "Reservations list should still have only one reservation after a failed reservation attempt");
    }
}