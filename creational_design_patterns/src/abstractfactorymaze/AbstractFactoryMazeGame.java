package abstractfactorymaze;

import common.Direction;
import common.Door;
import common.Maze;
import common.Room;

public class AbstractFactoryMazeGame {
    public Maze createMaze(MazeFactory mazeFactory) {
        Maze aMaze = mazeFactory.makeMaze();
        Room room1 = mazeFactory.makeRoom(1);
        Room room2 = mazeFactory.makeRoom(2);
        Door aDoor = mazeFactory.makeDoor(room1, room2);

        aMaze.addRoom(room1);
        aMaze.addRoom(room2);

        room1.setRoomSide(Direction.North, mazeFactory.makeWall());
        room1.setRoomSide(Direction.East, aDoor);
        room1.setRoomSide(Direction.South, mazeFactory.makeWall());
        room1.setRoomSide(Direction.West, mazeFactory.makeWall());

        room2.setRoomSide(Direction.North, mazeFactory.makeWall());
        room2.setRoomSide(Direction.East, mazeFactory.makeWall());
        room2.setRoomSide(Direction.South, mazeFactory.makeWall());
        room2.setRoomSide(Direction.West, aDoor);

        return aMaze;
    }
}
