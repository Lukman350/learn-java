package dev.lukmann.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ChapterImmutableMap {
    public static void main(String[] args) {
        Map<String, String> empty = Collections.emptyMap();
        Map<String, String> singleton = Collections.singletonMap("name", "Lukman");

        Map<String, String> mutable = new HashMap<>();
        mutable.put("name", "Lukman");
        Map<String, String> immutable = Collections.unmodifiableMap(mutable);
//        immutable.put("middle", "Hakim"); // cannot change (immutable)

//        another way to define immutable
        Map<String, String> mapImmutable = Map.of(
                "first", "Lukman",
                "middle", "Nul",
                "last", "Hakim"
        );
//        mapImmutable.put("name", "Lukman Nul Hakim"); // cannot change (immutable)
    }
}
