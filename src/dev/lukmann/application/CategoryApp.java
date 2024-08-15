package dev.lukmann.application;

import dev.lukmann.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        Category category = new Category();

        category.setId("7891498");
        category.setExpensive(true);

        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
