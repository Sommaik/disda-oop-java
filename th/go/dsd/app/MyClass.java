package th.go.dsd.app;

public class MyClass {

    private int age = 18;
    private String name = "";

    MyClass(int age) {
        System.out.println("in constructor");
        this.age = age;
    }

    MyClass(int age, String name) {
        this.age = age;
        this.name = name;
    }

    MyClass() {

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
