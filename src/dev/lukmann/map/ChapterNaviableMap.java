package dev.lukmann.map;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class ChapterNaviableMap {
    public static void main(String[] args) {
        NavigableMap<String, String> navigableMap = new TreeMap<>();

        navigableMap.put("Lukman", "Lukman");
        navigableMap.put("Nul", "Nul");
        navigableMap.put("Hakim", "Hakim");

        for (var key : navigableMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\n---------------------------------------");
        System.out.println(navigableMap.lowerKey("Lukman"));
        System.out.println(navigableMap.higherKey("Lukman"));

        System.out.println("\n----------------------------------------");
        NavigableMap<String, String> mapDesc = navigableMap.descendingMap();

        for (var key : mapDesc.keySet()) {
            System.out.println(key);
        }

        NavigableMap<String, String> empty = Collections.emptyNavigableMap();
        NavigableMap<String, String> immutable = Collections.unmodifiableNavigableMap(mapDesc);
//        immutable.put("tes", "tes"); // ERROR karena immutable
    }
}
