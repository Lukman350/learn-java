package dev.lukmann.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIfApp {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(List.of("Lukman", "Nul", "Hakim"));

//        For Loop (problem)
//        for (var name : names) if (name.length() >= 5) {
//            names.remove(name);
//        }

//        Anon class
        names.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() >= 5;
            }
        });

//        Lambda
        names.removeIf(name -> name.length() >= 5);

        System.out.println(names);
    }
}
