package factorymaze;

import common.Door;
import common.Maze;
import common.Room;
import common.Wall;

import static common.Direction.*;

public class FactoryMazeGame {

    public Maze makeMaze() {
        return new Maze();
    }

    public Room makeRoom(int roomNumber) {
        return new Room(roomNumber);
    }

    public Wall makeWall() {
        return new Wall();
    }

    public Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }

    public Maze createMaze() {
        Maze maze = makeMaze();

        Room r1 = makeRoom(1);
        Room r2 = makeRoom(2);
        Door door = makeDoor(r1, r2);

        maze.addRoom(r1);
        maze.addRoom(r2);

        r1.setRoomSide(North, makeWall());
        r1.setRoomSide(East, door);
        r1.setRoomSide(South, makeWall());
        r1.setRoomSide(West, makeWall());

        r2.setRoomSide(North, makeWall());
        r2.setRoomSide(East, makeWall());
        r2.setRoomSide(South, makeWall());
        r2.setRoomSide(West, door);

        return maze;
    }
}
