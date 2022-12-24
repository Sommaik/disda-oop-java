package th.go.dsd.util;

public class MyCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModelName("Ford");
        c.getInfo();
        Truck t = new Truck();
        t.getInfo();
    }
}
