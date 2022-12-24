package th.go.dsd.util;

public class Parent {
    String name = "Pa";

    public String sayHello() {
        return "Hello World";
    }

    public String sayHello(String name) {
        return "Hello " + name;
    }

    public String sayHello(String name, String lastName) {
        return "Hello " + name + " " + lastName;
    }
}
