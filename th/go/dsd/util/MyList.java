package th.go.dsd.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        /*
         * List<String> cars = new ArrayList<>();
         * cars.add("Ford");
         * System.out.println(cars.size()); // 1
         * System.out.println(cars.get(0)); // Ford
         * cars.set(0, "Volvo");
         * System.out.println(cars.get(0)); // Volvo
         * cars.add("Toyota");
         * System.out.println(cars.size()); // 2
         * cars.add("Honda");
         * System.out.println(cars.get(1)); // Volvo
         * cars.remove(1);
         * System.out.println(cars.size()); // 2
         * System.out.println(cars.get(1)); // Volvo ? Toyota
         * cars.clear();
         */
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(" xxx ".trim());
        Collections.sort(cars);
        for (String c : cars) {
            System.out.println(c);
        }
    }
}
