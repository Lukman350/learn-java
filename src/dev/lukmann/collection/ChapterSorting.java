package dev.lukmann.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ChapterSorting {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.addAll(List.of("Lukman", "Nul", "Hakim", "John", "Doe"));

        Collections.sort(list);

        for (var value : list) {
            System.out.println(value);
        }

//        Descending

        System.out.println("\n------------DESCENDING------------");
        Comparator<String> comparator = Comparator.reverseOrder();
        Collections.sort(list, comparator);

        for (var value : list) {
            System.out.println(value);
        }
    }
}
