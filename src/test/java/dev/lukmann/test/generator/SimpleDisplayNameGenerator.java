package dev.lukmann.test.generator;

import org.junit.jupiter.api.DisplayNameGenerator;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.ArrayList;
import java.util.List;

public class SimpleDisplayNameGenerator implements DisplayNameGenerator {

    @Override
    public String generateDisplayNameForClass(Class<?> testClass) {
        return "Test" + testClass.getSimpleName();
    }

    @Override
    public String generateDisplayNameForMethod(Class<?> testClass, Method testMethod) {
        Parameter[] parameters = testMethod.getParameters();
        List<String> params = new ArrayList<>();

        for (var parameter : parameters) {
            params.add(parameter.getType().toString());
        }

        String methodParams = String.join(",", params);

        return String.format("Test %s.%s(%s)", testClass.getSimpleName(), testMethod.getName(), methodParams);
    }

    @Override
    public String generateDisplayNameForNestedClass(Class<?> nestedClass) {
        return "";
    }
}
