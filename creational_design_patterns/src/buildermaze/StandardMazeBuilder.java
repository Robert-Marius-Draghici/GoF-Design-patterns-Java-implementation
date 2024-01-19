package buildermaze;

import common.*;

import static common.Direction.*;

public class StandardMazeBuilder extends MazeBuilder {

    private Maze currentMaze;

    public StandardMazeBuilder() {
        currentMaze = null;
    }

    @Override
    public void buildMaze() {
        currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int roomNumber) {
        if (roomNumber >= currentMaze.getRooms().size() || currentMaze.roomNo(roomNumber) == null) {
            Room room = new Room(roomNumber);
            currentMaze.addRoom(room);

            room.setRoomSide(North, new Wall());
            room.setRoomSide(South, new Wall());
            room.setRoomSide(East, new Wall());
            room.setRoomSide(West, new Wall());
        }
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        Room r1 = currentMaze.roomNo(roomFrom);
        Room r2 = currentMaze.roomNo(roomTo);
        Door door = new Door(r1, r2);

        r1.setRoomSide(CommonWall(r1, r2), door);
        r2.setRoomSide(CommonWall(r2, r1), door);
    }

    @Override
    public Maze getMaze() {
        return currentMaze;
    }

    private Direction CommonWall(Room room1, Room room2) {
        if (room1.getRoomNumber() < room2.getRoomNumber()) {
            return East;
        }
        return West;
    }
}
