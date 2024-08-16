package dev.lukmann.data;

public class Room {
    private String name;

    private RoomLevel level;

    public RoomLevel getLevel() {
        return level;
    }

    public void setLevel(RoomLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
