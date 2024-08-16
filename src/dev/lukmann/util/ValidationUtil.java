package dev.lukmann.util;

import dev.lukmann.annotation.NotBlank;
import dev.lukmann.data.LoginRequest;
import dev.lukmann.exception.BlankException;
import dev.lukmann.exception.ValidationCode;
import dev.lukmann.exception.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    public static void validate(LoginRequest loginRequest) throws ValidationException {
        if ((loginRequest.username() == null || loginRequest.password() == null)
                || (loginRequest.username().isBlank() || loginRequest.password().isBlank())) {
            throw new ValidationException(ValidationCode.FIELD_IS_REQUIRED, "Username or Password is required");
        } else if (loginRequest.username().matches("/^[A-Za-z]+$/")) {
            throw new ValidationException(ValidationCode.FORMAT_ERROR, "Username must be alphabetical characters only");
        } else if (loginRequest.password().length() < 8) {
            throw new ValidationException(ValidationCode.DOESNT_MEET_REQUIREMENTS, "Password must be at least 8 characters long");
        }
    }

    public static void validateRuntime(LoginRequest loginRequest) {
        if ((loginRequest.username() == null || loginRequest.password() == null)
                || (loginRequest.username().isBlank() || loginRequest.password().isBlank())) {
            throw new BlankException("Username or Password is required");
        } else if (loginRequest.username().matches("/^[A-Za-z]+$/")) {
            throw new BlankException("Username must be alphabetical characters only");
        } else if (loginRequest.password().length() < 8) {
            throw new BlankException("Password must be at least 8 characters long");
        }
    }

    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        Field[] fields = aClass.getDeclaredFields();

        for (Field field : fields) {
            field.setAccessible(true);

            if (field.getAnnotation(NotBlank.class) != null) {
                try {
                    String value = (String) field.get(object);

                    if (value == null || value.isBlank()) {
                        throw new ValidationException(ValidationCode.FIELD_IS_REQUIRED, "Field " + field.getName() + " cannot be blank or null");
                    }
                } catch (IllegalAccessException exception) {
                    System.out.println("Tidak bisa mengakses field " + field.getName());
                } catch (ValidationException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
