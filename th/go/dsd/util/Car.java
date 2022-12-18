package th.go.dsd.util;

public class Car extends Vehicle {
    private String modelName = "Mustang";

    public String getModelName() {
        return this.modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getBrand() {
        return this.brand;
    }

    public void honk() {
        super.honk();
        System.out.println("Car Beep Beep !!");
    }

    public String getInfo() {
        return this.modelName;
    }

    public String sayHi() {
        return "Hello";
    }

}
