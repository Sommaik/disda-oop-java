package th.go.dsd.util;

import java.util.Scanner;

public class MyInput implements AppRunner {

    @Override
    public CallResponse runCommand(CallParam param) {
        CallResponse re = new CallResponse();
        switch (param.getSubCommand()) {
            case "info":
                Scanner sc = new Scanner(System.in);
                System.out.println("Your name: ");
                String name = sc.nextLine();
                System.out.println("Age: ");
                int age = sc.nextInt();
                String respText = "Hello " + name + ", age =" + age;
                re.setValue(respText);
                sc.close();
                break;
        }
        return re;
    }

}
// javac th/go/dsd/util/MyInput.java
// java th.go.dsd.util.MyInput

// Case 1
// java th.go.dsd.app.Application myinput info
// output :
// Your Name:
// Age :
// Hello -- , age = xx