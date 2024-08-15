package dev.lukmann.application;

import dev.lukmann.data.Avanza;
import dev.lukmann.data.Bus;
import dev.lukmann.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
        System.out.println(car.getBrand());
        System.out.println(car.isBig());

        Car bus = new Bus();
        System.out.println(bus.getTire());
        bus.drive();
        System.out.println(bus.getBrand());
        System.out.println(bus.isBig());
    }
}
