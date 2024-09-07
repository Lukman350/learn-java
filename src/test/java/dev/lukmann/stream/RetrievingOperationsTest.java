package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

public class RetrievingOperationsTest {
    @Test
    void testLimitOperation() {
//        mengambil data dari yg pertama ke n
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        names.stream()
                .limit(2)
                .forEach(System.out::println);
    }

    @Test
    void testSkipOperation() {
//        ngeskip data dari yg pertama ke n
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        names.stream()
                .skip(3)
                .forEach(System.out::println);
    }

    @Test
    void testTakeWhileOperation() {
//        Take while mengambil data ketika kondisinya true kalo false dia ga nerusin ambil
//        data seterusnya ga diambil, selama memenuhi kondisi (true) dia bakal ngambil terus, kalo ketemu false dia stop
        List<String> names = List.of("Lukman", "Hakim", "Nul", "Michael", "Ronaldo", "John", "Doe");

        names.stream()
                .takeWhile(name -> name.length() >= 4)
                .forEach(System.out::println);
    }

    @Test
    void testDropWhileOperation() {
//        Kebalikan dari takewhile
//        selama memenuhi kondisi (true) dia ga bakal ngambil datanya, kalo ketemu false (tidak memenuhi kondisi) dia bakal ambil datanya
        List<String> names = List.of("Lukman", "Hakim", "Nul", "Michael", "Ronaldo", "John", "Doe");

        names.stream()
                .dropWhile(name -> name.length() >= 4)
                .forEach(System.out::println);
    }

    @Test
    void testFindAnyOperation() {
//        memilih data secara random
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        Optional<String> data = names.stream()
                .findAny();

        data.ifPresent(System.out::println);
    }

    @Test
    void testFindFirstOperation() {
//        mengambil data yg pertama
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        Optional<String> data = names.stream()
                .findFirst();

        data.ifPresent(System.out::println);
    }
}
