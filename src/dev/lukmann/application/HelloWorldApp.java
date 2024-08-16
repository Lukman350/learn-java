package dev.lukmann.application;

import dev.lukmann.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {
        // Anonymous Class
        HelloWorld helloWorld = new HelloWorld() {
            public void sayHello() {
                System.out.println("Hello world!");
            }

            public void sayHello(String name) {
                System.out.println("Hello " + name + " from world!");
            }
        };

        helloWorld.sayHello();
        helloWorld.sayHello("Lukman");
    }
}
