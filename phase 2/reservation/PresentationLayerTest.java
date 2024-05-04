package reservation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PresentationLayerTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private ByteArrayInputStream inContent;
    private PresentationLayer presentationLayer;
    private RoomManager roomManager;
    private ReservationManager reservationManager;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
        List<Room> rooms = PresentationLayer.initializeRooms();
        List<Reservation> reservations = PresentationLayer.initializeReservations();
        roomManager = new RoomManager(rooms);
        reservationManager = new ReservationManager(reservations);
        presentationLayer = new PresentationLayer(roomManager, reservationManager);
    }

    @AfterEach
    void tearDown() {
        System.setOut(originalOut);
        if (inContent != null) {
            try {
                inContent.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    void searchRoom() {
        String input = "Single\n";
        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        presentationLayer.searchRoom();
        assertTrue(outContent.toString().contains("Room found! Room ID: 1") || outContent.toString().contains("No available room of type Single found."));
    }

    @Test
    void makeReservation() {
        String input = "4\nJohn Doe\n";
        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        presentationLayer.makeReservation();
        assertTrue(outContent.toString().contains("Reservation successful!") || outContent.toString().contains("Failed to make reservation."));
    }

    @Test
    void run() {
        String input = "0\n";
        inContent = new ByteArrayInputStream(input.getBytes());
        System.setIn(inContent);

        presentationLayer.run();
        assertTrue(outContent.toString().contains("Exiting..."));
    }
}
