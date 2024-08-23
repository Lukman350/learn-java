package dev.lukmann.lambda;

import dev.lukmann.lambda.util.StringUtil;

import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceApp {
    public static void main(String[] args) {
//        Predicate<String> predicateIsLowerCase = (value) -> StringUtil.isLowerCase(value);
        Predicate<String> predicateIsLowerCase = StringUtil::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Lukman"));
        System.out.println(predicateIsLowerCase.test("lukman"));

//        Method Reference di Parameter
//        Function<String, String> functionUpper = value -> value.toUpperCase();
        Function<String, String> functionUpper = String::toUpperCase;

        System.out.println(functionUpper.apply("Lukman"));
    }

    public void run() {
        Predicate<String> predicateIsLowerCase = this::isLowerCase;

        System.out.println(predicateIsLowerCase.test("Lukman"));
        System.out.println(predicateIsLowerCase.test("lukman"));
    }

    public boolean isLowerCase(String value) {
        for (char c : value.toCharArray()) {
            if (!Character.isLowerCase(c)) return false;
        }

        return true;
    }
}
