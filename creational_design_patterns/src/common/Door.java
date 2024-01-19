package common;

public class Door extends MapSite {
    private final Room room1;
    private final Room room2;
    private boolean isOpen;

    public Door(Room room1, Room room2) {
        this.room1 = room1;
        this.room2 = room2;
        this.isOpen = false;
    }

    public Room otherSideFrom(Room room) {
        return room.equals(room1) ? room2 : room1;
    }

    public void openDoor() {
        isOpen = true;
    }

    public void closeDoor() {
        isOpen = false;
    }

    public Room getRoom1() {
        return room1;
    }

    public Room getRoom2() {
        return room2;
    }

    public boolean isOpen() {
        return isOpen;
    }

    @Override
    public void enter() {
        if (isOpen) {
            System.out.println("Moving to next room.");
        } else {
            System.out.println("Door closed, cannot move further.");
        }
    }

    @Override
    public String toString() {
        return "Door{" +
                "room1=" + room1.getRoomNumber() +
                ", room2=" + room2.getRoomNumber() +
                ", isOpen=" + isOpen +
                '}';
    }
}
