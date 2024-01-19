package buildermaze;

public class CountingMazeBuilder extends MazeBuilder {

    private int doors;
    private int rooms;

    public CountingMazeBuilder() {
        rooms = 0;
        doors = 0;
    }

    @Override
    public void buildRoom(int roomNumber) {
        rooms++;
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        doors++;
    }

    public int getRoomCount() {
        return rooms;
    }

    public int getDoorsCount() {
        return doors;
    }
}
