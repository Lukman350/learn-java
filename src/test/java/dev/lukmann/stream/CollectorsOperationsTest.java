package dev.lukmann.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsOperationsTest {

    Stream<String> getStream() {
        return Stream.of("Lukman", "Nul", "Hakim", "Michael", "Ronaldo", "John", "Doe");
    }

    Stream<Integer> getStream2() {
        return Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    }

    @Test
    void testCollection() {
        Set<String> toSet = getStream().collect(Collectors.toSet());
        System.out.println(toSet);
        Set<String> toImmutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(toImmutableSet);

        List<String> toList = getStream().collect(Collectors.toList());
        System.out.println(toList);
        List<String> toImmutableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(toImmutableList);
    }

    @Test
    void testCollectorsMap() {
        Map<String, Integer> map = getStream().collect(Collectors.toMap(
            name -> name,
            name -> name.length()
        ));

        System.out.println(map);
    }

    @Test
    void testCollectorsGroupingBy() {
        Map<String, List<Integer>> collect = getStream2()
            .collect(Collectors.groupingBy(number -> number > 5 ? "Besar" : "Kecil"));

        System.out.println(collect);
    }

    @Test
    void testCollectorsGroupingBy2() {
        Map<String, List<String>> collect = getStream()
            .collect(Collectors.groupingBy(name -> name.length() > 5 ? "Panjang" : "Pendek"));

        System.out.println(collect);
    }

    @Test
    void testCollectorsPartitionBy() {
        Map<Boolean, List<Integer>> collect = getStream2()
            .collect(Collectors.partitioningBy(number -> number > 5));

        System.out.println(collect);
    }

    @Test
    void testCollectorsPartitionBy2() {
        Map<Boolean, List<String >> collect = getStream()
            .collect(Collectors.partitioningBy(name -> name.length() > 5));

        System.out.println(collect);
    }
}
