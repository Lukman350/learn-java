package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamTest {
    @Test
    void testCreateEmptyOrSingleStream() {
        Stream<String> emptyStream = Stream.empty();
        Stream<String> oneStream = Stream.of("Lukman");
        Stream<String> nullableStream = Stream.ofNullable(null);
    }

    @Test
    void testCreateStreamFromArray() {
        Stream<String> arrayStream = Stream.of("Lukman", "Nul", "Hakim");
        arrayStream.forEach(System.out::println);

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7,8,9,10);
        integerStream.forEach(System.out::println);

        String[] array = new String[] {
                "Lukman", "Nul", "Hakim"
        };
        Stream<String> streamFromArray = Arrays.stream(array);
        streamFromArray.forEach(System.out::println);
    }

    @Test
    void testCreateStreamFromCollection() {
        Collection<String> names = List.of("Lukman", "Nul", "Hakim");
        Stream<String> namesStream = names.stream();
        namesStream.forEach(System.out::println);

//        Data tidak bisa dialirkan lagi / hanya dapat dialirkan sekali, buat stream baru jika ingin mengalirkan lagi
//        namesStream.forEach(System.out::println);
    }

    @Test
    void testCreateInfiniteStream() {
        Stream<String> stream = Stream.generate(() -> "John Doe");
//        Data mengalir terus menerus
//        stream.forEach(System.out::println);

        Stream<Integer> iterate = Stream.iterate(1, value -> value + 1);
        // 1,2,3,4,5 ... dst mengalir terus menerus
//        iterate.forEach(System.out::println);
    }
}
