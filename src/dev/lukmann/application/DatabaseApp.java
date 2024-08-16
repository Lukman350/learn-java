package dev.lukmann.application;

import dev.lukmann.exception.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        try {
            connectDatabase(null, "test");
        } catch (DatabaseError error) {
            System.out.println("Error: " + error.getMessage());
        }
    }

    public static void connectDatabase(String username, String password) {
        if (username == null || password == null) {
            throw new DatabaseError("Tidak bisa konek ke database");
        }
    }
}
