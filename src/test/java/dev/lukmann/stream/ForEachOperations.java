package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

public class ForEachOperations {
    @Test
    void testPeekBeforeOperation() {
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        names.stream()
                .map(name -> {
                    System.out.println("Before Name: " + name);
                    String upperName = name.toUpperCase();
                    System.out.println("After Uppercasing name: " + upperName);
                    return upperName;
                })
                .forEach(finalName -> System.out.println("Final name: " + finalName));
    }

    @Test
    void testPeekAfterOperation() {
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        names.stream()
                .peek(name -> System.out.println("Before Name: " + name))
                .map(name -> name.toUpperCase())
                .peek(upperName -> System.out.println("After Uppercasing name: " + upperName))
                .forEach(finalName -> System.out.println("Final name: " + finalName));
    }
}
