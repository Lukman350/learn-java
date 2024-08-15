class Parent {
    String name;

    void doIt() {
        System.out.println("Do it parent");
    }
}

class Child extends Parent {
    void doIt() {
        System.out.println("Do it child");
        System.out.println("Parent name is " + super.name);
    }
}
