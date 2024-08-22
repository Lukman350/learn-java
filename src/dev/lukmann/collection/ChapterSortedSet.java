package dev.lukmann.collection;

import dev.lukmann.data.Person;
import dev.lukmann.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ChapterSortedSet {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<>(new PersonComparator());

        people.add(new Person("Lukman"));
        people.add(new Person("John"));
        people.add(new Person("Doe"));

        for (var person : people) {
            System.out.println(person.getName());
        }

//        Immutable
        SortedSet<Person> personSortedSet = Collections.unmodifiableSortedSet(people);
        personSortedSet.add(new Person("Hakim")); // ERROR cannot change immutable sorted set
    }
}
