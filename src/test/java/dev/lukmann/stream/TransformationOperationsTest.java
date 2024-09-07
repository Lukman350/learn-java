package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class TransformationOperationsTest {
    @Test
    void testMapOperation() {
//        Merubah dari suatu tipe stream menjadi bentuk tipe stream yang lain
//        String -> Integer
        List.of("Lukman", "Nul", "Hakim").stream()
                .map(name -> name.toUpperCase())
                .map(upperName -> upperName.length())
                .forEach(length -> System.out.println(length));
    }

    @Test
    void testFlatMapOperation() {
//        Merubah dari suatu data menjadi stream yg lain
        List.of("Lukman", "Nul", "Hakim").stream()
                .map(name -> name.toUpperCase())
                .flatMap(upperName -> Stream.of(upperName, upperName.length()))
                .flatMap(value -> Stream.of(value, value, value))
                .forEach(System.out::println);
    }
}
