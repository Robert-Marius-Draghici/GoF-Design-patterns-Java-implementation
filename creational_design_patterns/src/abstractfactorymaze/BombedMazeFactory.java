package abstractfactorymaze;

import common.BombedWall;
import common.Room;
import common.RoomWithABomb;
import common.Wall;

public class BombedMazeFactory extends MazeFactory {

    @Override
    public Room makeRoom(int roomNumber) {
        return new RoomWithABomb(roomNumber);
    }

    @Override
    public Wall makeWall() {
        return new BombedWall();
    }
}
