package th.go.dsd.util;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class MyLambda {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(3);
        myList.add(5);
        myList.add(8);

        Consumer<Integer> meth = (a) -> {
            System.out.println(a);
        };
        myList.forEach(meth);
    }
}
