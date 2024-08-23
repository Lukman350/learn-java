package dev.lukmann.lambda;

import java.util.List;
import java.util.function.Consumer;

public class ForEachApp {
    public static void main(String[] args) {
        List<String> names = List.of("Lukman", "Hakim", "John", "Doe");

//        For Loop
        for (var name : names) {
            System.out.println(name);
        }

//        Foreach dengan anonclass
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name);
            }
        });

//        Lambda
        names.forEach(name -> System.out.println(name));

//        Lambda method reference
        names.forEach(System.out::println);
    }
}
