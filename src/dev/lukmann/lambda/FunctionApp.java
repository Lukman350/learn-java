package dev.lukmann.lambda;

import java.util.function.Function;

public class FunctionApp {
    public static void main(String[] args) {
        Function<String, Integer> length = s -> s.length();

        System.out.println(length.apply("Lukman"));
    }
}
