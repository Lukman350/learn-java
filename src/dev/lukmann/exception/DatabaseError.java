package dev.lukmann.exception;

public class DatabaseError extends Error {
    public DatabaseError(String message) {
        super(message);
    }
}
