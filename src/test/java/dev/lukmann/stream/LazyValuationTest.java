package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

/*
 * NOTES:
 * Kalo method pada stream itu return type nya stream juga berarti itu lazy evaluation
 * Tapi kalo return type pada method stream nya bukan stream lagi berarti itu terminal operation
 */
public class LazyValuationTest {
    @Test
    void testIntermediateOperation() {
        List<String> names = List.of("Lukman", "Nul", "Hakim");

//        Stream ini tidak jalan karena tidak memiliki terminal operations
        names.stream()
                .map(name -> {
                    System.out.println("Changing " + name + " to uppercase...");
                    return name.toUpperCase();
                });
    }

    @Test
    void testTerminalOperation() {
        List<String> names = List.of("Lukman", "Nul", "Hakim");

//        Stream ini jalan karena memiliki terminal operations
       names.stream()
            .map(name -> {
                System.out.println("Changing " + name + " to uppercase...");
                return name.toUpperCase();
            })
           .map(upper -> {
               System.out.println("Appending Mr. to " + upper);
               return "Mr. " + upper;
            })
            .forEach(System.out::println);
    }
}
