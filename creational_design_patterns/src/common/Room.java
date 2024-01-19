package common;

import java.util.Arrays;

public class Room extends MapSite {
    private int roomNumber;
    private MapSite[] roomSides;

    public Room(int roomNumber) {
        this.roomNumber = roomNumber;
        this.roomSides = new MapSite[4];
    }

    public MapSite getRoomSide(Direction direction) {
        return roomSides[direction.ordinal()];
    }

    public void setRoomSide(Direction direction, MapSite roomSide) {
        this.roomSides[direction.ordinal()] = roomSide;
    }

    public MapSite[] getRoomSides() {
        return roomSides;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public void enter() {
        System.out.println("Entering room number: " + roomNumber);
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", roomSides=" + Arrays.toString(roomSides) +
                '}';
    }
}
