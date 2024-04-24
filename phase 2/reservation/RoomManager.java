package reservation;

import java.util.List;

public class RoomManager {
    private List<Room> rooms;

    public RoomManager(List<Room> rooms) {
        this.rooms = rooms;
    }

    // Getters
    public List<Room> getRooms() {
        return rooms;
    }

    // Method to search for available rooms
    public Room searchRoom(String roomType) {
        for (Room room : rooms) {
            if (room.getRoomType().equalsIgnoreCase(roomType) && !room.isReserved()) {
                return room;
            }
        }
        return null; // No available room found
    }
}
