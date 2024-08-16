package dev.lukmann.data;

public enum RoomLevel {
    STANDARD("Standard Room"),
    PREMIUM("Premium Room"),
    VIP("VIP Room"),
    VVIP("VVIP Room");

    private final String description;

    RoomLevel(String desc) {
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }
}
