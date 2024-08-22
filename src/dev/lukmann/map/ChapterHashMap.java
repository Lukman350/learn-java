package dev.lukmann.map;

import java.util.HashMap;
import java.util.Map;

public class ChapterHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("name.first", "Lukman");
        map.put("name.middle", "Nul");
        map.put("name.last", "Hakim");

        System.out.println(map.get("name.first"));
        System.out.println(map.get("name.middle"));
        System.out.println(map.get("name.last"));
    }
}
