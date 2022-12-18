package th.go.dsd.app;

import th.go.dsd.util.CallParam;

public class Application {
    public static void main(String[] args) {
        CallParam cmd1 = new CallParam(args);
        System.out.println(cmd1.getCommand());
        System.out.println(cmd1.getSubCommand());
        for (String option : cmd1.getOptions()) {
            System.out.println(option);
        }
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
