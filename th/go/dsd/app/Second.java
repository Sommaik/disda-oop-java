package th.go.dsd.app;

import java.util.List;
import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        MyClass obj = new MyClass(20);
        obj.getAge();

        // object 2
        MyClass obj2 = new MyClass(46);
        obj2.getAge();

        // object 3
        MyClass obj3 = new MyClass(24, "John");
        obj3.getAge();

        ArrayList<MyClass> ls = new ArrayList<>();
        ls.add(obj);
        ls.add(obj2);
        ls.add(obj3);
        ls.size();

    }
}

// java Second