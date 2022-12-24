package th.go.dsd.util;

public class MyRunable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
            System.out.println("In run method");
        } catch (Exception e) {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        MyRunable myrun = new MyRunable();
        Thread thread = new Thread(myrun);
        thread.start();
        System.out.println("In main method");
    }
}
