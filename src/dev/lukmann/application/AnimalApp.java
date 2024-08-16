package dev.lukmann.application;

import dev.lukmann.annotation.Fancy;
import dev.lukmann.data.Animal;
import dev.lukmann.data.Cat;

// Annotation
@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] args) {
        // Abstract class & Polymorphism

        Animal cat = new Cat();
        cat.name = "Kitten";
        cat.run();
    }
}
