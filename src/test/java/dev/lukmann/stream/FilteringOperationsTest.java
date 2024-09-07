package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class FilteringOperationsTest {
    @Test
    void testFilter() {
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");
        names.stream()
                .filter(name -> name.length() > 4)
                .forEach(System.out::println);

        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        numbers.stream()
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println);

    }

    @Test
    void testDistinct() {
//        menghapus data yg duplikat
        List<String> names = List.of("Lukman", "Hakim", "Hakim", "Michael", "Doe", "John", "Doe");
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
