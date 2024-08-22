package dev.lukmann.collection;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class ChapterNavigableSet {
    public static void main(String[] args) {
        NavigableSet<String> navigableNames = new TreeSet<>();
        navigableNames.addAll(Set.of("Lukman", "Hakim", "John", "Doe"));

        NavigableSet<String> namesReverse = navigableNames.descendingSet();

        for (var name : navigableNames) {
            System.out.println(name);
        }

        System.out.println("\nReversed.....");

        for (var name : namesReverse) {
            System.out.println(name);
        }

        System.out.println("\nHeadSet.....");

        NavigableSet<String> hakim = navigableNames.headSet("Hakim", true);

        for (var name : hakim) {
            System.out.println(name);
        }

        System.out.println("\nTailSet.....");

        NavigableSet<String> john = navigableNames.tailSet("John", true);

        for (var name : john) {
            System.out.println(name);
        }

        System.out.println("\nImmutable NavigableSet.....");

        NavigableSet<String> immutable = Collections.unmodifiableNavigableSet(navigableNames);
        immutable.add("Oops..."); // ERROR Cannot change immutable set
    }
}
