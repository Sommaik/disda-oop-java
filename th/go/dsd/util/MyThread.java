package th.go.dsd.util;

public class MyThread extends Thread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println("In main method");
        System.out.println("In main method 2");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("In thread run method");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
