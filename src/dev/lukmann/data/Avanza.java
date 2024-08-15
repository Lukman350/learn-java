package dev.lukmann.data;

public class Avanza implements Car {
    public void drive() {
        System.out.println("Avanza is driving");
    }

    public int getTire() {
        return 4;
    }

    public String getBrand() {
        return "Toyota";
    }

    public boolean isMaintenance() {
        return false;
    }
}
