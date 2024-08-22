package dev.lukmann.map;

import java.util.*;

public class ChapterSortedMap {
    public static void main(String[] args) {
        Comparator<String> stringComparator = Comparator.reverseOrder();

        SortedMap<String, String> sortedMap = new TreeMap<>(stringComparator);
        sortedMap.put("Lukman", "Lukman");
        sortedMap.put("Nul", "Nul");
        sortedMap.put("Hakim", "Hakim");

        for (var name : sortedMap.keySet()) {
            System.out.println(name);
        }

        SortedMap<String, String> empty = Collections.emptySortedMap();
        SortedMap<String, String> immutable = Collections.unmodifiableSortedMap(sortedMap);
//        immutable.put("tes", "tes"); // ERROR gabisa diubah
    }
}
