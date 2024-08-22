package dev.lukmann.collection;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class ChapterSet {
    public static void main(String[] args) {

//        Data tidak bisa duplikat / data harus unique
        // HashSet data tidak ber-urutan
        Set<String> names = new HashSet<>();
        names.add("Lukman");
        names.add("Nul");
        names.add("Hakim");
        names.add("Lukman");

        for (String name : names) {
            System.out.println(name);
        }

//      LinkedHashSet data ber-urutan
        Set<String> namesLink = new LinkedHashSet<>();
        namesLink.add("John");
        namesLink.add("Doe");
        namesLink.add("Doe");

        for (String nameL : namesLink) {
            System.out.println(nameL);
        }

//      EnumSet
        EnumSet<Gender> genderEnumSet = EnumSet.allOf(Gender.class);
//        EnumSet<Gender> genderEnumSet = EnumSet.of(Gender.MALE, Gender.FEMALE);

        for (var gender : genderEnumSet) {
            System.out.println(gender);
        }
    }

    public static enum Gender {
        MALE, FEMALE, NOT_MENTION
    }
}
