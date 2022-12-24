package th.go.dsd.util;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
    public static void main(String[] args) {
        // String[] rawData = new String[] { "One", "Two", "Three", "One", "Two", "One"
        // };
        // Map<String, int> data = new HashMap<>();

        // for (String fff : rawData) {
        // if (data.containsKey(fff)) {
        // data.put(fff, data.get(fff) + 1);
        // } else {
        // data.put(fff, 1);
        // }
        // }

        Integer myInt = 5;
        Map<Integer, String> data = new HashMap<>();
        data.put(myInt, "Five");
        setIntVal(myInt.intValue());
    }

    static void setIntVal(int val) {

    }
}

// for (String x : data.keySet()) {
// System.out.println(x + data.get(x));
// }
// // String[] rawData = new String[] { "One", "Two", "Three", "One", "One",
// "Two"
// // };
// // Map<String, Integer> data2 = new HashMap<>();
// // for (String st : rawData) {
// // if (data2.containsKey(st)) {
// // int x = data2.get(st) + 1;
// // data2.replace(st, x);
// // } else {
// // data2.put(st, 1);
// // }
// // }
// // for (String k : data2.keySet()) {
// // System.out.print(k + "=" + data2.get(k));
// // }
// }

// public static void main(String[] args) {
// // String[] rawData = new String[] { "One", "Two", "Three", "One", "One",
// "Two"
// // };
// // HashMap<String, Integer> data = new HashMap<>();
// // for (String key : rawData) {
// // Integer value = data.get(key);
// // if (value == null)
// // data.put(key, 1);
// // else
// // data.put(key, value + 1);
// // }
// // System.out.println(data);
// // }

// String[] rawData = new String[] { "One", "Two", "Three", "One", "One", "Two"
// };

// int sum1 = 0;
// int sum2 = 0;
// int sum3 = 0;

// HashMap<String, String> data = new HashMap<>();

// for (int i = 0; i < rawData.length; i++) {
// data.put(Integer.toString(i), rawData[i]);
// }

// for (int i = 0; i < data.size(); i++) {
// String select = data.get(Integer.toString(i));

// switch (select) {
// case "One":
// sum1++;
// break;
// case "Two":
// sum2++;
// break;
// case "Three":
// sum3++;
// break;

// }

// }
// System.out.println("One = " + sum1 + " Two = " + sum2 + " Three = " + sum3);
// }
// }
