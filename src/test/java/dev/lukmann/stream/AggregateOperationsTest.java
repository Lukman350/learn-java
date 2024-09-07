package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.List;

public class AggregateOperationsTest {
    @Test
    void testMaxOperation() {
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        // natural order = ASCENDING order
        names.stream()
                .max(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testMinOperation() {
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        // natural order = ASCENDING order
        names.stream()
                .min(Comparator.naturalOrder())
                .ifPresent(System.out::println);
    }

    @Test
    void testCountOperation() {
//        hitung total data
        List<String> names = List.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");

        long count = names.stream()
                .count();

        System.out.println(count);
    }

    @Test
    void testReduceOperation() {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Integer result = numbers.stream()
                .reduce(0, (value, item) -> value + item);

        System.out.println(result);

//        0
//        iterasi 1. value=0 item=1 = 1
//        iterasi 2. value=1 item=2 = 3
//        iterasi 3. value=3 item=3 = 6
//        iterasi 4. value=6 item=4 = 10
//        iterasi 5. value=10 item=5 = 15
    }

    @Test
    void testReduceFactorial() {
        List<Integer> numbers = List.of(1,2,3,4,5);
        Integer factorial = numbers.stream()
                .reduce(1, (value, item) -> value * item);

        System.out.println(factorial);

        //        1
//        iterasi 1. value=1 item=1 = 1
//        iterasi 2. value=1 item=2 = 2
//        iterasi 3. value=2 item=3 = 6
//        iterasi 4. value=6 item=4 = 24
//        iterasi 5. value=24 item=5 = 120
    }
}
