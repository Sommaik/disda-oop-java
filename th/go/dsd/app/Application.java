package th.go.dsd.app;

import java.util.HashMap;
import java.util.Map;

import th.go.dsd.util.AppRunner;
import th.go.dsd.util.Calc;
import th.go.dsd.util.CallParam;
import th.go.dsd.util.CallResponse;

public class Application {
    public static void main(String[] args) {
        CallParam cmd1 = new CallParam(args);
        Map<String, AppRunner> feature = new HashMap<>();
        feature.put("calc", new Calc());

        if (feature.containsKey(cmd1.getCommand())) {
            // logic here
            AppRunner cmd = feature.get(cmd1.getCommand());
            CallResponse resp = cmd.runCommand(cmd1);
            System.out.println(resp.getValue());
        } else {
            System.out.println("Not support this command " + cmd1.getCommand());
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

// Case 3
// java th.go.dsd.app.Application echo say Jame
// output : Hello Jame
