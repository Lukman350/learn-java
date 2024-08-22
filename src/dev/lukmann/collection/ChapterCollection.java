package dev.lukmann.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ChapterCollection {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("Lukman");
        collection.add("Nul");
        collection.add("Hakim");
        collection.addAll(List.of("Belajar", "Java", "Collection"));

        for (String item : collection) {
            System.out.println(item);
        }

        System.out.println("Removing now...");
        collection.remove("Lukman");
        collection.removeAll(List.of("Belajar", "Collection"));

        for (String item : collection) {
            System.out.println(item);
        }

        System.out.println(collection.contains("Java"));
        System.out.println(collection.containsAll(List.of("Hakim", "Nul")));
    }
}
