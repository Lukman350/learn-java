package dev.lukmann.application;

public class EqualsApp {
    public static void main(String[] args) {
        // equals() method override

        String first = "Lukman";
        first = first + " Hakim";

        System.out.println(first);

        String second = "Lukman Hakim";

        System.out.println(second);

        System.out.println(first == second);

        String third = "Lukman Hakim";

        System.out.println(second == third);
        System.out.println(first.equals(second));
        System.out.println(second.equals(third));
    }
}
