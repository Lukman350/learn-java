package dev.lukmann.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class MapForEachApp {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("first_name", "Lukman");
        map.put("middle_name", "Nul");
        map.put("last_name", "Hakim");

//        for loop
        for (var name : map.entrySet()) {
            System.out.println(name.getKey() + " : " + name.getValue());
        }

//        Anon class
        map.forEach(new BiConsumer<String, String>() {
            @Override
            public void accept(String key, String value) {
                System.out.println(key + " : " + value);
            }
        });

//        lambda
        map.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}
