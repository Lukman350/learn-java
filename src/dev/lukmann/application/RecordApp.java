package dev.lukmann.application;

import dev.lukmann.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        // Record Class (Min java version: 14 first introduced Java 16 is production ready)

        LoginRequest loginRequest = new LoginRequest("Lukman", "Hello@World*123");

        System.out.println(loginRequest);
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

//        Constructor Overloading
        System.out.println(new LoginRequest());
        System.out.println(new LoginRequest("Lukman"));
        System.out.println(new LoginRequest("Lukman", "Hello@World*123"));
    }
}
