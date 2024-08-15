package dev.lukmann.application;

import dev.lukmann.data.Animal;
import dev.lukmann.data.Cat;

public class AnimalApp {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.name = "Kitten";
        cat.run();
    }
}
