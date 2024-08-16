package dev.lukmann.application;

import dev.lukmann.data.Product;

public class Application {
    public static void main(String[] args) {
        // toString() method override
        Product product = new Product("Macbook Pro", 900000);
        System.out.println(product);
//        product.name;
    }
}
