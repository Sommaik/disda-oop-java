package th.go.dsd.app;

import th.go.dsd.util.OuterClass;

class Main {

    enum Level {
        LOW,
        MEDIUM,
        HEIGHT
    }

    enum Status {
        ACTIVE,
        INACTIVE
    }

    public static void main(String[] args) {

        OuterClass oc = new OuterClass();
        OuterClass.InnerClass ic = oc.new InnerClass();

        // Status s = Status.ACTIVE;

        // if (s == Status.ACTIVE) {
        // System.out.println(s);
        // }

        // for (Status a : Status.values()) {
        // System.out.println(a);
        // }

        // int myInt = 9;
        // double myDouble = myInt;

        // System.out.println(myInt);
        // System.out.println(myDouble);

        // double myDouble2 = 9.78d;
        // int myInt2 = (int) myDouble2;

        // System.out.println(myInt2);
        // System.out.println(myDouble2);

        // String greeting = "Hello World";
        // int len = greeting.length();
        // System.out.println(len);
        // System.out.println(greeting.toUpperCase());
        // System.out.println(greeting.toLowerCase());
        // int idx = greeting.indexOf("He");
        // System.out.println(idx); // 0 or 1 or 2
        // int dIdx = greeting.indexOf("d");
        // System.out.println(dIdx); // 10 or 11

        // String firstName = "John";
        // String lastName = "Doe";

        // System.out.println(firstName + " " + lastName);
        // System.out.println(firstName.concat(" ").concat(lastName));
        // System.out.println(firstName.concat(" " + lastName));
        // System.out.println(firstName.concat(" ".concat(lastName)));

        // String spc = "My name is \"Sommai.k\" \n Line 2. \n";
        // System.out.print(spc);

        // int vMax = Math.max(10, 20);
        // System.out.println(vMax);

        // int vMin = Math.min(10, 20);
        // System.out.println(vMin);

        // double vPow = Math.pow(3, 2);
        // System.out.println(vPow);

        // double vSqr = Math.sqrt(25);
        // System.out.println(vSqr);

        // int vAbs = Math.abs(-198);
        // System.out.println(vAbs);

        // int vRand = (int) (Math.random() * 101); // 0 - 100
        // System.out.println(vRand);

        int age = 18;
        int height = 180;

        // if (age > 18 && height < 190) {
        // System.out.println("Too old");
        // } else if (age == 18) {
        // System.out.println("Teenage");
        // } else {
        // System.out.println("Too young");
        // }
        // String msg = age > 18 ? "Too old" : "Too young";

        // System.out.println(msg);

        // int dow = 0;
        // switch (dow) {
        // case 0:
        // System.out.println("Sunday");
        // System.out.println("Good Day");
        // break;
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tueday");
        // break;
        // default:
        // System.out.println("Anotherday");
        // }

        // for (int i = 0; i < 10; i++) {
        // System.out.println("Value = " + i);
        // }

        // int a = 0;
        // while (a < 2) {
        // System.out.println("Value = " + a);
        // // a = 10;
        // a++;
        // // a +=1;
        // // a = a + 1;

        // // a += 2;
        // // a = a + 2;
        // }

        // for (int i = 0; i < 10; i++) {
        // for (int j = 0; j < 10; j++) {
        // System.out.println(i + j);
        // }
        // }

        // for (String a : args) {
        // System.out.println("Value = " + a);
        // }

        // int i = 0;
        // while (i < 10) {
        // i++;
        // if (i == 4) {
        // continue;
        // }
        // System.out.println("Value = " + i);
        // }

        // String[] cars = { "Volvo", "BMW", "Ford", "Mazda", "1", "2" };
        // System.out.println(cars.length); // 6
        // System.out.println(cars[0]); // Volvo
        // System.out.println(cars[5]); // 2
        // // System.out.println(cars[6]); // ??

        // int[] grade = { 1, 2, 3, 4 };
        // grade[2] = 89;
        // for (int g : grade) {
        // System.out.println("Value = " + g);
        // }
        // // 1 2 89 4

        int[][] mynum = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(mynum.length); // 2 or 3 or 6
        System.out.println(mynum[0].length); // 3 or 2
        System.out.println(mynum[1][1]); // 5
        System.out.println(mynum[0][2]); // 3
        mynum[0][1] = 43;
        for (int i = 0; i < mynum.length; i++) {
            for (int j = 0; j < mynum[i].length; j++) {
                System.out.println("Value = " + mynum[i][j]);
            }
        }

        // display data from mynum using for each.

        for (int[] nums : mynum) {
            for (int num : nums) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }

        int[][] array2D = { { 1, 2, 3, 4 }, { 5, 6, 7 }, { 8, 9, 22 }, { 22, 33, 44, 55 } };

        // System.out.println(Array2D.length);

        for (int[] i : array2D) {
            for (int j : i) {
                System.out.println("Values of " + j);
            }
        }

        int[][] arrNum = { { 1, 2, 3 }, { 4, 5, 6 } };
        System.out.println(arrNum.length);
        System.out.println(arrNum[0].length);
        System.out.println(arrNum[1][1]);

        // show elements in 2D array with for each loop
        for (int[] row : arrNum) {
            for (int element : row) {
                System.out.println(element);
            }
        }
    }
}