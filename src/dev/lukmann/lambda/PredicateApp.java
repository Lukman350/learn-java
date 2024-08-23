package dev.lukmann.lambda;

import java.util.function.Predicate;

public class PredicateApp {
    public static void main(String[] args) {
        Predicate<String> predicate = s -> s.isBlank();

        boolean isBlank = predicate.test("");
        boolean isNotBlank = predicate.test("Lukman");

        System.out.println(isBlank);
        System.out.println(isNotBlank);
    }
}
