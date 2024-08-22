package dev.lukmann.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ChapterEntryMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("Lukman", "Lukman Value");
        map.put("Nul", "Nul Value");
        map.put("Hakim", "Hakim Value");

        Set<Map.Entry<String, String>> entries = map.entrySet();

        for (var entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
