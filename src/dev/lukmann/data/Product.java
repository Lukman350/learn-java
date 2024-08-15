package dev.lukmann.data;

import java.util.Objects;

public class Product {
    protected String name;
    protected int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Product name: " + name + ", price: " + price;
    }

//    public boolean equals(Object obj) {
//        if (obj == this)
//            return true;
//
//        if (!(obj instanceof Product))
//            return false;
//
//        Product product = (Product) obj;
//
//        if (this.price != product.price)
//            return false;
//
//        return Objects.equals(this.name, product.name);
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;
        return price == product.price && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(name);
        result = 31 * result + price;
        return result;
    }
}
