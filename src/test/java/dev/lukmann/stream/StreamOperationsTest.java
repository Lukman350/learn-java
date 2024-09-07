package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationsTest {
    @Test
    void testMapStream() {
        List<String> names = List.of("Lukman", "Nul", "Hakim");
        Stream<String> streamNames = names.stream();

        // Tidak mengubah data aslinya melainkan membuat data baru
        Stream<String> uppercaseStream = streamNames.map(name -> name.toUpperCase());
        // Data berubah jadi uppercase dan menjadi data yg baru
        uppercaseStream.forEach(System.out::println);

        // Data asli tidak berubah
        names.forEach(System.out::println);
    }
}
