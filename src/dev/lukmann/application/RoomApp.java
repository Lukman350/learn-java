package dev.lukmann.application;

import dev.lukmann.data.Room;
import dev.lukmann.data.RoomLevel;

public class RoomApp {
    public static void main(String[] args) {
        // Enum class
        Room room = new Room();
        room.setName("Lorem 1");
        room.setLevel(RoomLevel.VVIP);

        System.out.println(room.getName());
        System.out.println(room.getLevel());
        System.out.println(room.getLevel().getDescription());

        String standard = RoomLevel.STANDARD.name();
        System.out.println(standard);

        RoomLevel roomLevel = RoomLevel.valueOf("PREMIUM");
        System.out.println(roomLevel);

        RoomLevel[] roomLevels = RoomLevel.values();

        System.out.println("Print all level: ");
        for (RoomLevel level : roomLevels) {
            System.out.println(level);
        }
    }
}
