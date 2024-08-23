package dev.lukmann.lambda;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Lukman";

        System.out.println(supplier.get());
    }
}
