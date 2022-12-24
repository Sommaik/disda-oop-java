package th.go.dsd.util;

public class MyException {

    void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access Denied");
        } else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        try {
            MyException my = new MyException();
            my.checkAge(25);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }

}

// try {
// int[] myNumbers = { 1, 2, 3 };
// System.out.println(myNumbers[10]);
// } catch (IndexOutOfBoundsException ie) {
// System.out.println("Index error");
// } catch (Exception e) {
// e.printStackTrace();
// System.out.println("Error !!!");
// } finally {
// System.out.println("Finally Step");
// }