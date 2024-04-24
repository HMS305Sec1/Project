package reservation;

public class Reservation {
    private int reservationId;
    private Room room;
    private String guestName;

    public Reservation(int reservationId, Room room, String guestName) {
        this.reservationId = reservationId;
        this.room = room;
        this.guestName = guestName;
    }

    // Getters and setters
    public int getReservationId() {
        return reservationId;
    }

    public Room getRoom() {
        return room;
    }

    public String getGuestName() {
        return guestName;
    }
}
