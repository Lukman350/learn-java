package dev.lukmann.lambda;

public class SimpleActionApp {
    public static void main(String[] args) {
//        SimpleAction simpleAction = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Lukman";
//            }
//        };
//
//        System.out.println(simpleAction.action("Lukman"));
//
//        SimpleAction simpleAction1 = (String name) -> {
//            return "Lukman";
//        };
//
//        System.out.println(simpleAction1.action("John"));

        SimpleAction simpleAction2 = (String name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction3 = (name) -> {
            return "Hello " + name;
        };

        SimpleAction simpleAction4 = (name) -> "Hello " + name;
        SimpleAction simpleAction5 = name -> "Hello " + name;
    }
}
