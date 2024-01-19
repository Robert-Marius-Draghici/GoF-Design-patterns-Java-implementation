package abstractfactorymaze;

import common.Door;
import common.Maze;
import common.Room;
import common.Wall;

public class MazeFactory {
    public MazeFactory() {}

    public Maze makeMaze() {
        return new Maze();
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
