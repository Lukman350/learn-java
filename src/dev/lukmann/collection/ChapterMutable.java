package dev.lukmann.collection;

import dev.lukmann.data.Person;

import java.util.List;

public class ChapterMutable {
    public static void main(String[] args) {
        Person person = new Person("Lukman");

        person.addHobby("Coding");
        person.addHobby("Gaming");

        doSomethingWithHobbies(person.getHobbies());

        for (String hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan hobby");
    }
}
