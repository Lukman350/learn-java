package dev.lukmann.application;

import dev.lukmann.data.Product;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Macbook Pro", 9000000);
        System.out.println(product.toString());
        Product product2 = new Product("Macbook Pro", 9000000);

        System.out.println(product.equals(product2));
        System.out.println(product.hashCode() == product2.hashCode());
    }
}
