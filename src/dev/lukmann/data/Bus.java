package dev.lukmann.data;

public class Bus implements Car {
    public void drive() {
        System.out.println("Bus is driving");
    }

    public int getTire() {
        return 8;
    }

    public boolean isMaintenance() {
        return false;
    }

    public String getBrand() {
        return "HINO";
    }

    public boolean isBig() {
        return true;
    }
}
