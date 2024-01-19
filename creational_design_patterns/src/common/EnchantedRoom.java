package common;

import java.util.Arrays;

public class EnchantedRoom extends Room {

    private Spell spell;

    public EnchantedRoom(int roomNumber, Spell spell) {
        super(roomNumber);
        this.spell = spell;
    }

    @Override
    public String toString() {
        return "EnchantedRoom{" +
                "roomNumber=" + this.getRoomNumber() +
                ", roomSides=" + Arrays.toString(this.getRoomSides()) +
                ", spell " + spell +
                '}';
    }
}
