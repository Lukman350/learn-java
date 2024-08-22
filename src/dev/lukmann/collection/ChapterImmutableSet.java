package dev.lukmann.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ChapterImmutableSet {
    public static void main(String[] args) {
        Set<String> empty = Collections.emptySet();
        Set<String> one = Collections.singleton("Lukman");

        Set<String> mutable = new HashSet<>();
        mutable.add("Lukman");
        mutable.add("Nul");
        mutable.add("Hakim");
        Set<String> immutable = Collections.unmodifiableSet(mutable);

        Set<String> set = Set.of("Lukman", "Hakim");
        set.remove("Hakim"); // error
        immutable.add("John"); // ERROR
    }
}
