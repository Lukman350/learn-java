package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamPipelineTest {
    @Test
    void testStreamPipeline() {
//        Jarang digunakan cara seperti ini:
        List<String> names = List.of("Lukman", "Nul", "Hakim");
        Stream<String> namesStream = names.stream();
        Stream<String> namesUpper = namesStream.map(name -> name.toUpperCase());
        Stream<String> namesMr = namesUpper.map(upperCase -> "Mr. " + upperCase);

        namesMr.forEach(System.out::println);
    }

    @Test
    void testStreamPipelineOk() {
        List<String> names = List.of("Lukman", "Nul", "Hakim");

        names.stream()
                .map(String::toUpperCase)
                .map(upperCase -> "Mr. " + upperCase)
                .forEach(System.out::println);
    }
}
