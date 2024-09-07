package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.stream.Stream;

public class CreateStreamBuilderTest {
    @Test
    void testCreateStreamBuilder() {
        Stream.Builder<String> builder = Stream.builder();
        builder.accept("Lukman"); // void gabisa chaining kalo lewat accept
        builder.add("Nul").add("Hakim"); // bisa chaining kalo lewat add

        Stream<String> names = builder.build();
        names.forEach(System.out::println);
    }

    @Test
    void testCreateStreamBuilderSimplified() {
        Stream<Object> builderSimplified = Stream.builder()
                .add("Lukman")
                .add("Nul")
                .add("Hakim")
                .build();

        builderSimplified.forEach(System.out::println);
    }
}
