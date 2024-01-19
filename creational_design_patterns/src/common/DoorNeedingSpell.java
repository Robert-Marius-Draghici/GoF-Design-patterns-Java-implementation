package common;

import common.Door;
import common.Room;

public class DoorNeedingSpell extends Door {
    public DoorNeedingSpell(Room room1, Room room2) {
        super(room1, room2);
    }

    @Override
    public String toString() {
        return "DoorNeedingSpell{" +
                "room1=" + this.getRoom1().getRoomNumber() +
                ", room2=" + this.getRoom2().getRoomNumber() +
                ", isOpen=" + isOpen() +
                '}';
    }
}
