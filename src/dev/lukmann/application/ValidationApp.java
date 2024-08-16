package dev.lukmann.application;

import dev.lukmann.data.LoginRequest;
import dev.lukmann.exception.ValidationException;
import dev.lukmann.util.ValidationUtil;

public class ValidationApp {
    public static void main(String[] args) {
        // Exception
        LoginRequest loginRequest = new LoginRequest("iajdoas", "ajhsdbjahsd");

        try {
            ValidationUtil.validate(loginRequest);
        } catch (ValidationException | NullPointerException error) {
            if (error instanceof NullPointerException exception) {
                System.out.println("NullPointerException(Message: " + exception.getMessage() + ")");
            } else {
                ValidationException exception = (ValidationException) error;
                System.out.println("ValidationException(code: " + exception.getCode() + ", Message: " + exception.getMessage() + ")");
            }
        } finally {
            System.out.println("Selalu dieksekusi");
        }

        LoginRequest loginRequest1 = new LoginRequest("asda", "asdhnjasdasd");

        ValidationUtil.validateRuntime(loginRequest1);
        System.out.println("Sukses");
    }
}
