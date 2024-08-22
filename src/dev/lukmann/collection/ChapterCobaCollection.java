package dev.lukmann.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChapterCobaCollection {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.addAll(List.of("Lukman", "Nul", "Hakim", "John", "Doe"));

        System.out.println(list);

        System.out.println("\n-----------REVERSE----------");
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("\n-----------SHUFFLE----------");
        Collections.shuffle(list);
        System.out.println(list);
    }
}
