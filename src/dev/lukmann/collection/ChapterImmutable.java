package dev.lukmann.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChapterImmutable {
    public static void main(String[] args) {
        List<String> one = Collections.singletonList("Satu");
        List<String> empty = Collections.emptyList();

        List<String> mutable = new ArrayList<>();
        mutable.add("Lukman");
        mutable.add("Hakim");
        List<String> immutable = Collections.unmodifiableList(mutable);

        List<String> elements = List.of("John", "Doe");
        elements.add("Michael");
        immutable.add("Michael Jordan");
    }
}
