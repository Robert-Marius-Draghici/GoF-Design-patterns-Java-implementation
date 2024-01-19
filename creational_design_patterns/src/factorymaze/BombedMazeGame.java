package factorymaze;

import common.BombedWall;
import common.Room;
import common.RoomWithABomb;
import common.Wall;

public class BombedMazeGame extends FactoryMazeGame {
    @Override
    public Wall makeWall() {
        return new BombedWall();
    }

    @Override
    public Room makeRoom(int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }
}
