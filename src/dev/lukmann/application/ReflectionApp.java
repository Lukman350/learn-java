package dev.lukmann.application;

import dev.lukmann.data.CreateUserRequest;
import dev.lukmann.util.ValidationUtil;

public class ReflectionApp {
    public static void main(String[] args) {
        // Reflection

        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Lukman");
        request.setPassword("jasdkjasnd");

        ValidationUtil.validationReflection(request);
    }
}
