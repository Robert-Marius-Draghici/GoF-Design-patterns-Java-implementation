package common;

import java.util.ArrayList;

public class Maze {
    private final ArrayList<Room> rooms;

    public Maze() {
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public Room roomNo(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    @Override
    public String toString() {
        return "Maze{" +
                "rooms=" + rooms +
                '}';
    }
}
