package dev.lukmann.map;

import java.util.EnumMap;
import java.util.Map;

public class ChapterEnumMap {
    public static enum Level {
        FREE, PREMIUM, VIP
    }

    public static void main(String[] args) {
        Map<Level, String> map = new EnumMap<>(Level.class);

        map.put(Level.FREE, "Gratis");
        map.put(Level.PREMIUM, "Berbayar");
        map.put(Level.VIP, "Berbayar Tapi Mahal");

        for (var key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
