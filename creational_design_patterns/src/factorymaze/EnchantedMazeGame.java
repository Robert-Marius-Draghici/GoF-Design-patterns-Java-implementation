package factorymaze;

import common.*;

public class EnchantedMazeGame extends FactoryMazeGame {

    @Override
    public Room makeRoom(int roomNumber) {
        return new EnchantedRoom(roomNumber, castSpell());
    }

    @Override
    public Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }

    protected Spell castSpell() {
        return new Spell();
    }
}
