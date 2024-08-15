public class Main {
    public static void main(String[] args) {
//        var person1 = new Person("Lukman", "East Jakarta");
//        // person1.country = "Amerika"; // Tidak bisa dideklarasikan karena menggunakan keyword final
//        System.out.println(person1.name);
//        System.out.println(person1.address);
//        System.out.println(person1.country);
//
//        person1.sayHello("Budi");
//
//        var person2 = new Person("John Doe");
//        person2.sayHello("Heri");

        // Constructor Overloading, this keyword, variable shadowing
//        var person3 = new Person();
//        person3.sayHello("Doe"); // Hello Doe, My name is null (field name belum dideklarasikan nilai default: null)
//        person3.name = "Michael";
//        person3.sayHello("John");
//        person3.sayHello();

//      Inheritance / Pewarisan
//        var manager = new Manager("Michael");
//        manager.sayHello("Hakim");
//
//        var president = new VicePresident("John Doe");
//        president.sayHello("Lukman");

        // Super Keyword
//        var rectangle = new Rectangle();
//        System.out.println(rectangle.getCorner());
//        System.out.println(rectangle.getParentCorner());

        // Polymorphism (Perubahan bentuk dari satu bentuk ke bentuk yang lain)
//        Employee employee = new Employee("Lukman");
//        employee.sayHello("John Doe");
//
//        employee = new Manager("Lukman");
//        employee.sayHello("John Doe");
//
//        employee = new VicePresident("Lukman");
//        employee.sayHello("John Doe");

//        sayHello(new Employee("Lukman"));
//        sayHello(new Manager("Lukman"));
//        sayHello(new VicePresident("Lukman"));

//        Variable Hiding
//        Child child = new Child();
//        child.doIt();
//        System.out.println(child.name);
//
//        Parent parent = child;
//        parent.doIt();
//        System.out.println(parent.name);
    }

    // Polymorphism
//    static void sayHello(Employee employee) {
//        employee.sayHello("John Doe");
//    }

//    Type check & casts
//    static void sayHello(Employee employee) {
//        if (employee instanceof VicePresident) {
//            VicePresident vp = (VicePresident) employee;
//            System.out.println("Hello Vice President " + vp.name);
//        } else if (employee instanceof Manager) {
//            Manager manager = (Manager) employee;
//            System.out.println("Hello Manager " + manager.name);
//        } else {
//            System.out.println("Hello Employee " + employee.name);
//        }
//    }
}