package th.go.dsd.util;

public class Child extends Parent {

    @Override
    public String sayHello() {
        String n = super.name;
        String h = super.sayHello();
        return n + h + " Hello From Child";
    }

    public String sayHi() {
        return "Hi";
    }

    public static void main(String[] args) {
        Child c = new Child();
        System.out.println(c.sayHello());
        Parent p = new Parent();
        p.sayHello();
    }
}
