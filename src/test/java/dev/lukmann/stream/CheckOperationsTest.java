package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class CheckOperationsTest {
    @Test
    void testAnyMatchOperation() {
//        jika ada satu data yang sesuai dengan kondisinya maka nilainya true (data ga sesuai kondisi nilainya false)
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        boolean anyMatch = names.stream()
                .anyMatch(name -> name.length() >= 6);

        System.out.println(anyMatch);
    }

    @Test
    void testAllMatchOperation() {
//        jika semua data sesuai dengan kondisinya maka nilainya true (data ga sesuai kondisi nilainya false)
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        boolean allMatch = names.stream()
                .allMatch(name -> name.length() >= 3);

        System.out.println(allMatch);
    }

    @Test
    void testNoneMatchOperation() {
//        jika semua data tidak sesuai dengan kondisinya (ga match) maka nilainya true (data sesuai kondisi (match) nilainya false)
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        boolean noneMatch = names.stream()
                .noneMatch(name -> name.length() >= 10);

        System.out.println(noneMatch);
    }
}
