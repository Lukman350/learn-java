package dev.lukmann.application;

import dev.lukmann.data.City;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // error cannot instantiated abstract class
        var city = new City();
        city.name = "Jakarta";
        System.out.println(city.name);
    }
}
