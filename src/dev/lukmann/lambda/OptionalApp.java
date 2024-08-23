package dev.lukmann.lambda;

import java.util.Optional;

public class OptionalApp {
    public static void main(String[] args) {
        sayHelloNullable("Lukman");
        sayHelloNullable(null);
    }

    public static void sayHello(String name) {
//        kalo cek pake if
        if (name != null) {
            String upper = name.toUpperCase();
            System.out.println("HELLO " + upper);
        }
    }

    public static void sayHelloNullable(String name) {
        Optional<String> optionalName = Optional.ofNullable(name);

        Optional<String> optionalNameUpper = optionalName.map(value -> value.toUpperCase());

        optionalNameUpper.ifPresent(value -> System.out.println("HELLO " + value));

//        Simplified
//        Optional.ofNullable(name)
//                .map(String::toUpperCase)
//                .ifPresentOrElse(
//                        value -> System.out.println("HELLO " + value),
//                        () -> System.out.println("HELLO")
//                );
            String upperName = Optional.ofNullable(name)
                .map(String::toUpperCase)
                .orElse("TEMAN");

        System.out.println("HELLO " + upperName);
    }
}
