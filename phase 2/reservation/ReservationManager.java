package reservation;

import java.util.ArrayList;
import java.util.List;

public class ReservationManager {
    private List<Reservation> reservations;

    public ReservationManager(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    // Method to make a reservation
    public boolean makeReservation(Room room, String guestName) {
        if (!room.isReserved()) {
            Reservation reservation = new Reservation(reservations.size() + 1, room, guestName);
            reservations.add(reservation);
            room.setReserved(true);
            return true; // Reservation successful
        }
        return false; // Room is already reserved
    }

    // Method to get reservation by guest name
    public List<Reservation> getReservationsByGuestName(String guestName) {
        List<Reservation> reservations = new ArrayList<>();
        for (Reservation reservation : this.reservations) {
            if (reservation.getGuestName().equals(guestName)) {
                reservations.add(reservation);
            }
        }
        return reservations;
    }
}