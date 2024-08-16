package dev.lukmann.data;

public record LoginRequest(String username, String password) {
    public LoginRequest {
        System.out.println("LoginRequest Object created");
    }

//    Constructor Overloading

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }
}
