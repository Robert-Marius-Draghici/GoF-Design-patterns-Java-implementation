package defaultmaze;

import common.Direction;
import common.Door;
import common.Maze;
import common.Room;
import common.Wall;

public class DefaultMazeGame {
    public Maze createMaze() {
        Maze aMaze = new Maze();
        Room r1 = new Room(1);
        Room r2 = new Room(2);
        Door theDoor = new Door(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setRoomSide(Direction.North, new Wall());
        r1.setRoomSide(Direction.East, theDoor);
        r1.setRoomSide(Direction.South, new Wall());
        r1.setRoomSide(Direction.West, new Wall());

        r2.setRoomSide(Direction.North, new Wall());
        r2.setRoomSide(Direction.East, new Wall());
        r2.setRoomSide(Direction.South, new Wall());
        r2.setRoomSide(Direction.East, theDoor);

        return aMaze;
    }
}
