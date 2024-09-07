package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class OrderingOperationsTest {
    @Test
    void testSortedOperation() {
//        data otomatis di sorting (kalo mau custom pake comparator)
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        names.stream()
                .sorted()
                .forEach(System.out::println);
    }

    @Test
    void testSortedWithComparator() {
        Comparator<String> reverseComparator = Comparator.reverseOrder();
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        names.stream()
                .sorted(reverseComparator)
                .forEach(System.out::println);
    }
}
