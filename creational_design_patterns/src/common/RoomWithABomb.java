package common;

import java.util.Arrays;

public class RoomWithABomb extends Room {

    public RoomWithABomb(int roomNumber) {
        super(roomNumber);
    }

    @Override
    public String toString() {
        return "RoomWithABomb{" +
                "roomNumber=" + this.getRoomNumber() +
                ", roomSides=" + Arrays.toString(this.getRoomSides()) +
                '}';
    }
}
