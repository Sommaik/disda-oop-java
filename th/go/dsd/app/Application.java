package th.go.dsd.app;

import java.util.ArrayList;

import th.go.dsd.util.Car;

public class Application {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.honk();
        System.out.println(myCar.getModelName());
    }
}

// javac th/go/dsd/app/Application.java
// java th.go.dsd.app.Application

// Case 1
// java th.go.dsd.app.Application calc add 1 2
// output : Value = 3

// Case 2
// java th.go.dsd.app.Application calc sum 1 2 4 5 6
// output : Value = 18