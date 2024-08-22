package dev.lukmann.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public class ChapterList {

    private static List<String> links;

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        links = new LinkedList<>();

        names.add("Lukman");
        names.add("Nul");
        names.set(0, "Hakim");
        names.remove(1);
        System.out.println(names.get(0));

        for (String name : names) {
            System.out.println(name);
        }

        links.add("John");
        links.add("Doe");
        links.remove(1);

        for (String link : links) {
            System.out.println(link);
        }
    }
}
