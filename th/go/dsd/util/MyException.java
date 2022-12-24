package th.go.dsd.util;

public class MyException {

    public static void main(String[] args) {
        try {
            int[] myNumbers = { 1, 2, 3 };
            System.out.println(myNumbers[10]);
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("Index error");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error !!!");
        } finally {
            System.out.println("Finally Step");
        }
    }

}
