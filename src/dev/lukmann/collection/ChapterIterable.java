package dev.lukmann.collection;

import java.util.Iterator;
import java.util.List;

public class ChapterIterable {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Lukman", "Nul", "Hakim");
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("ITERATOR");
        Iterator<String> namesIterator = names.iterator();

        while (namesIterator.hasNext()) {
            String name = namesIterator.next();
            System.out.println(name);
        }
    }
}
